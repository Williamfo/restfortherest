package beans;

import java.util.List;

import javax.enterprise.inject.Model;

import restfortherest.Document;
import dao.DocumentDAOInterface;



@Model
public class DocumentBean {

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
