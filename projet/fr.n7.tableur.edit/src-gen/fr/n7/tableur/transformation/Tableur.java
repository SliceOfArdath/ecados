package fr.n7.tableur.transformation;


import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.n7.tableur.*;
import fr.n7.tableur.transformation.CustomExceptions.*;


public class Tableur {
	
	Map<String, List<Object>> tableau;
	List<String> colonneID;
	Map<String, ColonneDonnee> colonnesInternes;	
	Map<String, ColonneExterne> colonnesExternes;		
	/** Map tables : clé = nom de la table dans le modèle, valeur = chemin vers la table */
	Map<String, Table> tables;
	Map<String, String> paths;
	Table table;
	
	
	/** Instancie le tableur et importe les colonnes.
	 * 
	 * @param table la table à importer
	 * @param filePath le chemin vers le CSV
	 * @param args les arguments
	 * @throws RefTableException si il y a un problème de référence de table externe.
	 * @throws IDMissmatchException si il yè a un problème d'ID pour le référencement.
	 */
	public Tableur(Table table, String filePath, String[] args) throws RefTableException, IDMissmatchException {
		// définition des attributs
    	tableau = new Hashtable<String, List<Object>>();
    	colonneID = new LinkedList<String>();
    	colonnesInternes = new Hashtable<String, ColonneDonnee>();
    	colonnesExternes = new Hashtable<String, ColonneExterne>();
		tables = new Hashtable<String, Table>();
		paths = new Hashtable<String, String>();
    	this.table = table;
		
    	// import des colonnes
    	resolveModelDependancy(args);
    	importColonnes(table);
		colonneID = ReaderWriter.readColumn(table.getColonneID().getName(), filePath);
    	
    	
    	Map<String, List<String>> tableauString = ReaderWriter.readGlobal(colonnesInternes.keySet(), filePath);
    	UniversalConverter cv = new UniversalConverter();
    	
    	for (String s : colonnesInternes.keySet()) {
    		ColonneDonnee colonne = colonnesInternes.get(s);
			System.out.println("Importage de la colonne " + colonne.getName());
			try {
	    		tableau.put(s, cv.convert(tableauString.get(s), colonne.getType()));
	    	}
			catch (WrongFormatException e) {
				System.out.println("Erreur lors de l'import de la colonne " + s + " du tableau : " + e.getMessage());
			}
    	}
    	for (String s : colonnesExternes.keySet()) {
    		ColonneExterne colonne = colonnesExternes.get(s);
			System.out.println("Importage de la colonne " + colonne.getName());
			try {
				String tNom = ((ColonneExterne) colonne).getTableExterne().getName();
		    	System.out.println("Référence à la table " + tNom);
				List<String> oldList = refColonne((ColonneExterne) colonne, paths.get(tNom));
				List<String> newList = homogenisation(oldList, tNom, paths.get(tNom));
				tableau.put(colonne.getName(), new UniversalConverter().convert(newList, colonne.getType()));
	    	}
			catch (WrongFormatException e) {
				System.out.println("Erreur lors de l'import de la colonne " + s + " du tableau : " + e.getMessage());
			}
    	}
    	
		
	}
	
	/** Rapide manuel d'utilisation
	 * 
	 */
	public static void use() {
		System.out.println("utilisation : java Tableur.java modèleURI cheminVersCSV URI1 cheminVersCSV1 URI2 cheminVersCSV2 ...");
	}
	
	/** importe les colonnes de la Table table dans la map colonnes
	 * 
	 * @param table la table à importer
	 * @throws RefTableException 
	 */
	private void importColonnes(Table table) throws RefTableException {
		for (ColonneDonnee c : table.getColonnes()) {
			if (c instanceof ColonneExterne) {
				ColonneExterne ce = (ColonneExterne) c ;
				Table t = getTable(ce);
				ce.setTableExterne(t);
				colonnesExternes.put(ce.getName(), ce);
			}
			else {
				colonnesInternes.put(c.getName(), c);
			}
		}
	}
	
	private Table getTable(ColonneExterne ce) throws RefTableException {
		
		for (String tNom : tables.keySet()) {
			Table t = tables.get(tNom);
			for (Colonne c : t.getColonnes()) {
				if (c.getName().equals(ce.getName())) return t;
			}
		}
		throw new RefTableException(ce.getName());
    	
	}
	
	/** Importe les colonnes extérieurs dans tableau
	 * 
	 * @param table la table d'origine
	 * @throws RefTableException si la table spécifiée n'est pas trouvée parmi les arguments
	 * @throws WrongFormatException 
	 */
	private List<String> refColonne(ColonneExterne colonne, String path) throws RefTableException, WrongFormatException{
		String tableExterneNom = colonne.getTableExterne().getName();
		if (path == null) {
			throw new RefTableException(tableExterneNom);
		}
		return ReaderWriter.readColumn(colonne.getName(), path);
	}
	
	private List<String> homogenisation(List<String> liste, String tableRefNom, String path) throws IDMissmatchException {
		ColonneID cid = table.getColonneID();
		List<String> cidList = ReaderWriter.readColumn(cid.getName(), path);
		List<String> homogenizedList = new LinkedList<String>();
		for (int i = 0; i < colonneID.size(); i++) {
			String index = colonneID.get(i);
			int extIndex = cidList.indexOf(index);
			if (extIndex == -1) {
				throw new IDMissmatchException(table.getName(), tableRefNom);
			}
			homogenizedList.add(liste.get(extIndex));
		}
		return homogenizedList; 
	}
	
	private void resolveModelDependancy(String[] args) throws RefTableException {
		for (int i = 2; i< args.length; i+=2) {
			if (i+1 >= args.length) {
				use();
				throw new RefTableException(args[i]);
			}
			TableurPackage tabExtPackageInstance = TableurPackage.eINSTANCE;
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("xmi", new XMIResourceFactoryImpl());
			URI modelURISource = URI.createURI(args[i]);
			ResourceSet resSet = new ResourceSetImpl();
			
			Resource resourceSource = resSet.getResource(modelURISource, true);
	    	Table tableExt = (Table) resourceSource.getContents().get(0);
	    	
	    	tables.put(tableExt.getName(), tableExt);
	    	paths.put(tableExt.getName(), args[i+1]);
	    	
		}
	}

	public static void main(String[] args) {
		
		if (args.length % 2 != 0) {
			use();
			return;
		}
		
		// Chemin vers le fichier
		String filePath = args[1];
			
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		TableurPackage tablPackageInstance = TableurPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
		URI modelURISource = URI.createURI(args[0]);
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resourceSource = resSet.getResource(modelURISource, true);
    	Table table = (Table) resourceSource.getContents().get(0);
    	
    	
    	
    	Tableur tableur = null;
    	try {
    		tableur = new Tableur(table, filePath, args);
		} catch (RefTableException e) {
			use();
			e.printStackTrace();
		} catch (IDMissmatchException e) {
			e.printStackTrace();
		}
    	System.out.println(tableur.toString());
    	return;
    	
    	
    	
	}

}
