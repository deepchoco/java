package com.varxyz.jv252.service;

import java.util.List;

import com.varxyz.jv252.dao.AccountDao;
import com.varxyz.jv252.domain.Account;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	// xxx-xx-xxxx 형식의 계좌번호 생성
	public String generateAccountNum() {
		String numStr = String.valueOf((int) (Math.random() * 100000000));//숫자를 스트링타입으로 받는것
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0, 3));//append 전달된 값을 마지막에 이어붙이는것
		sb.append("-");
		sb.append(numStr.substring(3, 5));
		sb.append("-");
		sb.append(numStr.substring(5));
		return sb.toString();
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		return accountDao.findAccountBySsn(ssn);
	}
}
