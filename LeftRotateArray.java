package com.dailycoder.examples;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int first=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=first;
		
		/*
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * System.out.println(""+arr[i]); }
		 */
		Arrays.stream(arr).forEach(e->System.out.println(e));
	}

}
