package principale;

public class Vehicule  {

	private  String nom;
	private Integer speed;
	
	
	public Vehicule(String name,Integer vitesse) {
	
	
	this.nom=name;
	this.speed=vitesse;
	
	
	}
	
	public String getName() {
		
		return nom;
		
		
	}
	
	public Integer getVitesse() {
		
		return speed;
		
		
	}
	
	
	public void setName(String name) {
		this.nom=name;
		
		
		
	}
	
	
	public void setVitesse(Integer vitesse) {
		
		
		this.speed=vitesse;
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
