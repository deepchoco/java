package com.varxyz.jv251.domain;

import java.util.Date;

public abstract class Account {
	// abstract(추상화 선언) 추상화 되면 객체생성이 안된다 어카운트의 속성이나 정보를 활용하려면 이 어카운트를 상속받아서 써야함
	// 자식 메소드에서 반드시 구현하도록 하기위함
	
	protected long aid;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected Date regDate;
	protected char accountType;
	// super(accountType)을 넘기고 타입이 갱신
		
	public Account() {//생성자 리턴값X, 클래스와 이름같음
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public void setAid(long aid) {// void는 리턴타입이 없음
		this.aid = aid;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public long getAid() {
		return aid;
	}
	
	public String getAccountNum() {
		return accountNum;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}
	
	// 입금기능과 출금기능
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	public abstract void withdraw(double amount);
	
}
