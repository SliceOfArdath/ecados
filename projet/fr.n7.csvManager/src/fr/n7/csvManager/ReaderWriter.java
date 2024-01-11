package fr.n7.csvManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReaderWriter {
	
	public static final int STRING_TYPE = 0;
	public static final int INT_TYPE = 1;
	
	/**
	 * A partir d'un csv, lit la colonne columnName et la transforme en une liste chaînée rajoutée.
	 * @param columnName
	 * @param fileToRead
	 * @return 
	 */
	public static <T> LinkedList<T> readColumn(String columnName, int type, String filePath) {
		File file = new File(filePath);
		LinkedList<T> list = new LinkedList<T>();
		try {
			Scanner sc = new Scanner(file);
			String rows = sc.nextLine();
			List<String> cutRows = Arrays.asList(rows.split(","));
			int index = cutRows.indexOf(columnName);
			
			if (index == -1) {
				sc.close();
				throw new NoSuchElementException("La colonne n'existe pas dans le csv");
			}
			
			String line = sc.nextLine();
			while (line != null) {
				String s = line.split(",")[index];
				Object converted;
				switch(type) {
					case INT_TYPE:
						 converted = (Object) Integer.parseInt(s);
						break;
					case STRING_TYPE:
					default:
						converted = s;
						break;
				}
				list.add((T) converted);
			}
			
			
			
			sc.close();

			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
				
	}
	
	
	/**
	 * 
	 * @param fileToRead
	 */
	public void readGlobal(String fileToRead) {
		
	}

}
