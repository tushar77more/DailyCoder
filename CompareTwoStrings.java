package com.dailycoder.examples;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str1="Tushar";
		String str2="Tushar1";
		boolean stringEqual=true;
		if(str1.length()!=str2.length()) {
			stringEqual=false;
		}else {
		for(int i=0;i<str1.length();i++) {
			
			if(str1.charAt(i)!=str2.charAt(i)) {
				stringEqual=false;
				break;
			}
		}
		}
		System.out.println("Provided two strings are equal "+stringEqual);
	}

}
