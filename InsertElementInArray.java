package com.dailycoder.examples;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {

		int arr[]=new int[5];
		
		System.out.println("Enter the elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Print the elemets before insert");
		Arrays.stream(arr).forEach(ele -> System.out.println(ele));
		
		System.out.println("Enter the location at which we want to insert");
		int location = sc.nextInt();
		
		System.out.println("Enter the vaule to insert");
		int value = sc.nextInt();
		
		for(int i=arr.length-1;i>location;i--) {
			arr[i]= arr[i-1];
		}
		arr[location]=value;
		
		System.out.println("Print the elemets after insert");
		Arrays.stream(arr).forEach(ele -> System.out.println(ele));
	}

}
