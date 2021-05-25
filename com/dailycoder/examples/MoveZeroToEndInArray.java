package com.dailycoder.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class MoveZeroToEndInArray {

	public static void main(String[] args) {

		int arr[]= {10,0,0,3,0,65,14,0,89,0};

		int newArr[]=new int[arr.length];
		System.out.println("---->");
		print(arr);
		reArrange(arr,newArr);
		System.out.println("---->");
		print(newArr);
	}

	private static void print(int[] newArr) {
		/*System.out.println("---->");
		for(int i=0;i<newArr.length;i++) {
			System.out.print(" "+newArr[i]);
		}*/
		
		//Stream.of(newArr).forEach(a->System.out.println(a));
		Arrays.stream(newArr)
        .forEach(e->System.out.print(e + " "));
		
	}

	private static void reArrange(int[] arr, int[] newArr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newArr[j]=arr[i];
				j++;
			}
		}
		
	}

}
