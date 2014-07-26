package org.epicard.project.dao;

import java.util.List;

import org.epicard.project.entities.Merchant;

import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class MerchantDAO {

	public Merchant createMerchant(Merchant merchant) {
		ObjectifyService.register(Merchant.class);
		ofy().save().entity(merchant).now(); // async without the now()
		return merchant;
	}

	public Merchant getMerchant(Long id) {
		ObjectifyService.register(Merchant.class);
		Merchant merchant = ofy().load().type(Merchant.class).id(id).now();
		return merchant;
	}
	/*
	public List<Memo> getMemoList() {
		ObjectifyService.register(Memo.class);
		List<Memo> memo = ofy().load().type(Memo.class).list();
		return memo;
	}

	public String deleteCar(Long id) {
		ObjectifyService.register(Memo.class);
		Memo memo = ofy().load().type(Memo.class).id(id).now();
		ofy().delete().entity(memo);
		return "isDeleted";
	} */

}
