package fr.eni.ecole.POO.groupeEleves.entite;

public class Classe {

	private String nom;
	private int nbEleves;
	private Eleve[] lstEleves;
	private Parent[] lstParent;
	private Instituteur instituteur;
	private final int NB_MAX = 20;
	
	/**
	 * 
	 */
	public Classe() {
		nbEleves = 0;
		lstEleves = new Eleve[NB_MAX];
	}
	
	/**
	 * @param nom
	 */
	public Classe(String nom) {
		this.nom = nom;
	}
	
	/** 
	 * @param lstEleve
	 * @throws ClasseException
	 */
	public void addEleve(Eleve e) throws ClasseException {
		if (nbEleves < NB_MAX) {
			lstEleves[nbEleves++] = e;			
		} else {
			throw new ClasseException("Nombre max d'eleves atteint pour cette classe.");
		}
	}

	/**
	 * @return the eleve
	 */
	public Eleve getEleve(int index) throws ClasseException {
		if (index >= 0 && index < nbEleves) {
			// Alors l'index existe dans le tableau et il y a un éléve renseigné
			return lstEleves[index];
		} else {
			// L'index est incorrect.
			throw new ClasseException("La classe ne contient que " + nbEleves + " élèves");
		}
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
	public Parent[] getListParent() {
		return lstParent;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param instituteur
	 */
	public void setInstituteur(Instituteur instituteur) {
		this.instituteur = instituteur;
	}
	
	/**
	 * @return the instituteur
	 */
	public Instituteur getInstituteur() {
		return instituteur;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---------------------------------------------------").append("\n");
		result.append("Classe : ").append(this.nom).append("\n");
		result.append("   Instituteur : ").append(this.instituteur.getPrenom()).append(" ")
				.append(this.instituteur.getNom()).append("\n");
		result.append("     avec :").append("\n");
		for (int i = 0; i < nbEleves; i++) {
			Eleve eleve = lstEleves[i];
			result.append("     ").append(eleve.getPrenom()).append(" ").append(eleve.getNom()).append("\n");
		}
		result.append("---------------------------------------------------");
		return result.toString();
	}
}
