package com.varxyz.jv200.practice;
/*
 * 프라임넘버인지 체크하는 예제
 * 6은 프라임 넘버가 아닙니다. 2*3=6
 */

import java.util.Scanner;

public class Prac1 {
	// 메인
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		try {
			prime(in.nextInt());
		} catch(Exception e) {
			System.out.print("오류가남");
		}
	}
	// 소수판별
	public static void prime(int number) throws Exception {
		if(number < 2) {
			System.out.print("1이상의 숫자를 입력하세요");
			return;
		}
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				System.out.print("소수가 아닙니다");
				return;
			}
		}
		System.out.print("소수입니다");
			return;
	}
}




//import java.util.Scanner;
//
//public class Prac1 {
//	public static void throwException() throws Exception {
//		System.out.println("딱히 에러는 없는듯함");
//	}
//	
//	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		System.out.print("숫자를 입력하세요 : ");
// 		try {
// 			prime(in.nextInt());
// 			throwException();
// 		} catch(Exception e) {
// 			System.out.println("정수나 숫자가 아닌것같은데?");
// 			System.out.println(e);
// 		}
// 		System.out.println("종료");
//	}
//	// 소수 판별 메소드 
//	public static void prime(int number) {
//		int sum = number / 2;
//		if(number < 2) {
//			System.out.println("1미만의 수는 소수가 아닙니다");
//			return;
//		}
//		if(number == 2) {
//			System.out.println("소수입니다");
//			return;
//		}
//		for(int i = 2; i < number; i++) {
//			if(number % i == 0) {
//				System.out.print("소수가 아닙니다, ");
//				System.out.printf("2 * %d = %d\n",sum, number);
//				return;
//			}
//		}
//		System.out.println("소수입니다");
//		return;
//	}
//}