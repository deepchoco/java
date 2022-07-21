package com.varxyz.banking.domain;

public class SavingAccount extends Account{
	private double interestRate;
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	
	public SavingAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			throw new InsufficientBalanceException("잔고부족");
		}
		super.balance -= amount;
	}
}
