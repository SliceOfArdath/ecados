package fr.n7.swingTableur;

import java.util.List;
import java.util.StringJoiner;

public class Colonne {
	/**
	 * Nom de la colonne
	 */
	private String colonneName;
	
	/**
	 * Ensemble des string de chaque ligne
	 */
	private List<String> lignes;

	public Colonne(String colonneName, List<String> lignes) {
		this.colonneName = colonneName;
		this.lignes = lignes;
	}
	

	public String getColonneName() {
		return colonneName;
	}

	public void setColonneName(String colonneName) {
		this.colonneName = colonneName;
	}

	public List<String> getLignes() {
		return lignes;
	}

	public void setLignes(List<String> lignes) {
		this.lignes = lignes;
	}	

}
