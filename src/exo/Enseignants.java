package exo;

public abstract class Enseignants {
	
	public String pr�nom;
	public String nom;
	public int nbheures;
	

	//get & set prenom
	public void setprenom(String prenom) {
		this.pr�nom = prenom;
	}
	public String getprenom() {
		return pr�nom;
	}
	
	//get & set nom
	public void setnom (String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	
	//get & set nbheures
	public void setHeures(int nbheures) {
		this.nbheures = nbheures;
	}
	public int getheures() {
		return nbheures;
	}
	
	public int getsalaire(int nbheures) {
		int result = 5;
		return result;
	}
	
	public void addheure(int ajout) {
		this.nbheures+=ajout;
	}
	

}
