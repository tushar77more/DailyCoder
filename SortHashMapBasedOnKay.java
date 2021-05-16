package com.dailycoder.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMapBasedOnKay {

	public static void main(String[] args) {

		HashMap<String,String> unsortedMap= new HashMap<String,String>();

		unsortedMap.put("apple","apple1");
		unsortedMap.put("pineapple","pineapple1");
		unsortedMap.put("banana","banana1");
		unsortedMap.put("guava","guava1");
		
		unsortedMap.entrySet().stream().forEach(ele -> System.out.println("Key --> "+ele.getKey()));
		
		System.out.println("After sort ---using TreeMap--> ");

		Map<String,String> treeMap =  new TreeMap<String,String>(unsortedMap);
		
		
		treeMap.entrySet().stream().forEach(ele -> System.out.println("Key --> "+ele.getKey()));
		
		
		//custom order using comparator
		System.out.println("After sort ---using Comparator--> ");
		Set<Map.Entry<String,String>> keySet=	unsortedMap.entrySet();
		
		List<Map.Entry<String,String>> list=new ArrayList<Map.Entry<String,String>>(keySet);
		Collections.sort(list, new Comparator<Map.Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return - o1.getKey().compareTo(o2.getKey());
			}
		});
		
		System.out.println("sorted map-- "+list);
	}

}
