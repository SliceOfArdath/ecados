package fr.n7.swingTableur;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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

	private Set<Contrainte> contraintes;

	public Set<Contrainte> getContraintes() {
		return contraintes;
	}

	public void setContraintes(Set<Contrainte> contraintes) {
		this.contraintes = contraintes;
	}

	public Colonne(String colonneName, List<String> lignes) {
		this.colonneName = colonneName;
		this.lignes = lignes;
		this.contraintes = new LinkedHashSet<>();
	}

	public Colonne(String colonneName, List<String> lignes, Set<Contrainte> contraintes) {
		this.colonneName = colonneName;
		this.lignes = lignes;
		this.contraintes = contraintes;
	}

	public void addContrainte(Contrainte contrainte) {
		contraintes.add(contrainte);
		System.out.println("ajout contrainte");
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
