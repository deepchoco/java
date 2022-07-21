package com.varxyz.banking.domain;

import java.util.*;

public class Customer {
	protected String name;
	protected String ssn;
	protected String phone;
	protected String customerId;
	protected String passwd;
//	protected List<Account> accountList;
	
	public Customer(String name, String ssn, String phone, String customerId, String passwd) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.customerId = customerId;
		this.passwd = passwd;
	}
	
	public String getSsn() {
		return this.ssn;
	}// 주민번호 가져올때 사용
}