package com.varxyz.jvx330.di.example1;

public class Foo {
	private Bar bar;
	
	//setter를 사용하기위해서 필요함 생성자를 통해 정의하지않으면 default생성자를 쓰게됨
	public Foo() {
		System.out.println("Foo() constructor is called");
	}
	
	public Foo(Bar bar) {
		this.bar = bar;
		System.out.println("Foo(bar) constructor is called");//foo(bar)라는 식별자를 가지고 빈에서 검색
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar() is called");
	}
	
	public String toString() {
		return "[Foo : " + hashCode() + "]";
	}
}
