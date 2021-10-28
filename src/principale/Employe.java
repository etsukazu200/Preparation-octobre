package principale;

import java.util.Date;

public class Employe {
	
	private String id;
	private String numero;
	
	private String nom;
	
	private String nom_fonction;
	
	
	private String matricule;
	
	private String prenom;
	private String nom_service;
	private String dateNaissance;
	private String dateEmbauche;
	
	private String sex;

	

	
	
	
	public  Employe(String ide,String numero,String nom,String prenom,String nomfoction,String dateEmbauche,String nomservice) {
		
		
		this.id=ide;
		this.numero=numero;
		
		this.nom=nom;
		this.prenom=prenom;
		this.nom_fonction=nomfoction;
		this.dateNaissance=dateNaissance;
		this.dateEmbauche=dateEmbauche;
		this.sex=sex;
		this.matricule=matricule;
		
		this.nom_service=nomservice;
		
		
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom_fonction() {
		return nom_fonction;
	}


	public void setNom_fonction(String nom_fonction) {
		this.nom_fonction = nom_fonction;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	


	public String getNom_service() {
		return nom_service;
	}


	public void setNom_service(String nom_service) {
		this.nom_service = nom_service;
	}


	public String getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getDateEmbauche() {
		return dateEmbauche;
	}


	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	
	
	
	

}
