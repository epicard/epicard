package org.epicard.project.dao;

import org.epicard.project.entities.Building;
import com.googlecode.objectify.Objectify;

public class BuildingDAO {

	public Building createBuilding(Building building) {
		Objectify objectify = OfyService.ofy();
		objectify.save().entity(building).now(); // async without the now()
		return building;
	}

	public Building getBuilding(Long id) {
		Objectify objectify = OfyService.ofy();
		Building building = objectify.load().type(Building.class).id(id).now();
		return building;
	}
	
	public String deleteBuilding(Long id) {
		Objectify objectify = OfyService.ofy();
		Building building = objectify.load().type(Building.class).id(id).now();
		objectify.delete().entity(building);
		return "isDeleted";
	} 

}
