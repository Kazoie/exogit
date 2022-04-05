package exo;

public class etudiants extends Enseignants {
	


	public final int salaire = 30;
	
	@Override
	public int getsalaire(int nbheures) {
		int result = 0;
		if (nbheures >= 96) {
			result = (96*salaire);
		} else {
			result = (nbheures*salaire);
		}
		
		return result;
	}

}
