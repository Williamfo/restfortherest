package restfortherest;

import java.io.Serializable;

import javax.persistence.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;


/**
 * The persistent class for the document database table.
 * 
 */
@Entity
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
@ApplicationPath("/restfortherest")
@Table(name="document")
@XmlRootElement(name="Document")
public class Document extends Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private byte[] file;

	private String libelle;

	private BigDecimal x;

	private BigDecimal y;

	public Document() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getFile() {
		return this.file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getX() {
		return this.x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public BigDecimal getY() {
		return this.y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

}