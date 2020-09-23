package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bankservice {
	BankServer bancs = new BankServer();

	@GetMapping("/alluser")
	public String nousers() {

		return bancs.getCustomers();
	}

	@RequestMapping("/users/{name}")
	public String user(@PathVariable("name") String uname) {
		return bancs.getCustomer(uname);
	}

	@RequestMapping("/updname/{id}/{name}")
	public String updname(@PathVariable("id") int uid, @PathVariable("name") String uname) {
		return bancs.getUpdCustomerName(uid, uname);
	}

	@RequestMapping("/userid/{id}")
	public String userid(@PathVariable("id") int uid) {

		return bancs.getCustomer(uid);
	}

	@RequestMapping("/ugender/{id}/{sex}")
	public String updgender(@PathVariable("id") int uid, @PathVariable("sex") String usex) {
		return bancs.getUpdCustomerSex(uid, usex);
	}
}
