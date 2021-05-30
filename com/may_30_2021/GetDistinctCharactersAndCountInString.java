package com.dailycoder.may_30_2021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GetDistinctCharactersAndCountInString {

	public static void main(String[] args) {
		
		String str1 = "abcdABCDabcd";
		
		char[] ch = str1.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println("Priniting all character with there count : ");
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ ": "+entry.getValue());
		}
		
		System.out.println("Printing all distinct characters from string : ");
		
		Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			
			Entry<Character,Integer> entry =it.next();
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}
}
