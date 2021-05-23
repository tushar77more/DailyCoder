package com.dailycoder.journaldev;

public class PrintFibonacciSeries {

	public static void main(String[] args) {

		int n = 10;
		fibonacci(n);
	}

	private static void fibonacci(int n) {
	int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
		
	}

}
