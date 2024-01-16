package fr.n7.tableur.transformation;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.n7.tableur.*;
import fr.n7.tableur.transformation.CustomExceptions.*;
import traitement.*;


public class Tableur {
	
	public static final String DIRECTORY_ECADOS = System.getProperty("user.home") + "/Documents/ecados/";
	public static final String DIRECTORY_TABLE = DIRECTORY_ECADOS + "models/Table/";
	public static final String DIRECTORY_FONCTION = DIRECTORY_ECADOS + "models/Fonction/";
	public static final String DIRECTORY_ALGORITHME = DIRECTORY_ECADOS + "models/Algorithme/";
	public static final String DIRECTORY_CSV = DIRECTORY_ECADOS + "csv_files/";
	public static final String DIRECTORY_SAVE = DIRECTORY_ECADOS + "generated/";
	public static final String DIRECTORY_LIBS = DIRECTORY_ECADOS + "libs/";
	public static final String DIRECTORY_JAVA_DEV = DIRECTORY_ECADOS + "fonctions_developpeur/";
	public static final String DIRECTORY_CONFIG = DIRECTORY_ECADOS + ".config";
	
	
	Map<String, List<Object>> tableau;
	List<String> colonneID;
	Map<String, ColonneDonnee> colonnesInternes;	
	Map<String, ColonneExterne> colonnesExternes;		
	/** Map tables : clé = nom de la table dans le modèle, valeur = chemin vers la table */
	Map<String, Table> tables;
	Map<String, FonctionTraitement> fonctions;
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
	public Tableur(Boolean autoCalcul) throws Exception {
		// définition des attributs
    	tableau = new Hashtable<String, List<Object>>();
    	colonneID = new LinkedList<String>();
    	colonnesInternes = new Hashtable<String, ColonneDonnee>();
    	colonnesExternes = new Hashtable<String, ColonneExterne>();
		tables = new Hashtable<String, Table>();
		paths = new Hashtable<String, String>();
		fonctions = new Hashtable<String, FonctionTraitement>();
    	
    	if (!new File(DIRECTORY_CONFIG).exists()) {
        	FileWriter fw = new FileWriter(DIRECTORY_CONFIG, false);
        	fw.write("table: table.xmi\n\ncsv: csv.csv\n\ntableExt: \n- t1.xmi\n\ncsvExt: \n- csv1.csv\n\nfonction: \n- f1.java\n\nlib: \n\n");
        	fw.close();
    	}
		
		// Parsage du fichier de config
		Map<String, List<String>> args = ConfigParser.parse(DIRECTORY_CONFIG);
		if (args.get("tableExt").size() != args.get("csvExt").size()) {
			throw new Exception(".config is invalid");
		}
		
		// Chemin vers le fichier
		String filePath = DIRECTORY_CSV + args.get("csv").get(0);
			
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		TableurPackage tablPackageInstance = TableurPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
		URI modelURISource = URI.createURI(DIRECTORY_TABLE + args.get("table").get(0));
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resourceSource = resSet.getResource(modelURISource, true);
    	Table table = (Table) resourceSource.getContents().get(0);
		
		rw = new ReaderWriter(filePath);
    	this.table = table;
    	   
    	new File(Tableur.DIRECTORY_ECADOS).mkdirs();
    	new File(Tableur.DIRECTORY_TABLE).mkdirs();
    	new File(Tableur.DIRECTORY_FONCTION).mkdirs();
    	new File(Tableur.DIRECTORY_ALGORITHME).mkdirs();
    	new File(Tableur.DIRECTORY_CSV).mkdirs();
    	new File(Tableur.DIRECTORY_LIBS).mkdirs();
    	new File(Tableur.DIRECTORY_JAVA_DEV).mkdirs();
    	new File(Tableur.DIRECTORY_SAVE).mkdirs();
    	
    	
    	parseCommand(args);
		
    	
    	importTable(args);
    	
    	if (autoCalcul) {
    		actualiser();
    	}
		
	}
	
	/** Rapide manuel d'utilisation
	 * 
	 */
	public static void use() {
		System.out.println("utilisation : java Tableur.java modèleURI cheminVersCSV -t URI1 cheminVersCSV1 URI2 cheminVersCSV2 \n"
				+ "... -f URI1 cheminVersFonction ");
	}
	
	public void parseCommand(Map<String, List<String>> args) throws Exception {
		for (int i = 0; i < args.get("tableExt").size(); i++) {
			    resolveTableDependancy(DIRECTORY_TABLE + args.get("tableExt").get(i), DIRECTORY_CSV + args.get("csvExt").get(i));
			}
		for (int i = 0; i < args.get("fonction").size(); i++) {
			    resolveFonctionDependancy(DIRECTORY_FONCTION + args.get("fonction").get(i));
			}
	}
	
