package com.dailycoder.examples;

public class CountNoOfVowels {

	public static void main(String[] args) {

		int count=0;
		
		String str="learnprogrammingbyluckysir";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
				
			}
			
		}
		
		System.out.println("Number of Vowels : "+count);
	}

}
