package com.varxyz.jvx330.jdbc.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;

public class AddCustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		AddCustomerDao dao = context.getBean("addCustomerDao", AddCustomerDao.class);
		addCustomer3(dao);
		context.close();
	}
	
	public static void addCustomer(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("yubi@naver.com");
		c.setPasswd("1111");
		c.setName("유비");
		c.setSsn("800111-1234567");
		c.setPhone("010-1234-5678");
		dao.addCustomer(c);
		System.out.println("inserted");
	}
	
	public static void addCustomer2(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("jangbi@naver.com");
		c.setPasswd("1111");
		c.setName("장비");
		c.setSsn("800111-1234567");
		c.setPhone("010-1234-5678");
		dao.addCustomer2(c);
		System.out.println("inserted");
	}
	
	public static void addCustomer3(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("chocho@naver.com");
		c.setPasswd("1111");
		c.setName("상검");
		c.setSsn("800112-1234567");
		c.setPhone("010-1234-5678");
		long key = dao.addCustomer3(c);
		System.out.println("key" + key);
	}
}
