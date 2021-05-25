package com.dailycoder.journaldev;

public class FindFactorial {

	public static void main(String[] args) {

		long fact=factorial(6);
		System.out.println("\n Factorial is "+fact);
	}
	
	
	public static long factorial(long n) {
		System.out.print(""+n+"*");
		if (n == 1) {
			return 1;
		}else {
			return (n * factorial(n - 1));
		}
	}
}
//1*2*3*4*5
