package com.dailycoder.journaldev;

public class PalindromeStringDemo {

	public static void main(String[] args) {
		
		String input="madam1";
		boolean result=true;
		int length = input.length();
		
		for(int i=0; i<length/2;i++) {
			
			if(input.charAt(i)!=input.charAt(length-1-i)) {
				result= false;
				
				break;
			}
		}
		
		if(result)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
