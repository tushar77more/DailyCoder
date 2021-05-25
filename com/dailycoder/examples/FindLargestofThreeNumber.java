package com.dailycoder.examples;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestofThreeNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter three numbers ...");
		
		Scanner sc = new Scanner(System.in);
		
		int firstNum=sc.nextInt();
		int SecondNum=sc.nextInt();
		int ThirdNum=sc.nextInt();
		
		int maxNum=Math.max(ThirdNum, Math.max(firstNum, SecondNum));
		System.out.println("Max number in provided number is --> "+maxNum);
		
		
		int arr[]= {3423,546456,76867,2313,1067657};
		
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("Max number in provided number is --> "+max);

	}

}
