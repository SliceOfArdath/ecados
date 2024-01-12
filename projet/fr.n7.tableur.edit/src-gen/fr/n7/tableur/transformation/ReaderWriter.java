package fr.n7.tableur.transformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;


public class ReaderWriter {
	
	/**
	 * A partir d'un csv, lit la colonne columnName et la transforme en une liste chaînée de String.
	 * @param columnName le nom de la colonne à lire.
	 * @param fileToRead le chemin du fichier à lire.
	 * @return Une LinkedList contenant tous les éléments sde la colonne en forme de String.
	 */
	public static LinkedList<String> readColumn(String columnName, String filePath) throws NoSuchElementException
	{
		File file = new File(filePath);
		LinkedList<String> list = new LinkedList<String>(); //On laissera le programme appelant convertir
		try {
			// Récupération de l'index de la colonne demandée
			Scanner sc = new Scanner(file);
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
			sc.close();
			return list;
			
		} 
		catch (FileNotFoundException e) {
			// Au cas où on ne trouve pas la liste
			e.printStackTrace();
		}
		
		return null;
				
	}
	
	
	
	/** Lit tout un fichier en fonction de certaines colonnes et renvoie un dictionnaire contenant
	 *  les listes associées au nom de leur clonne.
	 * @param columns la liste du nom des colonnes à lire.
	 * @param fileToRead le chemin du fichier à lire.
	 * @return le dictionnaire des listes (colonnes) associées au nom de leur colonne.
	 */
	public static Map<String, List<String>> readGlobal( Set<String> columns, String fileToRead) throws NoSuchElementException {
		Map<String, List<String>> dict = new Hashtable<String, List<String>>();
		for (String column : columns) {
			List<String> list = readColumn(column, fileToRead);
			dict.put(column, list);
		}
		return dict;
	}

}
