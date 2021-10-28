package principale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class Principale5 {

	
	

		public static void main (String[]arg) {
		
		
		

		
		
		Map<String, Vehicule> voiture=new HashMap<String, Vehicule>();
		

		
		 Vehicule voiture3=new Vehicule("ford ",100);
		 Vehicule voiture2=new Vehicule("ford fiesta",140);
		 Vehicule voiture1=new Vehicule("mercedes",160);
		
		
		 
		 voiture.put(voiture1.getName(),voiture1);
		 voiture.put(voiture2.getName(),voiture2);
		 voiture.put(voiture3.getName(),voiture3);
		
		 List<Vehicule> voitureByspeed = new ArrayList<>(voiture.values());
		
		
		 Collections.sort(voitureByspeed, Comparator.comparing(Vehicule::getVitesse));
		
		
		
		 for (Vehicule v: voitureByspeed) {
			    System.out.println(v.getName() + " " + v.getVitesse());
			}
		
		
		
		
		
		
		}
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

