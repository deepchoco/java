package com.varxyz.jv200.mod006;

import java.util.Date;

public class Employee {
	protected String name;
	protected double salary;
	public Date birthDate;
	
	public String getDetails() {
		return "Name: "+ name + "\nSalary: " + salary;
	}

	public String setName(String Name) {
		return Name;
	}

	public void getSalary() {
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
		
	}

	public void setBirthDate(MyDate birthDate) {
		// TODO Auto-generated method stub
		
	}
}
