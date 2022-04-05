package exo;

public class chercheurs extends Enseignants {



	public final int salaire = 40;
	
	
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
	


}
