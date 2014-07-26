package org.epicard.project.dao;

import org.epicard.project.entities.Building;
import org.epicard.project.entities.Floor;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {
	
	static {
        ObjectifyService.register(Building.class);
        ObjectifyService.register(Floor.class);
    }

    public static Objectify ofy() {
    	return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }

}
