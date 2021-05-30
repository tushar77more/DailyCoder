package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("A1");
		l1.add("A2");
		l1.add("A3");
		
		
		List<String> l2 = new ArrayList<>();
		l2.add("B1");
		l2.add("B2");
		l2.add("B3");
		
		List<String> result = new ArrayList<>();
		
		result.addAll(l1);
		result.addAll(l2);
		
		System.out.println("Final list "+ result);
		
		l1.addAll(l2);
		System.out.println("Final list "+ l1);
		
		l2.addAll(l1);
		System.out.println("Final list "+ l2);
	}
}
