package principale;

import java.util.ArrayList;
import java.util.Comparator;

public class Principale {

	
	public static void main(String[] arg){
		
		
	Personne p1=new Personne("oumama",18);
	Personne p2=new Personne("olino",29);
	Personne p3=new Personne("jilali",30);
	 Personne p4=new Personne("omar",17);
	 
	Resource res=new Resource("fichier1");
	Resource res1=new Resource("fichier2");
	 ArrayList <Personne> personnes=new ArrayList <Personne>();
	 ArrayList <Resource> resources=new ArrayList<Resource>();
	 resources.add(res1);
	 resources.add(res);
	 personnes.add(p2);
	 personnes.add(p4);
	 personnes.add(p3);
	 personnes.add(p1);
	 
		
	 for(Personne perso:personnes) {
		 
		System.out.println(perso.getName()); 

	 }
	 
	Comparator comparateurResource=new Comparator<Resource>() {

		@Override
		public int compare(Resource reso1, Resource reso2) {
			
			return reso2.getName().compareTo(reso1.getName());
		}};
		
	 resources.sort(comparateurResource);
	 for(Resource rees:resources) {
		System.out.println(rees.getName());
	 }
	
	 
		Comparator comparateurPerson=new Comparator<Personne>() {

			@Override
			public int compare(Personne pere2, Personne pere1) {
				
				return pere2.getName().compareTo(pere1.getName());
			}};
			
			personnes.sort(comparateurPerson);
	

 for (Personne po:personnes) {
	 System.out.println(po.getAge()+" "+po.getName());
	
 
 }
 
 
 Vehicule voiture1=new Vehicule("mercedes",160);
 Vehicule voiture2=new Vehicule("ford fiesta",140);
 
 ArrayList <Vehicule>listVoiture=new ArrayList<Vehicule>();
 

 listVoiture.add(voiture1);
 listVoiture.add(voiture2);
 
 
 for (Vehicule auto:listVoiture) {
	 
	 System.out.println(auto.getName()+" "+auto.getVitesse());
 }
 
 Comparator comparateurVoiture=new Comparator<Vehicule>() {

	@Override
	public int compare(Vehicule v1, Vehicule v2) {
		
		return v1.getVitesse() - v2.getVitesse();
		}
	};
    listVoiture.sort(comparateurVoiture);
    
    for(Vehicule auto:listVoiture) {
    	
    	System.out.println(auto.getName()+" "+auto.getVitesse());
    	
    }
    
    Avion av1=new Avion("Aero Ae 02",11456);
    Avion av2=new Avion ("AD Scout",2456);
    
    ArrayList<Avion> avions=new ArrayList<Avion>();
    
    avions.add(av1);
    avions.add(av2);
 for(Avion avion:avions) {
	 
	 
	 System.out.println(avion.getName()+" "+avion.getDistance());
	 }
	 
	 Comparator compterAvion=new Comparator<Avion>() {

		@Override
		public int compare(Avion av1, Avion av2) {
			
			return av1.getDistance() - av2.getDistance();
		}
	 };
	 
	 avions.sort(compterAvion);
		
		for(Avion avon:avions) {
			
			
			System.out.println(avon.getName()+" "+avon.getDistance());
		}
		 
		 
		 
		 
	 }
	 
	 
 }

		
