package com.dailycoder.examples;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {

		String str="Welcome to the Java World";
		
		String strArr[]= str.split(" ");
		
		System.out.print("Input String--> "+str);
		System.out.print("\nOutput String-->");
		for(int i=strArr.length-1;i>=0;i--) {
			
			System.out.print(" "+strArr[i]);
		}
	}

}
