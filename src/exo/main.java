package exo;
import exo.*;

public class main {
	
	public static void main(String args[]) {
	
	chercheurs abc = new chercheurs();
	abc.setnom("hamon");
	abc.setprenom("clement");
	abc.setHeures(200);
	
	int salary = abc.getsalaire(abc.nbheures);
	
	System.out.println("salaire du chercheurs " + abc.getNom() + " " + abc.getprenom() + " " + salary);
	
	
	vacataires cbd = new vacataires();
	cbd.setorga("capgemini");
	cbd.setnom("David");
	cbd.setprenom("Pierre");
	cbd.setHeures(100);
	
	salary = cbd.getsalaire(cbd.nbheures);
	
	System.out.println("salaire du vacataire " + cbd.nom + " " + cbd.getprenom() + " " +salary); //on peut utiliser le getter manuel ou le truc de base de java
	
	
	etudiants zpo = new etudiants();
	zpo.setnom("hamon");
	zpo.setprenom("hugo");
	zpo.setHeures(100);
	
	salary = zpo.getsalaire(zpo.nbheures);
	
	System.out.println("salaire de l'etudiant " + zpo.nom + " " + zpo.prénom +" " + salary);
	
	etudiants ppo = new etudiants();
	ppo.setnom("pipou");
	ppo.setprenom("toto");
	ppo.setHeures(96);
	
	salary = ppo.getsalaire(ppo.nbheures);
	
	System.out.println("salaire de l'etudiant " + ppo.nom + " " + ppo.prénom +" " + salary);
	
	
	}
	
	
	

}
