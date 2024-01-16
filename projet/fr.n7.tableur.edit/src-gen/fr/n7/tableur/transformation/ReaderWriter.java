package fr.n7.tableur.transformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;


public class ReaderWriter {
	
	private String filePath;
	private String dirPath;
	private String fileName ;
	private Scanner sc;
	private FileWriter fw;
	
	
	public ReaderWriter(String filePath) {
		this.filePath = filePath;
		setNameAndDir();
	}
	
	public ReaderWriter(String dirPath, String name) {
		this.filePath = dirPath + name + ".csv";
		this.dirPath = dirPath;
		this.fileName = name;
	}
	
	public void setFilePath(String path) {
		this.filePath = path;
		setNameAndDir();
	}
	
	public void setFilePath(String dirPath, String name) {
		this.filePath = dirPath + name + ".csv";
		this.dirPath = dirPath;
		this.fileName = name;
	}
	
	public String getFilePath() {
		return this.filePath;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public String getDirPath() {
		return this.dirPath;
	}
	
	public void setNameAndDir() {
		String[] array = filePath.split("/");
		String[] arrayPoint = array[array.length-1].split("csv");
		
		StringBuilder a1 = new StringBuilder();
		for (int i=0; i + 1 < array.length; i++) {
			a1.append(array[i]);
			a1.append("/");
		}
		this.dirPath = a1.toString();
		
		StringBuilder a2 = new StringBuilder();
		for (int i=0; i < arrayPoint.length; i++) {
			a2.append(arrayPoint[i]);
			a2.append("csv");
		}
		this.fileName = a2.substring(0, a2.length()-4);
	}	
	
	public boolean open(String mode) throws IOException {
		File file = new File(filePath);
		if (mode.equals("r")) {
			sc = new Scanner(file);
			return true;
		}
		else if (mode.equals("w")) {
			int i = 1;
			file.getParentFile().mkdirs();
			while (!file.createNewFile()) {
				String nom;
				if (i==1) nom = dirPath + fileName; else nom = dirPath + fileName + Integer.toString(i-1);
				System.out.println("le fichier " + nom + ".csv" +" existe déjà, tentative supplémentaire...");
				file = new File(dirPath + fileName + Integer.toString(i) + ".csv");
				filePath = dirPath + fileName + Integer.toString(i) + ".csv";
				i++;
			}
			fw = new FileWriter(filePath);
			return true;
		}
		return false;
	}
	
	public void close() throws IOException {
		try {
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Fichier en lecture déjà fermé");
		}
		try {
			fw.close();
		}
		catch(Exception e) {
			System.out.println("Fichier en écriture déjà fermé");
		}
	}
	
	/**
	 * A partir d'un csv, lit la colonne columnName et la transforme en une liste chaînée de String.
	 * @param columnName le nom de la colonne à lire.
	 * @param fileToRead le chemin du fichier à lire.
	 * @return Une LinkedList contenant tous les éléments sde la colonne en forme de String.
	 * @throws FileNotFoundException 
	 */
	public LinkedList<String> readColumn(String columnName) throws NoSuchElementException, FileNotFoundException
	{
		LinkedList<String> list = new LinkedList<String>(); //On laissera le programme appelant convertir
		// Récupération de l'index de la colonne demandée
		File file = new File(filePath);
		sc = new Scanner(file);
		String rows = sc.nextLine();
		String[] rowArray = rows.split(",");
		for (int i=0; i<rowArray.length; i++) {
			rowArray[i] = rowArray[i].trim();
		}			
		List<String> cutRows = Arrays.asList(rowArray);
		int index = cutRows.indexOf(columnName);
		// Traitement du cas où on ne trouve pas
		if (index == -1) {
			sc.close();
			throw new NoSuchElementException("La colonne " + columnName + " n'existe pas dans le csv");
		}
		// Ajout de la colonne dans ligne
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			// On récupère la valeur de la index-ème colonne
			String s = line.split(",")[index];
			list.add(s);
		}		
		return list;
				
	}
	
	
	
	/** Lit tout un fichier en fonction de certaines colonnes et renvoie un dictionnaire contenant
	 *  les listes associées au nom de leur clonne.
	 * @param columns la liste du nom des colonnes à lire.
	 * @param fileToRead le chemin du fichier à lire.
	 * @return le dictionnaire des listes (colonnes) associées au nom de leur colonne.
	 * @throws FileNotFoundException 
	 */
	public Map<String, List<String>> readGlobal(Set<String> columns) throws NoSuchElementException, FileNotFoundException {
		Map<String, List<String>> dict = new Hashtable<String, List<String>>();
		for (String column : columns) {
			List<String> list = readColumn(column);
			dict.put(column, list);
		}
		return dict;
	}
	
	public void writeLine(List<String> line) throws IOException {
		StringBuilder toWrite = new StringBuilder();
		for (String s : line) {
			toWrite.append(s);
			toWrite.append(',');
		}
		fw.write(toWrite.substring(0, toWrite.length()-1));
		fw.write("\n");
		
	}
	
	public void writeGlobal(Map<String, List<Object>> map, String idName, List<String> cid) throws IOException {
		List<String> toWrite = new LinkedList<String>();
		System.out.println("Écriture dans " + filePath);
		toWrite.add(idName);
		UniversalConverter uc = new UniversalConverter();
		Map<String, List<String>> mapString = uc.convertGlobalString(map);
		for (String s : mapString.keySet()) {
			if (mapString.get(s).size() > 0) toWrite.add(s);
		}
		writeLine(toWrite);
		for (int i = 0; i < cid.size(); i++) {
			toWrite = new LinkedList<String>();
			toWrite.add(cid.get(i));
			for (String s : mapString.keySet()) {
				if (mapString.get(s).size() > 0) toWrite.add(mapString.get(s).get(i));
			}
			writeLine(toWrite);
		}
		
	}

}
