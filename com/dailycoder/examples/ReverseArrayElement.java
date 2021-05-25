package com.dailycoder.examples;

import java.util.Stack;

public class ReverseArrayElement {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		Stack<Integer> stack= new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}

		System.out.println("stack--> "+stack);
		
		System.out.println("reverse elements ");
		for(int j=0;j<arr.length;j++) {
			arr[j]=stack.pop();
			System.out.println(arr[j]);
		}
	}

}
