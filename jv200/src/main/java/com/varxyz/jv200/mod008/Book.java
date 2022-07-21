package com.varxyz.jv200.mod008;

public class Book {
	private int serial;
	private String bookName;
	
	public Book(String bookName, int serial) {
		this.bookName = bookName;
		this.serial = serial;
		//객체 자신을 메소드에 전달하거나 리턴하기 위해 사용된다.
		//매개 변수와 객체 자신이 가지고 있는 변수의 이름이 같은 경우 이를 구분하기 위해 자신의 변수에 this를 사용한다.
	}
	
	public String getSerial() {
		return Integer.toString(serial);
		//Library에서 시리얼번호을 사용하기위함
	}
	
	public String getBookName() {
		return bookName;
		//Library에서 책이름을 사용하기위함
	}
	
	
	
	
}
