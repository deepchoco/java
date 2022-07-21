package com.varxyz.jv200.mod003;

import java.util.Scanner;

public class array01 {
	public static void main(String[] args) {
		//길이가 3인 int형 1차원 배열
		int [] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		System.out.printf("%d %d %d\n", arr1[0], arr1[1], arr1[2]);
		
		double arr2[];
		arr2 = new double[2];
		arr2[0] = 10.1;
		arr2[1] = 20.2;
		
		System.out.println("--------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("받을 정수 개수 선택 : " );
		int num = sc.nextInt();
		int [] arr3 = new int[num];
		System.out.println("배열길이 : " + arr3.length);
		//입력받기
		for(int i=0;i<arr3.length;i++) {
			System.out.printf("arr[%d] : ",i);
			arr3[i]=sc.nextInt();
		}
		//출력하기
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
