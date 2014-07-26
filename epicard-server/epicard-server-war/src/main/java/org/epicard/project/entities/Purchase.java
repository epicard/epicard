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
public class Purchase {
	@Id
	private @Getter @Setter Long id;
	private @Getter @Setter String name;
	private @Getter @Setter String amount;
	
	@Load @Parent
	private @Getter @Setter Ref<Client> purchaser;
	
	private @Getter @Setter Key<Merchant> merchant;
	private @Getter @Setter Key<Store> store;
	private @Getter @Setter List<Key<Product>> products = new ArrayList<Key<Product>>();

	public Purchase() {}
}
