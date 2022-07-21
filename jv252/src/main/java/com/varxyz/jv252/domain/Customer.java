package com.varxyz.jv252.domain;

import java.util.List;

public class Customer {
	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", ssn=" + ssn + ", phone=" + phone + ", userId=" + userId
				+ ", passwd=" + passwd + ", accountList=" + accountList + "]";
	}

	private long cid;//customerid
	private String name;//이름
	private String ssn;//주민번호
	private String phone;//전화번호
	private String userId;//고객Id
	private String passwd;//비밀번호
	private List<Account> accountList;//?
	
	public Customer(String name, String ssn, String phone, String userId, String passwd) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.userId = userId;
		this.passwd = passwd;
	}
	
	public Customer() {//생성자 리턴값X, 클래스와 이름같음
		
	}

	public Customer(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	
}
