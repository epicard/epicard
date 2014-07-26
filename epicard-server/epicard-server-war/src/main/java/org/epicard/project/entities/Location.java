package org.epicard.project.entities;


//import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import com.googlecode.objectify.annotation.*;

@Entity
@SuppressWarnings("unused")
public class Location {
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String lat;
	private @Getter @Setter String lng;
	private @Getter @Setter float accuracy;
	
	public Location() {}
}
