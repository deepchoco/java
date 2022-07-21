package com.varxyz.jv252.domain;

import java.util.Date;

public abstract class Account {
	//  *abstract(추상화 선언)*추상화 되면 객체생성이 안댐
	// 이런 어카운트의 속성이나 정보를 활용하려면 이 어카운트를 상속받아서 쓰는거임
	
	//변수 선언
	
	protected long aid; // account id
	protected String accountNum; //계좌번호
	protected double balance; //계좌잔액
	protected Customer customer; //중요함2 손님왜만듬? 개념적으로 중요함
	//손님이 있어야 계좌를 생성할수 있음
	protected Date regDate;//생성날짜
	protected char accountType; //추상화 하고 분파가 댐 딴걸로 그 애가 이제 생성을 할꺼임
	// 생성자가 생김 -> super(accountType)을 넘길꺼임 이떄 이 타입이 갱신되는거임 그래서 이애가 겁나중욯마\
		
	// 생성자임 진짜 모르면 죽여버릴꺼임
	// 생성자 특징 : 리턴값있음? -> 리턴값없음 // 이름이 어떄? 생성자이름은 클래스랑 같음
	public Account() {
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	//get,set메소드는 외부에서변수값에 직접적으로 접근하지 못하게 막기위함
	public void setAid(long aid) {// void는 리턴타입이 없음
		this.aid = aid;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//계좌 정보를 받아오기
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
