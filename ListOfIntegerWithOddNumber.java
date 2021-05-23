package com.dailycoder.journaldev;

import java.util.ArrayList;
import java.util.List;

//We can use for loop and check each element one by one if they are odd or not.
public class ListOfIntegerWithOddNumber {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(30);
		list.add(22);
		list.add(2);
		
		System.out.println(""+list.parallelStream().anyMatch(ele -> ele % 2!=0));
		
		System.out.println(""+list.parallelStream().allMatch(ele -> ele % 2==0));
		
		
	}
}
