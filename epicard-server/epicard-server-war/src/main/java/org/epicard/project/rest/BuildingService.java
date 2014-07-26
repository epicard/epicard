package org.epicard.project.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.epicard.project.dao.BuildingDAO;
import org.epicard.project.entities.Building;
 
@Path("/BuildingService")
public class BuildingService {

    BuildingDAO buildingDAO = new BuildingDAO();
	
	@POST
	@Produces("text/html")
    @Consumes(MediaType.APPLICATION_JSON)
	public String addMerchant(Building building) {
		buildingDAO.createBuilding(building);
		return "<h2>Building Saved" + "</h2>";

	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Building findBuildingById(@PathParam("id") Long id) {
		return buildingDAO.getBuilding(id);
	}
 
}


/* Curl commands : 

C:\Users\Mehdi\Documents\Java\curl-7.37.0-win64\bin>curl -v -i -X POST -H "Conte
nt-Type: application/json" -d "{\"id\":1,\"name\":\"Mehdi\",\"num_commercant\":\
"0000321\"}" http://localhost:8080/rest/MerchantService/Ho

*/