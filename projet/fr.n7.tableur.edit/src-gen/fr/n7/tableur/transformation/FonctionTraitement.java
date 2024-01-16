package fr.n7.tableur.transformation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import fr.n7.tableur.ColonneDonnee;
import traitement.Fonction;
import fr.n7.tableur.*;
import fr.n7.tableur.transformation.CustomExceptions.*;


public class FonctionTraitement {
	
	private Fonction fct;
	private Method method;

	public FonctionTraitement(Fonction fonction) throws NoSuchMethodException, SecurityException {
		this.fct = fonction;
		
		Map<String, Object> tmp = new Hashtable<String, Object>();
		method = LibsTableur.UserFunctions.class.getMethod(fct.getChemin(), tmp.getClass());
		
	}
	
	public Fonction getFonction() {
		return this.fct;
	}
	
	public void setFonction(Fonction fct) {
		this.fct = fct;
	}
	
	public Map<String, Object> runLine(Map<String,Object> map) throws RefFonctionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return (Map<String, Object>) method.invoke(null, map);
	}
	
	public Map<String, List<Object>> runFonction(Map<String, List<Object>> tableau, int length) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, RefFonctionException{
		for (int i=0; i < length ; i++) {
			Map<String, Object> mapIn = new Hashtable<String, Object>();
			for (String c : fct.getEntrees()) {
				mapIn.put(c , tableau.get(c).get(i));
			}
			Map<String, Object> mapOut = runLine(mapIn);
			for (String s : mapOut.keySet()) {
				tableau.get(s).add(i, mapOut.get(s));
			}
		}
		return tableau;
	}
	
}

