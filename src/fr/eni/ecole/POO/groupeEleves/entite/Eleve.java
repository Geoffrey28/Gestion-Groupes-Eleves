package fr.eni.ecole.POO.groupeEleves.entite;

import java.time.LocalDate;

public class Eleve extends Personne {

	public Parent referent;
	
	public Eleve() {
		super();
	}

	public Eleve(String nom, String prenom, String adresse, LocalDate ddn) {
		super(nom, prenom, adresse, ddn);
	}

	/**
	 * @return the parent
	 */
	public Parent getReferent() {
		return referent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setReferent(Parent referent) {
		this.referent = referent;
	}
	
	@Override
	public String toString() {
		return "Eleve [referent= " + referent + "]";
	}
	
	
	
}
