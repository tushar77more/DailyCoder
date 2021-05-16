package com.dailycoder.examples;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateNumberInArray {

	public static void main(String[] args) {

		Integer arr[]= {1,2,3,4,2,1,5,6,7};
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				System.out.println("First repeated element is "+arr[i]);
				break;
			}
		}
	}

}
