package principale;

import java.util.Comparator;
import java.util.LinkedList;

public class Principale1 {
	
	
	
	public static void main(String[] arg) {
		
		Personne p1=new Personne("oumama",18);
		Personne p2=new Personne("olino",29);
		LinkedList<Personne> linkPersonne=new LinkedList<Personne>();
		
		linkPersonne.add(p1);
		linkPersonne.add(p2);
		 for(Personne p:linkPersonne) {
			 
			 System.out.println(p.getAge()+" "+p.getName());
			 
			 
		 }
		
		 Comparator compteurPersonne=new Comparator<Personne>() {

			@Override
			public int compare(Personne p1, Personne p2) {
				
				return p1.getAge() - p2.getAge();
			}
			 
			 
			
		 };
		 
		 linkPersonne.sort(compteurPersonne) ;
		 
 for(Personne p:linkPersonne) {
			 
			 System.out.println(p.getAge()+" "+p.getName());
			 
			 
		 }
 
 
 Comparator compteurPersonnes=new Comparator<Personne>() {

		@Override
		public int compare(Personne p1, Personne p2) {
			
			return p1.getName().compareTo( p2.getName());
		}
		 
		
	 };
		

	 linkPersonne.sort(compteurPersonnes);
	 
	 
	 for(Personne p:linkPersonne) {
		 
		 System.out.println(p.getAge()+" "+p.getName());
		 
		 
	 }
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
