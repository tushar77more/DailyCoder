package com.dailycoder.examples;

import java.util.Arrays;
import java.util.Scanner;

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
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Input Array : ");
		System.out.println(Arrays.toString(a));
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n Enter how many times you want to rotate array to left : ");
		int nos= sc.nextInt();
		
		for(int i=0;i<nos;i++) {
			
			int firstNo=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=firstNo;
			
		}
		System.out.println("Output Array : ");
		System.out.println(Arrays.toString(a));
	}

}
