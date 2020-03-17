package com.exo;

import java.util.List;

public class Client {

	private String nom, prenom;
	private Integer age;
	private java.util.List<Adresse> adresses;
	
	public Client() {
		
	}
	
	
	public Client(String nom, String prenom, Integer age, java.util.List<Adresse> adresses) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresses = adresses;
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
	public java.util.List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(java.util.List<Adresse> adresses) {
		this.adresses = adresses;
	}


	@Override
	public String toString() {
		return "Client [nom= " + nom + ", prenom= " + prenom + ", age= " + age +", "+ adresses.toString() +"]";
	}
	
	
}
