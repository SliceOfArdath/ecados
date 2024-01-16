package fr.n7.tableur.transformation;

public class CustomExceptions {
	
	public static class WrongFormatException extends Exception {
	
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public WrongFormatException(String etape) {
			super("La table donnée n'est pas au bon format. Echec lors de l'étape : " + etape);
		}
	}
	
	public static class RefTableException extends Exception {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public RefTableException(String nom) {
			super("Erreur lors du référencement avec " + nom);
		}
	}
	
	public static class RefFonctionException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public RefFonctionException(String nom) {
			super("Erreur lors du référencement avec " + nom);
		}
	}
	
	public static class IDMissmatchException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public IDMissmatchException(String nomOrig, String nomExt) {
			super("The IDColumn of table " + nomOrig + " does nom match the IDcolumn of " + nomExt);
		}
	}
	

}
