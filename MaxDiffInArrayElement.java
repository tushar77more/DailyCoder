package com.dailycoder.examples;

public class MaxDiffInArrayElement {

	public static void main(String[] args) {
		
		int arr[]= {10,20,2,90,40};

		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);
		System.out.println("Maximum difference between two element is "+(max-min));
	}

}
