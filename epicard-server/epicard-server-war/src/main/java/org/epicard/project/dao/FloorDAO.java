package org.epicard.project.dao;

import org.epicard.project.entities.Floor;

import com.googlecode.objectify.Objectify;

public class FloorDAO {

	public Floor createFloor(Floor floor) {
		Objectify objectify = OfyService.ofy();
		objectify.save().entity(floor).now(); // async without the now()
		return floor;
	}

	public Floor getFloor(Long id) {
		Objectify objectify = OfyService.ofy();
		Floor floor = objectify.load().type(Floor.class).id(id).now();
		return floor;
	}
	
	public String deleteFloor(Long id) {
		Objectify objectify = OfyService.ofy();
		Floor floor = objectify.load().type(Floor.class).id(id).now();
		objectify.delete().entity(floor);
		return "isDeleted";
	} 

}
