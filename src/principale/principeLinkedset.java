package principale;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class principeLinkedset {
	

public static void main(String[] arg) {
	
	 Set<Vehicule> linkhasset = new LinkedHashSet<Vehicule>();
	 
	 
	 
     Vehicule voiture1=new Vehicule("ford big",150);
     Vehicule voiture2=new Vehicule("merdeces",190);
     Vehicule voiture3=new Vehicule("congo",120);
      
	
     linkhasset.add(voiture1);
     linkhasset.add(voiture2);
     linkhasset.add(voiture3);
	
	
	
	for(Vehicule v:linkhasset) {
		
		
		System.out.println(v.getName()+" "+v.getVitesse());
		
		
		
	}
	
	
	TreeSet<Vehicule> treset=new TreeSet<Vehicule>(new mySpeedComparator());
	
	treset.addAll(linkhasset);
	
   for(Vehicule v:treset) {
		
		
		System.out.println(v.getName()+" "+v.getVitesse());
		
		
		
	}
	
	
	
}
}
