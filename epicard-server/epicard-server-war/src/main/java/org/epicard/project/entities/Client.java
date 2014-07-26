package org.epicard.project.entities;


//import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import com.googlecode.objectify.annotation.*;

@Entity
@SuppressWarnings("unused")
public class Client {
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String name;
	private @Getter @Setter Location location;
	
	public Client() {}
}
