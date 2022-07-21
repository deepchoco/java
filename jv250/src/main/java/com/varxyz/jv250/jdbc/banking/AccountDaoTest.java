package com.varxyz.jv250.jdbc.banking;

import java.util.Date;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingAccount sa = new SavingAccount();
		sa.setAccountNum("111-12-5678");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1002));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');
		dao.addAccount(sa);
		
		for(Account account : dao.findAccountsBySsn("961025-1234567")) {
			System.out.println(account.getCustomer());
		}
	}
}
