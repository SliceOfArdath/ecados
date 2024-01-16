package fr.n7.tableur.transformation;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import fr.n7.tableur.ColonneDonnee;
import traitement.Fonction;

public class FonctionTraitement {
	
	private Fonction fct;
	private Object obj;

	public FonctionTraitement(Fonction fonction) {
		this.fct = fonction;
		this.obj = new LibsTableur.UserFunctions();
	}
	
	public Fonction getFonction() {
		return this.fct;
	}
	
	public void setFonction(Fonction fct) {
		this.fct = fct;
	}
	
	public void runFonction(Map<String, List<Object>> map) throws NoSuchMethodException, SecurityException{
		
		Converter<Object> uc = new UniversalConverter();
		Method method = obj.getClass().getMethod(fct.getName(), Object.class);
		for (ColonneDonnee c : fct.getEntrees()) {
			
		}
	}
	
}

