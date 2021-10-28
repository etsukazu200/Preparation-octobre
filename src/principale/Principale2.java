package principale;

import java.util.Comparator;
import java.util.Vector;

public class Principale2 {
	
	
	public static  void main(String[]arg) {
		
		Vector<Avion> vAvion=new Vector<Avion>();
		
		
		
		Vector<Vehicule> vAuto=new Vector<Vehicule>();
		
		
		Vehicule v1=new Vehicule("Mercedes",160);
		Vehicule v2=new Vehicule("ford",140);
		
		Avion av1=new Avion("Aero Ae 02",14569);
		Avion av2=new Avion("AD Scout",12457);
		
		vAuto.add(v1);
		vAuto.add(v2);
		
		for(int i=0;i<vAuto.size();i++) {
		
		System.out.println(vAuto.get(i).getName()+" "+vAuto.get(i).getVitesse());
		}
		
		
		
		Comparator compteurVehicule=new Comparator<Vehicule>() {

			@Override
			public int compare(Vehicule v1, Vehicule v2) {
				
				return v1.getVitesse() - v2.getVitesse();
			}
			
		};
		
		vAuto.sort(compteurVehicule);
		for(int i=0;i<vAuto.size();i++) {
			
			System.out.println(vAuto.get(i).getName()+" "+vAuto.get(i).getVitesse());
			}
			
		
		vAvion.add(av1);
		vAvion.add(av2);
		 for (int i=0;i<vAvion.size();i++)
		 {
		  System.out.println(vAvion.get(i).getName()+" "+vAvion.get(i).getDistance());
		 }
		
		 Comparator compteurAvion=new Comparator<Avion>() {

			@Override
			public int compare(Avion av1, Avion av2) {
			
				return av2.getDistance() - av1.getDistance();
			}
			 
			 
			 
		 };
		 
		 vAvion.sort(compteurAvion);
		 
		 for (int i=0;i<vAvion.size();i++)
		 {
		  System.out.println(vAvion.get(i).getName()+" "+vAvion.get(i).getDistance());
		 }
		
		
		
		
	}
	
	
	
	
	
	
 
}
