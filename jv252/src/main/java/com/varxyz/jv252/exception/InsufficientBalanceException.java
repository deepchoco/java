package com.varxyz.jv252.exception;

public class InsufficientBalanceException extends RuntimeException { 
	//RuntimeException : throw 던져도되고 안해도되고
	//CheckdeException : throw 무조건 던져야함
	private static final long serialVersionUID = 1L;
	private double balance;
	
	public InsufficientBalanceException(String msg) {//String타입 들어갈 생성자가 필요함
		super(msg);
	}
	
	public InsufficientBalanceException(String msg, double balance) { 
		super(msg);
		this.balance = balance;
	}
}
