package com.dailycoder.journaldev;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String str = "sdfasfasf";
		System.out.println(reverse(str));
		
		//System.out.println("Using build in function :"+str.);
	}

	private static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		if(str==null)
			throw new IllegalArgumentException("Null is not valid input");
		
		char[]  ch= str.toCharArray();
			
		for(int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
		
		return sb.toString();
	}
}
