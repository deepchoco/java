package com.varxyz.banking.domain;

public abstract class Account {
	protected String accountNum;//계좌번호
	protected double balance;//잔액
	protected Customer customer;
	
	public Account(String accountNum, double balance) {
		this.setAccountNum(accountNum);
		this.balance = balance;
	}
	

	private void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}


	public void deposite(double amount) {
		balance += amount;
	}
	
	public abstract void withdraw(double amount);


	public void setCustomer(Customer customer2) {
		customer = customer2;
		
	}
	
	
}
