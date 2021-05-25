package com.dailycoder.examples;

import java.util.Arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,7,8,9};
		int outputArr[]=new int[arr.length-1];
		int deleteIndex=5;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			if(i==deleteIndex) {
				continue;
			}
			outputArr[j]=arr[i];
			j++;
		}
		
		System.out.println("original array  is "+Arrays.toString(arr));
		System.out.println("output   array is "+Arrays.toString(outputArr));
		
		Arrays.stream(outputArr).forEach(e->System.out.print(" "+e));
	}
}
