package com.varxyz.jv200.mod008;

public class Test {

	public static void main(String[] args) {
		Library lib = Library.getLibrary();
		Library lib2 = Library.getLibrary();
		
		for(int i =0; i < 200; i++) {
			lib.addBook(new Book("어린왕자", i));
		}
		
		lib2.addBook(new Book("hello", 1234));
		System.out.println(lib2.toString());
		System.out.println(lib.toString()); //lib, lib2는 같은 주소값을 반환 -> 하나의 도서관만 생성
		System.out.println(lib2.getBook(199));
		
		
	}

}

