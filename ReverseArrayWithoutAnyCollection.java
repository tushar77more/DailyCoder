package com.dailycoder.examples;

import java.util.Arrays;

public class ReverseArrayWithoutAnyCollection {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int low=0;
		int high=arr.length-1;
		System.out.println("Before reverse Array element "+Arrays.toString(arr));
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
		System.out.println("After reverse Array element "+Arrays.toString(arr));
	}

}
