package com;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bankservice {
	BankServer bancs = new BankServer();

	@GetMapping("/alluser")
	public List<Customer> hello() {

		return bancs.getCustomers();
	}

	@RequestMapping("/user/{name}")
	public Customer user(@PathVariable("name") String uname) {
		return bancs.getCustomer(uname);
	}

	@RequestMapping("/updname/{id}/{name}")
	public Customer updname(@PathVariable("id") int uid, @PathVariable("name") String uname) {
		return bancs.getUpdCustomerName(uid, uname);
	}

	@RequestMapping("/user/{id}")
	public Customer userid(@PathVariable("id") int uid) {

		return bancs.getCustomer(uid);
	}

	@RequestMapping("/ugender/{id}/{sex}")
	public Customer updgender(@PathVariable("id") int uid, @PathVariable("sex") String usex) {
		return bancs.getUpdCustomerSex(uid, usex);
	}
}
