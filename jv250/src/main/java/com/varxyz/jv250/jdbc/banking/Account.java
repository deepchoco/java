package com.varxyz.jv250.jdbc.banking;

import java.sql.Timestamp;
import java.util.Date;

public abstract class Account {
	protected String accountNum;//계좌번호
	protected double balance;//잔액
	protected Customer customer;
	protected Date regDate;
	protected char accountType;
	protected long aid;
	
	public Account() {
		
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public Account(String accountNum, double balance) {
		this.setAccountNum(accountNum);
		this.balance = balance;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public void setRegDate(Timestamp timestamp) {
		this.regDate = timestamp;
	}
}


//	private void setAccountNum(String accountNum) {
//		this.accountNum = accountNum;
//	}
//
//
//	public void deposite(double amount) {
//		balance += amount;
//	}
//	
//	public abstract void withdraw(double amount);
//
//
//	public void setCustomer(Customer customer2) {
//		customer = customer2;
//		
//	}
//	
//	
//}
