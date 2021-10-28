package principale;

public class Avion {

	private String nom;
	private Integer distance;
	
	
public Avion(String name,Integer distanc) {
	
	
	this.distance=distanc;
	this.nom=name;
	
	
	
}	
	
	public String getName() {
		
		
		return nom;
			
	}
	
	
	 public Integer getDistance() {
		 
		 return distance;
		 
	 }
	
	
	public void setName(String nom) {
		
		
		this.nom=nom;
		
	}
	
	public void setDistance(Integer d) {
		
		
		
		this.distance=d;
		
		
		
	}
	
	
}
