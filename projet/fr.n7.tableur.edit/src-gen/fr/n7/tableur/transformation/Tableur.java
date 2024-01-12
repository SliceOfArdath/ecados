package fr.n7.tableur.transformation;


import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.n7.tableur.*;
import fr.n7.tableur.transformation.CustomExceptions.*;


public class Tableur {
	
	Map<String, List<Object>> tableau;
	List<String> colonneID;
	Map<String, Colonne> colonnes;		
	/** Map tables : clé = nom de la table dans le modèle, valeur = chemin vers la table */
	Map<String, String> tables;
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
    	colonnes = new Hashtable<String, Colonne>();
		tables = new Hashtable<String, String>();
    	this.table = table;
		
    	// import des colonnes
    	importColonnes(table);
		importRefs(args);
		colonneID = ReaderWriter.readColumn(table.getColonneID().getName(), filePath);
    	
    	
    	Map<String, List<String>> tableauString = ReaderWriter.readGlobal(colonnes.keySet(), filePath);
    	UniversalConverter cv = new UniversalConverter();
    	
    	for (String s : colonnes.keySet()) {
    		Colonne colonne = colonnes.get(s);
			try {
	    		if (colonne instanceof ColonneDonnee && !(colonne instanceof ColonneExterne)) {
	    				tableau.put(s, cv.convert(tableauString.get(s), colonne.getType()));
	    			
	    		} else if (colonne instanceof ColonneExterne) {
						List<String> oldList = refColonne((ColonneExterne) colonne);
						List<String> newList = homogenisation(oldList, ((ColonneExterne) colonne).getTableExterne().getName());
						tableau.put(colonne.getName(), new UniversalConverter().convert(newList, colonne.getType()));
	    		}
	    	}
			catch (WrongFormatException e) {
				System.out.println("Erreur lors de la colonne " + s + " du tableau : " + e.getMessage());
			}
    	}
		
	}
	
	/** Rapide manuel d'utilisation
	 * 
	 */
	public static void use() {
		System.out.println("utilisation : java Tableur.java modèleURI cheminVersCSV nomTableExterne1 cheminVersCSV1 nomTableExterne2 cheminVersCSV2 ...");
	}
	
	/** Importe les chemin des tables externes dans une Map pour un traitement ultérieur
	 * 
	 * @param args les arguments de lla ligne de commande
	 * @throws RefTableException si la table n'est pas spécifiée
	 */
	private void importRefs(String[] args) throws RefTableException {
		for (int i = 2 ; i < args.length ; i+=2) {
			if (i+1 >= args.length) {
				use();
				throw new RefTableException(args[i]);
			}
			tables.put(args[i], args[i+1]);
		}
		
		
	}
	
	/** importe les colonnes de la Table table dans la map colonnes
	 * 
	 * @param table la table à importer
	 */
	private void importColonnes(Table table) {
		for (Colonne c : table.getColonnes()) {
			if (!(c instanceof ColonneExterne)) {
				
			colonnes.put(c.getName(), c);
			}
		}
	}
	
	/** Importe les colonnes extérieurs dans tableau
	 * 
	 * @param table la table d'origine
	 * @throws RefTableException si la table spécifiée n'est pas trouvée parmi les arguments
	 * @throws WrongFormatException 
	 */
	private List<String> refColonne(ColonneExterne colonne) throws RefTableException, WrongFormatException{
		String tableExterneNom = colonne.getTableExterne().getName();
		String path = tables.get(tableExterneNom);
		if (path == null) {
			throw new RefTableException(tableExterneNom);
		}
		return ReaderWriter.readColumn(colonne.getName(), path);
	}
	
	private List<String> homogenisation(List<String> liste, String tableRefNom) throws IDMissmatchException {
		String path = tables.get(tableRefNom);
		ColonneID cid = table.getColonneID();
		List<String> cidList = ReaderWriter.readColumn(cid.getName(), path);
		List<String> homogenizedList = new LinkedList<String>();
		for (int i = 0; i < colonneID.size(); i++) {
			String index = colonneID.get(i);
			int extIndex = cidList.indexOf(index);
			if (extIndex == -1) {
				throw new IDMissmatchException(table.getName(), tableRefNom);
			}
			homogenizedList.add(cidList.get(extIndex));
		}
		return homogenizedList; 
	}

	public static void main(String[] args) {
		
		if (args.length % 2 != 0) {
			use();
			return;
		}
		
		// Chemin vers le fichier
		String filePath = args[1];
			
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		TableurPackage spdlPackageInstance = TableurPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
		URI modelURISource = URI.createURI(args[0]);
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resourceSource = resSet.getResource(modelURISource, true);
    	Table table = (Table) resourceSource.getContents().get(0);
    	
    	try {
			Tableur tableur = new Tableur(table, filePath, args);
		} catch (RefTableException e) {
			use();
			e.printStackTrace();
		} catch (IDMissmatchException e) {
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
	}

}
