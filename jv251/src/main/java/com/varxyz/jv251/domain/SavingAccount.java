package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.InsufficientBalanceException;

public class SavingAccount extends Account{
	private double interestRate;//이자율
	
	public SavingAccount() {//생성자
		
	}
	
	public SavingAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0);
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);//부모것을 가져다 쓰겠다
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			throw new InsufficientBalanceException("잔고부족");//String타입이 들어감
		}
		super.balance -= amount;//account에서 추상메서드로 선언해서 여기서 구현
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
