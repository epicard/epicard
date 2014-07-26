package org.epicard.project.entities;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@SuppressWarnings("unused")
public class Floor {
	
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String name;	
	//private @Getter @Setter Ref<Building> building;    
	
	public Floor () {}

}
