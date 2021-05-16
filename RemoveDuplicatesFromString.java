package com.dailycoder.examples;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String str="aaabbbbcccdddeeefffggghhhiijjkkllmmnoppppqqqrrrsstuvvvwwwxyzzzzzz";
		StringBuffer outputStr= new StringBuffer();
		Set<Character> charSet=new HashSet<>();
		for(int i=0;i<str.length();i++) {
		
			Character c = str.charAt(i);
			if(!charSet.contains(c)) {
				charSet.add(c);
				outputStr.append(c);
			}
		}
		
		System.out.println("-----output string -----> "+outputStr.toString());
	}

}


