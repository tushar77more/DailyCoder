package com.dailycoder.examples;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxMinElementInArray {

	public static void main(String[] args) {
		
		int n,max,min;
		System.out.println("Please enter number of element in array ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array element ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		max=arr[0];
		min=arr[0];

		for(int i=1;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Minimum Element = "+min);
		System.out.println("Maximum Element = "+max);
		
		int max1=Arrays.stream(arr).max().getAsInt();
		int min1=Arrays.stream(arr).min().getAsInt();
		
		System.out.println("Minimum Element = "+min1);
		System.out.println("Maximum Element = "+max1);
	}

}
