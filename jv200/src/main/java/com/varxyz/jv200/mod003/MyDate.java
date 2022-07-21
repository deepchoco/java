package com.varxyz.jv200.mod003;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		return "day=" + day + ", month="+month + ", year="+year;
	}
}
