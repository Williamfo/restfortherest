package beans;

import javax.enterprise.inject.Model;

import dao.DocumentDAOInterface;
import restfortherest.Document;



@Model
public class DocumentBean implements DocumentDAOInterface {

	private String libelle;
	
	public DocumentBean() {
		
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String save() {
		
		return "ok";
	}

}
