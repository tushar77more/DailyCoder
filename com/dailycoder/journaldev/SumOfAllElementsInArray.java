package com.dailycoder.journaldev;

import java.util.Arrays;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		int sum = Arrays.stream(array).sum();
		
		System.out.println("Sum : "+sum);
	}
}
