package com.varxyz.jv250.jdbc.banking;

public class CheckingAccount extends Account {
	private double overdraftAmout;
	private static final double DEFAULT_OVERDRAFT = 1000;

	public CheckingAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_OVERDRAFT);
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmout) {
		super(accountNum, balance);
		this.setOverdraftAmout(overdraftAmout);
	}

	public CheckingAccount() {
		
	}

	public void withdraw(double amount) {
		if(balance < amount) {
			//잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			throw new InsufficientBalanceException("잔고부족");
		}else {
			balance -= amount;// 잔액에서 금액을 뺀다.
		}
	}

	public double getOverdraftAmout() {
		return overdraftAmout;
	}

	public void setOverdraftAmout(double overdraftAmout) {
		this.overdraftAmout = overdraftAmout;
	}

	public void setOverdraftAmount(double double1) {
		// TODO Auto-generated method stub
		
	}

}