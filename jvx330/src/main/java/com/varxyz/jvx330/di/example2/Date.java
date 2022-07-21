package com.varxyz.jvx330.di.example2;

import lombok.AllArgsConstructor;

//필드에 쓴 값을 파라미터로 받는 생성자를 만들어줌
@AllArgsConstructor
public class Date {
	private int year;
	private int month;
	private int day;
	
//	public Date(int year, int month, int day) {
//		super();
//		this.year = year;
//		this.month = month;
//		this.day = day;
//	}
	
	public String toString() {
		return year + "-" + month + "-" + day;
	}
	
	public int hashCode() {
		return (day ^ month ^ year);
	}


}
