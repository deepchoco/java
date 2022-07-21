package com.varxyz.jv200.mod003;

public class Multiplication {
	public static void main(String[] args) {
//		int dan=2;
//		int i=1;
//		
//		while(i<=9)
//		{
//			dan=2;
//			while(dan<=9)
//			{
//				System.out.print(dan+" x "+i+" = "+(dan*i)+"\t");
//				dan++;
//			}
//			System.out.println();
//			i++;
//		}
		
		int dan=0;
		int i=0;
		
		for(i=1; i<10; i++) {
			for(dan=2; dan<10; dan++) {
				System.out.print(dan+" x "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
	}
}
