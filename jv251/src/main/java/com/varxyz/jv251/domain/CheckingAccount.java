package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.OverdraftException;

public class CheckingAccount extends Account {
	private double overdraftAmout;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmout = overdraftAmount;
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			//잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			double overdraftNeeded = amount - balance;
			if(overdraftAmout < overdraftNeeded) {
				throw new OverdraftException("에러 : 대월금 초과", balance, overdraftNeeded);
			}else {
			balance -= amount;// 잔액에서 금액을 뺀다.
			}
		}
	}
		
	public double getOverdraftAmount() {
		return overdraftAmout;
	}
	
	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmout = overdraftAmount;
	}

}