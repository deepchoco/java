package com.varxyz.jv252.service;

import java.util.List;

import com.varxyz.jv252.domain.Account;
import com.varxyz.jv252.domain.Customer;
import com.varxyz.jv252.exception.CustomerNotFoundException;
import com.varxyz.jv252.exception.EntityNotFoundException;

public class BankServiceTest {
	public static void main(String[] args) throws EntityNotFoundException {
		BankService service = BankService.getInstance();
		String name = "동탁";
		String ssn = "880123-1234567";
		String phone = "010-4434-3232";
		String userId = "framework";
		String passwd = "1111";
		
		Customer customer = service.getCustomerBySsn(ssn);
		
		List<Account> myList = service.getAccountBySsn(ssn);
		for (Account account : myList) {
			System.out.println(account.getBalance());
		}
	}
}
