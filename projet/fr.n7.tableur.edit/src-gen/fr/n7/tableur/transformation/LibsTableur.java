package fr.n7.tableur.transformation;

import java.util.Hashtable;
import java.util.Map;

public class LibsTableur {
	
	
	
	public static class UserFunctions {
		
		/* Par exemple :
		 * 
		 * 
		public static Map<String, Object> moyenne(Map<String, Object> entrees) {
			Map<String, Object> sortie = new Hashtable<String, Object>();
			sortie.put("Moyenne", ((Integer) entrees.get("Age")+ (Integer) entrees.get("Taille"))/2);
			return sortie;
		}
		*/
		
		public static Map<String, Object> moyenne(Hashtable<String, Object> entrees) {
			Map<String, Object> sortie = new Hashtable<String, Object>();
			sortie.put("Moyenne", ((Integer) entrees.get("Age")+ (Integer) entrees.get("Taille"))/2);
			return sortie;
		}
		
	}
}
