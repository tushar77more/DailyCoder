package com.dailycoder.journaldev;

public class PrimeNumberCheck {
	
	public static void main(String[] args) {
		
		int a = 19;
		int b = 49;
		
		System.out.println("Number "+a+" is prime "+isPrime(a));
		System.out.println("Number "+b+" is prime "+isPrime(b));
	}

	private static boolean isPrime(int a) {
		
		if(a==0 || a==1)
			return false;
		
		if(a==2) 
			return true;

		for(int i=2;i<a/2;i++) {
			
			if(a % i==0) 
				return false;
		}
		
		return true;
	}

}

