package com.dailycoder.examples;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str ="aaabbccdddffrrdtsssageef";
		
		char c= usingloop(str);
		System.out.println("First Non repeating character from string using loop : "+c);
		
		char c1 =usingHashMap(str);
		
		System.out.println("First Non repeating character from string using HashMap : "+c1);
		
		char c2 =usingArray(str);
		System.out.println("First Non repeating character from string using Array : "+c2);
	}

	private static char usingArray(String str) {

		int arr[]=new int[26];
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			arr[c-'a']=arr[c-'a']+1;
			
		}
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(arr[c-'a']==1) {
				return c;
			}
		}
		return '_';
	}

	private static Character usingHashMap(String str) {
		
		HashMap<Character,Integer> charCount = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}else {
				charCount.put(c, 1);
			}
		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if (charCount.get(c)==1)  return c;
		}
		
		return '_';
		
	}

	private static Character usingloop(String str) {
		
		for(int i=0;i<str.length();i++) {
			boolean seenDuplicate = false;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && (i!=j)) {
					seenDuplicate = true;
					break;
				}
			}
			if(!seenDuplicate) {
				
				return str.charAt(i);
				
			}
			
		}
		return '_';
		
	}
	
	
	

}
