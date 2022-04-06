package exo;

import java.util.ArrayList;

public class vacataires extends Enseignants {

	public String organisme;
	public final int salaire = 40;
	
	
	@Override
	public void newEnseignants(String nom, String prénom) {
		this.nom = nom;
		this.prénom = prénom;
	}
	
	public void setorga(String name) {
		this.organisme = name;
	}
	
	@Override
	public int getsalaire(int nbheures) {
		int result = 0;
		result = (nbheures* salaire);
		return result;
	}
	
	public int getcharge(int salaire) {
		return (10*salaire)/100;
	}
	
	public void getIndex(int index, ArrayList<Enseignants> liste) {
		if (index >= liste.size()) {
			System.out.println("Mauvais index, la taille actuelle de la liste est " + liste.size());
			return;
		}
		String nom = liste.get(index).nom;
		String prenom = liste.get(index).prénom;
		int nbheures = liste.get(index).nbheures;
		int salaire = getsalaire(liste.get(index).nbheures);
		int charge = getcharge(getsalaire(liste.get(index).nbheures));
		System.out.println("A l'index " + index + " de notre liste se trouve " + prenom + " " + nom + " qui travaille pour " + organisme + " et  a travailler "+ nbheures + " heures pour un salaire de "+ salaire
				+ " euros "+ " et dont les charges s'élèvent à "+ charge);
	}
	

}
