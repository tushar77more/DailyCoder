package com.dailycoder.examples;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {

		String str="aaaaaaaaaaaaabbcdab";
		getLongest(str);
	}
	
	
	public static void getLongest(String str){
		
		HashSet<Character> set = new HashSet<>();
		
		String longestOverall="";
		String longestTillNow="";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			if(set.contains(c)) {
				longestTillNow="";
				set.clear();
			}
			longestTillNow+=c;
			set.add(c);
			
			if(longestTillNow.length()>longestOverall.length()) {
				longestOverall=longestTillNow;
			}
			
		}
		
		System.out.println("Longest Sub-String is "+longestOverall);
		System.out.println("Longest Sub-String length is "+longestOverall.length());
	}

}
