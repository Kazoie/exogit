package exo;

import java.util.ArrayList;

public class chercheurs extends Enseignants {

	public final int salaire = 40;
	
	@Override
	public void newEnseignants(String nom, String prénom) {
		this.nom = nom;
		this.prénom = prénom;
	}
	
	
	@Override
	public int getsalaire(int nbheures) {
		int result = 0;
		if (nbheures == 192) {
			result = 2000*12;
		} else if ( nbheures < 192) {
			result = (nbheures * salaire)*12;
		} else if (nbheures > 192) {
			result = (2000*12) + (nbheures- 192)*salaire;
		}
		return result;
	}
	
	public int getcharge(int salaire) {
		return (30*salaire)/100;
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
		System.out.println("A l'index " + index + " de notre liste se trouve " + prenom + " " + nom + " qui a travailler "+ nbheures + " heures pour un salaire de "+ salaire
				+ " euros "+ " et dont les charges s'élèvent à "+ charge);
	}


}
