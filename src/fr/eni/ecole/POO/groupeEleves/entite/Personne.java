package fr.eni.ecole.POO.groupeEleves.entite;

import java.time.LocalDate;

public class Personne {
	
	public String nom;
	public String prenom;
	public String adresse;
	public LocalDate ddn;
	
	
	/**
	 * 
	 */
	public Personne() {
		// Constructeur simple
	}
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ddn
	 */
	public Personne(String nom, String prenom, String adresse, LocalDate ddn) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ddn = ddn;
	}
	
	
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the ddn
	 */
	public LocalDate getDdn() {
		return ddn;
	}

	/**
	 * @param ddn the ddn to set
	 */
	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

	@Override
	public String toString() {
		return "Personne[nom= " + nom + ", prénom= " + prenom + ", adresse= " + adresse + "Date de naissance=" + ddn + "]";
	}
	
}
