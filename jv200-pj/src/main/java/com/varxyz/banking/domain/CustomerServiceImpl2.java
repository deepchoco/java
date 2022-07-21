package com.varxyz.banking.domain;

import java.util.*;// list로 구현

public class CustomerServiceImpl2 implements CustomerService{
	private List<Customer> customerList = new ArrayList<Customer>();

	public void addCustomer(Customer customer) {
		if(getCustomerBySsn(customer.getSsn()) == null) {
			customerList.add(customer);
		}
	}
		
	public Customer getCustomerBySsn(String ssn) {
		for(Customer c : customerList) {
			if(ssn.equals(c.getSsn())) {
				return c;
			}
		}
		return null;
	}

	public Collection<Customer> getAllCustomers() {
		return null;
	}

	public int getNumOfCustomers() {
		return customerList.size();
	}
}
