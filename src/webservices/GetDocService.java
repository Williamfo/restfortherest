package webservices;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

import restfortherest.Document;
import dao.DocumentDAO;
import dao.DocumentDAOInterface;

@Path("getdoc")
public class GetDocService {

	@Inject
	DocumentDAOInterface documentDAOInterface;
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Document> findDocuments() {
		
		return documentDAOInterface.findDocuments();
	}
	
}
