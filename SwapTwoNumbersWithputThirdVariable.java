package com.dailycoder.journaldev;

public class SwapTwoNumbersWithputThirdVariable {

	public static void main(String[] args) {

		int a= 10;
		int b = 20;

		swapTwoNumber(a,b);
		System.out.println("a = "+a+" b = "+b);
	}

	private static void swapTwoNumber(int a, int b) {

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a = "+a+" b = "+b);
	}

}
