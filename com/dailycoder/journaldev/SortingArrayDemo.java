package com.dailycoder.journaldev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingArrayDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(-1);
		list.add(-2);
		list.add(4);
		int[] array = {1, 2, 3, -1, -2, 4};
		
		//Using built in function
		System.out.println("Input Array : "+Arrays.toString(array));
		Arrays.sort(array);
		
		System.out.println("Sorted Array : "+Arrays.toString(array));
		
		//using comparator using built in function
		
		int[] resultArr = Arrays.stream(array).sorted().toArray();
		
		System.out.println("Sorted Array : "+Arrays.toString(resultArr));
		
		List<Integer> lt = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List : "+lt);
		
		
	}
}
