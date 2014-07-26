package org.epicard.project.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.epicard.project.dao.MerchantDAO;
import org.epicard.project.entities.Merchant;
 
@Path("/MerchantService")
public class MerchantService {

    MerchantDAO merchantDAO = new MerchantDAO();
 
	@GET
	@Path("/{param}")
	@Produces("text/html")
	public String find(@PathParam("param") String param)
	   { 
	         return "<h2>Details on Order #" + param + "</h2>";
	   }
	
	@POST
	@Path("/Ho")
	@Produces("text/html")
    @Consumes(MediaType.APPLICATION_JSON)
	public String addMerchant(Merchant merchant) {
		merchantDAO.createMerchant(merchant);
		return "<h2>Saved" + "</h2>";

	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Merchant findMerchantById(@PathParam("id") Long id) {
		return merchantDAO.getMerchant(id);
	}
 
}


/* Curl commands : 

C:\Users\Mehdi\Documents\Java\curl-7.37.0-win64\bin>curl -v -i -X POST -H "Conte
nt-Type: application/json" -d "{\"id\":1,\"name\":\"Mehdi\",\"num_commercant\":\
"0000321\"}" http://localhost:8080/rest/MerchantService/Ho


C:\Users\Mehdi>curl -v -i -X POST -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"Mehdi\",\"address\":\"Casablanca\",\"floors\":[{\"id\":\"1\",\"name\":\"hommes\"}] }" http://localhost:8080/rest/BuildingService

*/