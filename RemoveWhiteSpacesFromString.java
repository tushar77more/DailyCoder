package com.dailycoder.journaldev;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		
		String input="Welcome to Java 		Tutorial";
		StringBuilder sb = new StringBuilder();
		char ch[]=input.toCharArray();
		for(char c : ch) {
			
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
			
		}
		
		System.out.println("final output "+sb.toString());
	}
}
