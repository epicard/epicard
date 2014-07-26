package org.epicard.project.entities;


//import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.*;

@Entity
@SuppressWarnings("unused")
public class Product {
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String name;
	private @Getter @Setter String price;
	
	public Product() {}
}
