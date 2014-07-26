package org.epicard.project.entities;

import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@SuppressWarnings("unused")
public class Building {
	
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String name;	
	private @Getter @Setter String address;
	
	@Getter @Setter private  Floor floor;
	
	public Building () {}

}
