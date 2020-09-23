package com;

import java.util.ArrayList;
import java.util.List;

public class BankServer {

	List<Customer> customers;

	public BankServer() {
		customers = new ArrayList<>();
		Customer c = new Customer();
		c.setUsername("Gautam");
		c.setAccountno(02345);
		c.setUserid(1001);
		c.setUsergender("Male");
		c.setAmount(2000);

		Customer c1 = new Customer();
		c1.setUsername("Jain");
		c1.setAccountno(03425);
		c1.setUserid(1003);
		c1.setUsergender("Male");
		c1.setAmount(6000);
		customers.add(c);
		customers.add(c1);

	}

	public String getCustomers() {

		return "Welcome User ! Paisa Bank has total of " + customers.size() + " customer";
	}

	public String getCustomer(int id) {

		for (Customer c : customers) {
			if (c.getUserid() == id) {

				return "Welcome " + c.getUsername() + ", Your user Id is = " + c.getUserid();
			}
		}

		return "User Not Found";
	}

	public String getCustomer(String name) {

		for (Customer c : customers) {

			if (c.getUsername().equals(name)) {

				return "Welcome " + c.getUsername() + ", Your user Id is = " + c.getUserid();
			}
		}

		return "User Not Found";
	}

	public String getUpdCustomerSex(int id, String gender) {

		for (Customer c : customers) {
			if (c.getUserid() == id) {
				c.setUsergender(gender);
				return "Welcome " + c.getUsername() + ", Your user Id is =" + c.getUserid()
						+ ". You have changed your gender to " + c.getUsergender();
			}
		}

		return "User Not Found";
	}

	public String getUpdCustomerName(int id, String name) {

		for (Customer c : customers) {
			if (c.getUserid() == id) {

				String message = "Welcome " + c.getUsername() + ", Your user Id is =" + c.getUserid()
						+ ". You have changed your name " + c.getUsername() + " to " + name;
				c.setUsername(name);
				return message;
			}
		}

		return "User Not Found";
	}

	public String getCustomerBalance(int uid) {
		for (Customer c : customers) {
			if (c.getUserid() == uid) {
				return "You have balance of " + c.getAmount() + " Rs";
			}
		}
		return "User Not Found";
	}

	public String getCustomerDeposite(int uid, double uamount) {
		for (Customer c : customers) {
			if (c.getUserid() == uid) {
				double total = c.getAmount() + uamount;
				c.setAmount(total);
				return "You have total balance of " + total + " Rs";
			}
		}
		return "User Not Found";
	}

	public String getCustomerWithdraw(int uid, double uamount) {
		for (Customer c : customers) {
			if (c.getUserid() == uid) {
				double total = c.getAmount() - uamount;
				if (total < 0) {
					return "Insuffient Balance to withdraw !! You have total balance of " + c.getAmount() + " Rs";
				} else {
					c.setAmount(total);
					return "You have total balance of " + total + " Rs";
				}
			}
		}
		return "User Not Found";
	}

	public String getCustomerInterest(int uid, double uamount) {
		for (Customer c : customers) {
			if (c.getUserid() == uid) {
				double total = (uamount * 0.6)/100;
				return "You will get total intrest of " + total + " Rs";
			}
		}
		return "User Not Found";
	}

	public String getCustomerInfo(int uid) {
		for (Customer c : customers) {
			if (c.getUserid() == uid) {
				return "Welcome " + c.getUsername() + ", You have total balance of " + c.getAmount()
						+ " Rs and Your account number is " + c.getAccountno();
			}
		}
		return "User Not Found";
	}
}
