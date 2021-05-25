package com.dailycoder.journaldev;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
		
		int secondLargestElement = findSecondHighest(arr);
		
		System.out.println("Second Largest no is : "+secondLargestElement);
	}

	private static int findSecondHighest(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(Integer i : arr) {
			if(i>highest) {
				secondHighest = highest;
				highest = i;
			}else if(i > secondHighest) {
				secondHighest = i;
			}
		}
		return secondHighest;
	}
}
