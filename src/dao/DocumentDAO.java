package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import restfortherest.Document;

@Stateless
public class DocumentDAO implements DocumentDAOInterface {
	
	@PersistenceContext
	EntityManager em;
	
		public DocumentDAO() {
	}

	@Override
	public String save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> findDocuments() {
		return em.createNamedQuery("Document.findAll").getResultList();
	}

}
