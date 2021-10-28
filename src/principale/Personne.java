package principale;

public class Personne {
	
	private String nom;
	private int agee;
		
	public Personne(String name,int age) {
		
		
		this.nom=name;
		this.agee=age;
		
			
		
		
	}
	
	
	public String getName() {
		
		return nom;
		
		
	}
	
	public void setName(String nom) {
		this.nom=nom;
	}
	
public int getAge() {
		
		return agee;}
public void setAge(int agee) {
	this.agee=agee;
}
	

}
