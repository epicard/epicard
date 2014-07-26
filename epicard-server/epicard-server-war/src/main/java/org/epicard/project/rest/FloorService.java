package org.epicard.project.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.epicard.project.dao.FloorDAO;
import org.epicard.project.entities.Floor;
 
@Path("/FloorService")
public class FloorService {

    FloorDAO floorDAO = new FloorDAO();
	
	@POST
	@Produces("text/html")
    @Consumes(MediaType.APPLICATION_JSON)
	public String addFloor(Floor floor) {
		floorDAO.createFloor(floor);
		return "<h2>Floor Saved" + "</h2>";

	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Floor findBuildingById(@PathParam("id") Long id) {
		return floorDAO.getFloor(id);
	}
 
}


/* Curl commands : 

C:\Users\Mehdi\Documents\Java\curl-7.37.0-win64\bin>curl -v -i -X POST -H "Conte
nt-Type: application/json" -d "{\"id\":1,\"name\":\"Mehdi\",\"num_commercant\":\
"0000321\"}" http://localhost:8080/rest/MerchantService/Ho

*/