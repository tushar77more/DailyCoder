package com.dailycoder.examples;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class IterateHashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> fruitMap=new HashMap<Integer,String>();
		fruitMap.put(1, "Mango");
		fruitMap.put(2, "Apple");
		fruitMap.put(3, "Banana");
		fruitMap.put(4, "Orange");
		fruitMap.put(5, "Kiwi");
		
		//1. using key set
		System.out.println("keySetIteration---------------->");
		keySetIteration(fruitMap);
		
		//2. Using Iterator
		System.out.println("Using Iterator---------------->");
		usingIterator(fruitMap);
		
		//3. Using streams java 8
		System.out.println("usingStreamAPI---------------->");
		usingStreamAPI(fruitMap);
		
		//4. using foreach method
		System.out.println("usingForEach---------------->");
		usingForEach(fruitMap);
	}

	private static void usingForEach(HashMap<Integer, String> fruitMap) {
		fruitMap.forEach((key,value)->{System.out.print("Key : "+key); System.out.println(" Value : "+value);});
		
	}

	private static void usingStreamAPI(HashMap<Integer, String> fruitMap) {
		
		fruitMap.entrySet().stream().forEach(ele -> {System.out.print("Key : "+ele.getKey());
		System.out.println(" Value : "+ele.getValue());});
	}

	private static void usingIterator(HashMap<Integer, String> fruitMap) {
		Set<Entry<Integer, String>> iterator=fruitMap.entrySet();
		for(Entry<Integer, String> entry:iterator) {
			System.out.print("Key : "+entry.getKey());
			System.out.println(" Value : "+entry.getValue());
		}
		
	}

	private static void keySetIteration(HashMap<Integer, String> fruitMap) {
		
		Set<Integer> set=fruitMap.keySet();
		for(Integer e:set){
			System.out.print("Key :"+e);
			System.out.println(" Value :"+fruitMap.get(e));
		}
		
	}
}
