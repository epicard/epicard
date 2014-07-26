package org.epicard.project.entities;


//import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.*;

@Entity
@SuppressWarnings("unused")
public class Store {
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String name;
	private @Getter @Setter String address;
	private @Getter @Setter Location location;
	
	@Load @Parent
	private @Getter @Setter Ref<Merchant> owner;
	
	private @Getter @Setter List<Key<Product>> products = new ArrayList<Key<Product>>();
	private @Getter @Setter List<Key<Notification>> notifications = new ArrayList<Key<Notification>>();
	
	public Store() {}
}
