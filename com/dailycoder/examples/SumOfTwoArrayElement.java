package com.dailycoder.examples;

public class SumOfTwoArrayElement {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int expectedSum=50;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==expectedSum-arr[i]) {
					System.out.println("Array elements are "+arr[i] +" and "+arr[j]);
				}
			}
		}

	}

}
