package fr.n7.tableur.transformation;

public class CustomExceptions {
	
	public static class WrongFormatException extends Exception {
	
		
		public WrongFormatException(String etape) {
			super("La table donnée n'est pas au bon format. Echec lors de l'étape : " + etape);
		}
	}
	
	public static class RefTableException extends Exception {
		
		public RefTableException(String nom) {
			super("Erreur lors du référencement avec la table " + nom);
		}
	}

}
