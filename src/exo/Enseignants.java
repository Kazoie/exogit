package exo;

import java.util.ArrayList;

public abstract class Enseignants {
	
	public String prénom;
	public String nom;
	public int nbheures;
	
	//constructeur
	public abstract void newEnseignants(String nom, String prénom);
	

	//get & set prenom
	public void setprenom(String prenom) {
		this.prénom = prenom;
	}
	public String getprenom() {
		return prénom;
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
	
	public abstract int getsalaire(int nbheures);
	
	public abstract int getcharge(int salaire); 
	
	public void addheure(int ajout) {
		this.nbheures+=ajout;
	}
	
	public static void addListe(Enseignants teacher, ArrayList<Enseignants> liste) {
		liste.add(teacher);
	}
	
	public static void removeListe(Enseignants teacher, ArrayList<Enseignants> liste) {
		int index = liste.indexOf(teacher);
		liste.remove(index);
	}
	
	public static void removeListewithIndex(int index, ArrayList<Enseignants> liste) {
		liste.remove(index);
	}
	
	
	public abstract void getIndex(int index, ArrayList<Enseignants> liste);
	
	

}
