package exo;

public class vacataires extends Enseignants {

	public String organisme;

	public final int salaire = 40;
	
	public void setorga(String name) {
		this.organisme = name;
	}
	
	
	@Override
	public int getsalaire(int nbheures) {
		int result = 0;
		result = (nbheures* salaire);
		return result;
	}
	
	

}
