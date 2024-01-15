package fr.n7.tableur.transformation;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.n7.tableur.*;
import fr.n7.tableur.transformation.CustomExceptions.*;
import traitement.Fonction;
import traitement.TraitementPackage;


public class Tableur {
	
	public static final String DIRECTORY_ECADOS = System.getProperty("user.home") + "/Documents/ecados/";
	public static final String DIRECTORY_TABLE = DIRECTORY_ECADOS + "models/Table/";
	public static final String DIRECTORY_FONCTION = DIRECTORY_ECADOS + "models/Fonction/";
	public static final String DIRECTORY_ALGORITHME = DIRECTORY_ECADOS + "models/Algorithme/";
	public static final String DIRECTORY_CSV = DIRECTORY_ECADOS + "csv_files/";
	public static final String DIRECTORY_FONCTION_JAVA = DIRECTORY_ECADOS + "libs/";
	
	Map<String, List<Object>> tableau;
	List<String> colonneID;
	Map<String, ColonneDonnee> colonnesInternes;	
	Map<String, ColonneExterne> colonnesExternes;		
	/** Map tables : clé = nom de la table dans le modèle, valeur = chemin vers la table */
	Map<String, Table> tables;
	Map<String, Fonction> fonctions;
	Map<String, String> paths;
	Table table;
	ReaderWriter rw;
	
	
	/** Instancie le tableur et importe les colonnes.
	 * 
	 * @param table la table à importer
	 * @param filePath le chemin vers le CSV
	 * @param args les arguments
	 * @throws Exception 
	 */
	public Tableur(Table table, String filePath, String[] args) throws Exception {
		// définition des attributs
    	tableau = new Hashtable<String, List<Object>>();
    	colonneID = new LinkedList<String>();
    	colonnesInternes = new Hashtable<String, ColonneDonnee>();
    	colonnesExternes = new Hashtable<String, ColonneExterne>();
		paths = new Hashtable<String, String>();
		tables = new Hashtable<String, Table>();
		rw = new ReaderWriter(Tableur.DIRECTORY_CSV + filePath);
    	this.table = table;
    	
    	new File(Tableur.DIRECTORY_ECADOS + "models/Table/").mkdirs();
    	new File(Tableur.DIRECTORY_ECADOS + "models/Fonction/").mkdirs();
    	new File(Tableur.DIRECTORY_ECADOS + "models/Algorithme/").mkdirs();
    	new File(Tableur.DIRECTORY_ECADOS + "csv_files/").mkdirs();
    	new File(Tableur.DIRECTORY_ECADOS + "libs/").mkdirs();
    	
    	parseCommand(args);
		
    	
    	importTable(table, DIRECTORY_CSV + filePath, args);
		
	}
	
	/** Rapide manuel d'utilisation
	 * 
	 */
	public static void use() {
		System.out.println("utilisation : java Tableur.java modèleURI cheminVersCSV URI1 cheminVersCSV1 URI2 cheminVersCSV2 ...");
	}
	
	public void parseCommand(String[] args) throws RefTableException {
		int i = 2;
		while (i < args.length) {
			if (args[i].equals("-t") || args[i].equals("--tables_externes")) {
				while (i+1 < args.length && !args[i].matches("-[a-zA-Z]") && !args[i].matches("--[a-zA-Z]+")) {
			    	resolveTableDependancy(DIRECTORY_TABLE + args[i], DIRECTORY_TABLE + args[i+1]);
			    	i+=2;
				}
			}
			if (args[i].equals("-f") || args[i].equals("--fonction")) {
				while (i+1 < args.length && !args[i].matches("-[a-zA-Z]") && !args[i].matches("--[a-zA-Z]+")) {
			    	resolveFonctionDependancy(DIRECTORY_FONCTION + args[i]);
			    	i++;
				}
			}
		}
	}
	
	public void importTable(Table table, String filePath, String[] args)throws Exception {
		// import des colonnes
    	if (!rw.open("r")) {
    		throw new Exception("Could not open file");
    	}
    	importColonnes(table);
		colonneID = rw.readColumn(table.getColonneID().getName());
    	
    	
    	Map<String, List<String>> tableauString = rw.readGlobal(colonnesInternes.keySet());
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
    	
    	rw.close();
		
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
	 * @throws FileNotFoundException 
	 * @throws NoSuchElementException 
	 */
	private List<String> refColonne(ColonneExterne colonne, String path) throws RefTableException, WrongFormatException, NoSuchElementException, FileNotFoundException{
		String tableExterneNom = colonne.getTableExterne().getName();
		if (path == null) {
			throw new RefTableException(tableExterneNom);
		}
		String originPath = rw.getFilePath();
		rw.setFilePath(path);
		List<String> list = rw.readColumn(colonne.getName());
		rw.setFilePath(originPath);
		return list;
	}
	
	private List<String> homogenisation(List<String> liste, String tableRefNom, String path) throws IDMissmatchException, NoSuchElementException, FileNotFoundException {

		String originPath = rw.getFilePath();
		rw.setFilePath(path);
		ColonneID cid = table.getColonneID();
		List<String> cidList = rw.readColumn(cid.getName());
		List<String> homogenizedList = new LinkedList<String>();
		for (int i = 0; i < colonneID.size(); i++) {
			String index = colonneID.get(i);
			int extIndex = cidList.indexOf(index);
			if (extIndex == -1) {
				rw.setFilePath(originPath);
				throw new IDMissmatchException(table.getName(), tableRefNom);
			}
			homogenizedList.add(liste.get(extIndex));
		}
		rw.setFilePath(originPath);
		return homogenizedList; 
	}
	
	private void resolveTableDependancy(String arg1, String arg2) throws RefTableException {
		
		TableurPackage tabExtPackageInstance = TableurPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		URI modelURISource = URI.createURI(arg1);
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resourceSource = resSet.getResource(modelURISource, true);
    	Table tableExt = (Table) resourceSource.getContents().get(0);
    	
    	tables.put(tableExt.getName(), tableExt);
    	paths.put(tableExt.getName(), arg2);
	}
	
	private void resolveFonctionDependancy(String arg) throws RefTableException {
		
		TraitementPackage tabExtPackageInstance = TraitementPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		URI modelURISource = URI.createURI(arg);
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resourceSource = resSet.getResource(modelURISource, true);
    	Fonction fonction = (Fonction) resourceSource.getContents().get(0);
    	
    	fonctions.put(fonction.getName(), fonction);
	}
	
	
	

	public static void main(String[] args) {
		
		// Chemin vers le fichier
		String filePath = DIRECTORY_CSV + args[1];
			
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		TableurPackage tablPackageInstance = TableurPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
		URI modelURISource = URI.createURI(DIRECTORY_TABLE + args[0]);
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
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println(tableur.toString());
    	

	    tableur.rw.setFilePath(Tableur.DIRECTORY_ECADOS + "temp/", table.getName());
	    try {
	    	tableur.rw.open("w");
			tableur.rw.writeGlobal(tableur.tableau, table.getColonneID().getName(), tableur.colonneID);
			tableur.rw.close();
	    } catch (IOException e) {
			e.printStackTrace();
		}
    	return;
    	
	}

}
