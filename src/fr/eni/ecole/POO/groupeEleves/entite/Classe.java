package fr.eni.ecole.POO.groupeEleves.entite;

public class Classe {

	public String nom;
	public int nbEleves;
	public Eleve[] lstEleves;
	public Parent[] lstParent;
	public Instituteur instituteur;
	
	/**
	 * 
	 */
	public Classe() {
		
	}
	
	/**
	 * @param nom
	 */
	public Classe(String nom) {
		this.nom = nom;
	}
	
	/** 
	 * @param lstEleve
	 */
	public void addEleve(Eleve e) {
		lstEleves[nbEleves++] = e;
	}

	/**
	 * @return the eleve
	 */
	public Eleve getEleve(int index) {
		return lstEleves[index];
	}
	
	/**
	 * @return the lstEleves
	 */
	public Eleve[] getLstEleves() {
		return lstEleves;
	}
	
	/**
	 * @return the lstParent
	 */
	public Parent[] getLstParent() {
		return lstParent;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @return the instituteur
	 */
	public Instituteur getInstituteur() {
		return instituteur;
	}
}
