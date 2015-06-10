package beans;

import javax.enterprise.inject.Model;
import restfortherest.Document;



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
