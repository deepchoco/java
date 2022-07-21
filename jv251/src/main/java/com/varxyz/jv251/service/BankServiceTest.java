package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.exception.CustomerNotFoundException;
import com.varxyz.jv251.exception.EntityNotFoundException;

public class BankServiceTest {
	public static void main(String[] args) throws EntityNotFoundException {
		BankService service = BankService.getInstance();
		String name = "동탁";
		String ssn = "880123-1234567";
		String phone = "010-4434-3232";
		String userId = "framework";
		String passwd = "1111";
		
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
		List<Account> myList = service.getAccountBySsn(ssn);
		for (Account account : myList) {
			System.out.println(account);
		}
	}
}
