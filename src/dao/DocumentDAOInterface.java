package dao;

import java.util.List;

import restfortherest.Document;

public interface DocumentDAOInterface {
	
	public String save();

	public List<Document> findDocuments();
}
