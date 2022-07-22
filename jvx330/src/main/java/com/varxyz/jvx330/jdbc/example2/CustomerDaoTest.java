package com.varxyz.jvx330.jdbc.example2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.example1.DataSourceConfig;

public class CustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		findAllCustomers(dao);//모든고객정보
		countCustomers(dao);//count
		findCustomerByEmail(dao);//이메일로찾기
		findCustomerByRegDate(dao);//날짜로찾기
		findCustomerBySsn(dao);//주민번호로찾기
		
		
		context.close();
	}
	
	//모든고객정보찾기
	public static void findAllCustomers(CustomerDao dao) {
		System.out.println("[findAllCustomers()]");
		dao.findAllCustomers().forEach(c -> System.out.println(c));
		System.out.println("");
	}
	
	//count
	public static void countCustomers(CustomerDao dao) {
		System.out.println("[countAllCustomers()]");
		System.out.println(dao.countCustomers());
		System.out.println("");
	}
	
	//이메일로찾기
	public static void findCustomerByEmail(CustomerDao dao) {
		System.out.println("[findCustomerByEmail(String email)]");
		System.out.println(dao.findCustomerByEmail("yubi@naver.com"));
		System.out.println("");
	}
	
	//날짜로찾기
	public static void findCustomerByRegDate(CustomerDao dao) {
		
		System.out.println("[findCustomerByRegDate()]");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = null;
		try {
			currentDate = format.parse(format.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<Customer> list = dao.findCustomerByRegDate(currentDate);
		for(Customer customer : list) {
			System.out.println(customer);
		}
		System.out.println("");
	}
	
	//주민번호로찾기
	public static void findCustomerBySsn(CustomerDao dao) {
		System.out.println("[findCustomerBySsn(String ssn)]");
		System.out.println(dao.findCustomerBySsn("800112-1234567"));
		System.out.println("");
	}
}
