package webservices;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;


@Path("hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello, sir!";
	}
	
}
