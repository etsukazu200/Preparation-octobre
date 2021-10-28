package principale;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Principeset {

	
	public static void main(String[]arg) {
		
		
		
		Vehicule voiture1=new Vehicule("mercedes",170);
		
		Vehicule voiture2=new Vehicule("ford",130);
		
		Vehicule voiture3=new Vehicule("ford fiesta",100);
		Vehicule voiture4=new Vehicule("range rover",190);
		HashSet<Vehicule> hset=new HashSet<Vehicule>();
		
		hset.add(voiture1);
		hset.add(voiture2);
		hset.add(voiture3);
		hset.add(voiture4);
		
		
		System.out.println(" avant le tri");
		for(Vehicule v:hset) {
			
			System.out.println(v.getName()+" "+v.getVitesse());
			
		}
		
		
		List<Vehicule> listhset=new ArrayList<Vehicule>(hset);
	
		    
		
		Collections.sort(listhset,Comparator.comparing(Vehicule::getVitesse));
		
		System.out.println(" aprés le tri");
		
		for(Vehicule v:listhset) {
			
			System.out.println(v.getName()+" "+v.getVitesse());
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
