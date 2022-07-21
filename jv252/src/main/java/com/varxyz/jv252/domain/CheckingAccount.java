package com.varxyz.jv252.domain;

import com.varxyz.jv252.exception.OverdraftException;

public class CheckingAccount extends Account {//계좌정보 확인
	private double overdraftAmount;//한도액
	
	public CheckingAccount() {//생성자 클래스와 이름이 같고
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) {//인출, 금액
		if(balance < amount) {
			//잔고부족시 overdraftAmount 금액 한도내에서 추가출금을 승인
			double overdraftNeeded = amount - balance;//출금요구액
			if(overdraftAmount < overdraftNeeded) {//한도액<출금요구액
				throw new OverdraftException("에러 : 대월금 초과", balance, overdraftNeeded);
			}else {
				balance -= amount;// 잔액에서 금액을 뺌
			}
		}
	}

	public double getOverdraftAmount() {//한도액을 가져오겠다
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {//한도액 설정
		this.overdraftAmount = overdraftAmount;
	}
	
}