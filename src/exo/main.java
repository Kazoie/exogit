package exo;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import exo.*;

public class main {
	
	public static void main(String args[]) {
	
	chercheurs abc = new chercheurs();
	abc.setnom("hamon");
	abc.setprenom("clement");
	abc.setHeures(200);
	
	int salary = abc.getsalaire(abc.nbheures);
	int charge = abc.getcharge(salary);
	
	System.out.println("salaire du chercheur " + abc.getNom() + " " + abc.getprenom() + " " + salary);
	System.out.println("charge du chercheur " + abc.getNom() + " " + abc.getprenom() + " " + charge);
	
	
	vacataires cbd = new vacataires();
	cbd.setorga("capgemini");
	cbd.setnom("David");
	cbd.setprenom("Pierre");
	cbd.setHeures(100);
	
	salary = cbd.getsalaire(cbd.nbheures);
	charge = abc.getcharge(salary);
	
	System.out.println("salaire du vacataire " + cbd.nom + " " + cbd.getprenom() + " " +salary); //on peut utiliser le getter manuel ou le truc de base de java
	System.out.println("charge du vacataire " + cbd.getNom() + " " + cbd.getprenom() + " " + charge);
	
	etudiants zpo = new etudiants();
	zpo.setnom("hamon");
	zpo.setprenom("hugo");
	zpo.setHeures(100);
	
	salary = zpo.getsalaire(zpo.nbheures);
	charge = abc.getcharge(salary);
	
	System.out.println("salaire de l'etudiant " + zpo.nom + " " + zpo.prénom +" " + salary);
	System.out.println("charge du etudiant " + zpo.getNom() + " " + zpo.getprenom() + " " + charge);
	
	etudiants ppo = new etudiants();
	ppo.setnom("pipou");
	ppo.setprenom("toto");
	ppo.setHeures(96);
	
	salary = ppo.getsalaire(ppo.nbheures);
	charge = abc.getcharge(salary);
	
	System.out.println("salaire de l'etudiant " + ppo.nom + " " + ppo.prénom +" " + salary);
	System.out.println("charge du etudiant " + ppo.getNom() + " " + ppo.getprenom() + " " + charge);
	
	ArrayList<Enseignants> liste = new ArrayList<Enseignants>();
	
	Enseignants.addListe(abc, liste);
	Enseignants.addListe(cbd, liste);
	Enseignants.addListe(zpo, liste);
	Enseignants.addListe(ppo, liste);
	
	abc.getIndex(2,liste);
	abc.getIndex(3, liste);
	cbd.getIndex(1, liste);
	
	
	System.out.println(liste.size());
	Enseignants.removeListe(ppo, liste);
	abc.getIndex(3,liste);
	
	
	
	}
	
	
	

}
