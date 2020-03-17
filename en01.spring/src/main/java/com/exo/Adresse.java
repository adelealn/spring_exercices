package com.exo;

public class Adresse {

	private String codePostal;
	private String rue;
	private String ville;
	private String pays;
	
	public Adresse() {
		
	}
	
	public Adresse(String codePostal, String rue, String ville, String pays) {
		this.codePostal = codePostal;
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
	}


	public String getCodePostal() {
		return codePostal;
	}
	public String getRue() {
		return rue;
	}
	public String getVille() {
		return ville;
	}
	public String getPays() {
		return pays;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}


	@Override
	public String toString() {
		return "Adresse [codePostal= " + codePostal + ", rue= " + rue + ", ville= " + ville + ", pays= " + pays + "]";
	}
	
	
}
