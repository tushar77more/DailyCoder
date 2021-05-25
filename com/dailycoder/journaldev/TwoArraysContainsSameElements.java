package com.dailycoder.journaldev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoArraysContainsSameElements {

	public static void main(String[] args) {
		
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElements(a1, a2));
		System.out.println(sameElements(a1, a3));
		System.out.println(sameElements(a2, a3));
	}

	private static boolean sameElements(Object[] a1, Object[] a2) {

		Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(a1));
		Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(a2));
		
		// if size is different, means there will be a mismatch
		if(uniqueElements1.size() != uniqueElements2.size()) return false;
		
		for(Object obj : uniqueElements1) {
			// element not present in both?
			if (!uniqueElements2.contains(obj)) return false;
		}
		
		return true;
	}
}
