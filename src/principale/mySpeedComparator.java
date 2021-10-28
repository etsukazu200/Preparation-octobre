package principale;

import java.util.Comparator;

public class mySpeedComparator  implements Comparator<Vehicule>  {

	@Override
	public int compare(Vehicule v1, Vehicule v2) {
		
		return v1.getVitesse() - v2.getVitesse();
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
