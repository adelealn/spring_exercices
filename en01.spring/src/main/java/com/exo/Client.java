package com.exo;

public class Client {

	private String nom, prenom;
	private Integer age;
	private Adresse adresse;
	
	public Client() {
		
	}
	
	
	public Client(String nom, String prenom, Integer age, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}


	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	@Override
	public String toString() {
		return "Client [nom= " + nom + ", prenom= " + prenom + ", age= " + age +", "+ adresse +"]";
	}
	
	
}
