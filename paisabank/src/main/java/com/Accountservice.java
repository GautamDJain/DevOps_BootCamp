package com;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Accountservice {

	BankServer bancs = new BankServer();

	@RequestMapping("/balance/{id}")
	public String balance(@PathVariable("id") int uid) {
		return bancs.getCustomerBalance(uid);
	}

	@RequestMapping("/deposite/{id}/{amount}")
	public String deposite(@PathVariable("id") int uid, @PathVariable("amount") double uamount) {
		return bancs.getCustomerDeposite(uid, uamount);
	}

	@RequestMapping("/withdraw/{id}/{amount}")
	public String withdraw(@PathVariable("id") int uid, @PathVariable("amount") double uamount) {
		return bancs.getCustomerWithdraw(uid, uamount);
	}

	@RequestMapping("/intrest/{id}/{amount}")
	public String intrest(@PathVariable("id") int uid, @PathVariable("amount") double uamount) {
		return bancs.getCustomerInterest(uid, uamount);
	}

	@RequestMapping("/accinfo/{id}")
	public String info(@PathVariable("id") int uid) {
		return bancs.getCustomerInfo(uid);
	}

}
