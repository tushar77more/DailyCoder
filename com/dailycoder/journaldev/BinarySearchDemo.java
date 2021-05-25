package com.dailycoder.journaldev;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		int arr[]= {1,5,2,8,92,567,-1,3,0};
		
		int low = 0;
		int high = arr.length-1;
		int key = 0;
		Arrays.sort(arr);
		System.out.println("Sorted Array "+Arrays.toString(arr));
		int resultIdx = binarySearch(arr,low,high,key);
		System.out.println(key+ " found in array at index "+resultIdx);
		
		
	}

	private static int binarySearch(int[] arr, int low, int high,int key) {

		int mid= (low+high)/2;
		
		while(low<=high) {
			
			if(arr[mid]==key) {
				return mid;
			} else if(arr[mid]<key) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			mid = (low + high) / 2;
		}
		
		if(low>high) {
			return -1;
		}
			
		return -1;
	}
}
