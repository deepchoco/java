package com.varxyz.jv250.jdbc.banking;

import java.util.Date;

public class SavingAccount extends Account{
	private double interestRate;
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	
	public SavingAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.setInterestRate(interestRate);
	}
	
	public SavingAccount() {
		
	}

	public void withdraw(double amount) {
		if(balance - amount < 0) {
			throw new InsufficientBalanceException("잔고부족");
		}
		super.balance -= amount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setRegDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setAccountType(char accountType) {
		// TODO Auto-generated method stub
		this.accountType = accountType;
	}
}
