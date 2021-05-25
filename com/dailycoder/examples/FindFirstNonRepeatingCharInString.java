package com.dailycoder.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindFirstNonRepeatingCharInString {

	public static void main(String[] args) {
		
		System.out.println("Please enter string ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.next();
		
		//1. Using LinkedHashMap
		HashMap<Character,Integer> charMap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<inputString.length();i++) {
			
			if(charMap.containsKey(inputString.charAt(i))) {
				int count= charMap.get(inputString.charAt(i));
				charMap.put(inputString.charAt(i), count+1);
			}else {
				charMap.put(inputString.charAt(i), 1);
			}
			
		}
		
		charMap.entrySet().stream().forEach(ele -> {System.out.println("Key : "+ele.getKey() +" Value "+ele.getValue());});
		
		/*
		 * Iterator it = charMap.entrySet().iterator();
		 * 
		 * while(it.hasNext()) { Map.Entry<Character,Integer> entry= (Entry<Character,
		 * Integer>) it.next(); if(entry.getValue()==1) {
		 * System.out.println("First non repeating array Character is "+entry.getKey());
		 * break; } }
		 */
		
		Map.Entry<Character,Integer> entry=charMap.entrySet().stream().filter(ele -> ele.getValue()==1).findFirst().get(); 
		System.out.println("First non repeating array Character is "+entry.getKey());
		


	}

}
