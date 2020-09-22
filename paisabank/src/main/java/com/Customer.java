package com;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement

public class Customer {
	private String username;
	private String usergender;
    private int userid;
    private int accountno;
    private double amount;
    
	public String getUsername() {
		return username;
	}
	public String getUsergender() {
		return usergender;
	}
	public int getUserid() {
		return userid;
	}
	public int getAccountno() {
		return accountno;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}


}