	public void actualiser() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, RefFonctionException {
		for (ColonneDonnee c : table.getColonnes()) {
			if (c instanceof DonneeCalculee) {
				fonctions.get(((DonneeCalculee) c).getNomFonction()).runFonction(tableau, colonneID.size());
			}
		}
	}
	
	
	public void importTable(Map<String, List<String>> args)throws Exception {
		// import des colonnes
    	if (!rw.open("r")) {
    		throw new Exception("Could not open file");
    	}
    	importColonnes(table);
		colonneID = rw.readColumn(table.getColonneID().getName());
    	
    	
    	Map<String, List<String>> tableauString = rw.readGlobal(getDonneeBruteName());
    	UniversalConverter cv = new UniversalConverter();
    	
    	for (String s : colonnesInternes.keySet()) {
    		ColonneDonnee colonne = colonnesInternes.get(s);
			System.out.println("Importage de la colonne " + colonne.getName());
			try {
				if (colonne instanceof DonneeBrute) {
					tableau.put(s, cv.convertColumn(tableauString.get(s), colonne.getType()));
				}
				else {
					tableau.put(s,  new LinkedList<Object>());
				}
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
				tableau.put(colonne.getName(), new UniversalConverter().convertColumn(newList, colonne.getType()));
	    	}
			catch (WrongFormatException e) {
				System.out.println("Erreur lors de l'import de la colonne " + s + " du tableau : " + e.getMessage());
			}
    	}
    	
    	rw.close();
		
	}
	
	private Set<String> getDonneeBruteName() {
		Set<String> l = new LinkedHashSet<String>();
		for (ColonneDonnee c : table.getColonnes()) {
			if (c instanceof DonneeBrute) l.add(c.getName());
		}
		return l;
	}
	
	/** importe les colonnes de la Table table dans la map colonnes
	 * 
	 * @param table la table à importer
	 * @throws RefTableException 
	 */
	public void importColonnes(Table table) throws RefTableException {
		for (ColonneDonnee c : table.getColonnes()) {
			if (c instanceof ColonneExterne) {
				ColonneExterne ce = (ColonneExterne) c ;
				Table t = getTable(ce);
				ce.setTableExterne(t);
				colonnesExternes.put(ce.getName(), ce);
			}
			else if (c instanceof DonneeCalculee){
				DonneeCalculee dc = (DonneeCalculee) c ;
				Fonction  f = getFonction(dc);
				dc.setFonction(f);
				colonnesInternes.put(dc.getName(), dc);
			}
			else {
				colonnesInternes.put(c.getName(), c);
			}
		}
	}
	
	
	public Table getTable(ColonneExterne ce) throws RefTableException {
		
		for (String tNom : tables.keySet()) {
			Table t = tables.get(tNom);
			for (Colonne c : t.getColonnes()) {
				if (c.getName().equals(ce.getName())) return t;
			}
		}
		throw new RefTableException(ce.getName());
    	
	}
	
	public Fonction getFonction(DonneeCalculee dc) throws RefTableException {
		
		for (String fNom : fonctions.keySet()) {
			Fonction f = fonctions.get(fNom).getFonction();
			if (f.getName().equals(dc.getNomFonction())) {
				dc.setFonction(f);
				return f;
			}
		}
		throw new RefTableException(dc.getName());
    	
	}
	
	public boolean save(String path) {
		rw.setFilePath(Tableur.DIRECTORY_SAVE, table.getName());
	    try {
	    	rw.open("w");
			rw.writeGlobal(tableau, table.getColonneID().getName(), colonneID);
			rw.close();
			return true;
	    } catch (IOException e) {
			e.printStackTrace();
			return false;
		}
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
	
	private void resolveFonctionDependancy(String arg) throws RefTableException, NoSuchMethodException, SecurityException {
		
		TraitementPackage traitPackageInstance = TraitementPackage.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		URI modelURISource = URI.createURI(arg);
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resourceSource = resSet.getResource(modelURISource, true);
    	Fonction fonction = (Fonction) resourceSource.getContents().get(0);
    	fonction.getSorties().clear(); //>>>>>:^DDD
    	
    	FonctionTraitement ft = new FonctionTraitement(fonction);
    	fonctions.put(fonction.getName(), ft);
	}
	
	
	

	public static void main(String[] args) {
    	
    	boolean autoCalculate = Boolean.parseBoolean(args[0]);
    	
    	Tableur tableur = null;
    	try {
    		tableur = new Tableur(autoCalculate);
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

    	tableur.save(args[1]);
    	

	    
    	return;
    	
	}

}
