package principale;



import java.util.Comparator;
import java.util.TreeSet;

public class Principetreeset {

	
	
	
public static void main(String[]arg) {
		
		
		
		Vehicule voiture1=new Vehicule("mercedes",170);
		
		Vehicule voiture2=new Vehicule("ford",130);
		
		Vehicule voiture3=new Vehicule("ford fiesta",100);
		Vehicule voiture4=new Vehicule("range rover",190);
		
		
		Comparator<Vehicule> compteurVoiture=new Comparator<Vehicule>() {

			@Override
			public int compare(Vehicule v1, Vehicule v2) {
				// TODO Auto-generated method stub
				return v1.getVitesse() - v2.getVitesse();
			}
			
		};
		
		
		//TreeSet<Vehicule> hset=new TreeSet<Vehicule>(new mySpeedComparator());
		
		TreeSet<Vehicule> hset=new TreeSet<Vehicule>(compteurVoiture);
		hset.add(voiture1);
		hset.add(voiture2);
		hset.add(voiture3);
		hset.add(voiture4);
		
		
		
		
		

		
		System.out.println(" aprés le tri");
		
		for(Vehicule v:hset) {
			
			System.out.println(v.getName()+" "+v.getVitesse());
		}
		
		
	
	
	
	
	
	
	
}
}
