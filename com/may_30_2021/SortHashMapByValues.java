package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValues {

	public static void main(String[] args) {
		
		Map<String,Integer> score = new HashMap<>();
		
		score.put("David", 95);
		score.put("Jane", 80);
		score.put("Mary", 97);
		score.put("Lisa", 78);
		score.put("Dina", 65);
		
		System.out.println("Input map is "+score);
		
		score = sortByValue(score);
		
		System.out.println("sorted map by value is "+score);
		
		
		score = sortByValue1(score);
		
		System.out.println("sorted map by value is "+score);
	}

	private static Map<String, Integer> sortByValue1(Map<String, Integer> score) {
		Map<String, Integer> sortedByValue = new LinkedHashMap<>();
		
		 Set <Map.Entry<String, Integer>> entrySet  = score.entrySet();
		 
		 List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		 
		 /*entryList.sort(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});*/
		 entryList.sort((a,b) -> a.getKey().compareTo(b.getKey()));
		 
		 for(Entry<String ,Integer> entry : entryList) {
			 sortedByValue.put(entry.getKey(),entry.getValue());
		 }
		 
		return sortedByValue;
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> score) {
			Map<String, Integer> sortedByValue = new LinkedHashMap<>();
			 Set <Map.Entry<String,Integer>>  set = score.entrySet();
			 
			 List<Map.Entry<String,Integer>> l1 = new ArrayList<>(set);
			 Collections.sort(l1,new Comparator<Map.Entry<String,Integer>>() {

				@Override
				public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
					
					if(o1.getValue()>o2.getValue()) {
						return 1;
					} else if(o1.getValue()<o2.getValue()) {
						return -1;
					}else {
						return 0;
					}
					
				}
			});
			 for (Entry<String, Integer> e : l1)
					sortedByValue.put(e.getKey(), e.getValue());
		return sortedByValue;
	}
}
