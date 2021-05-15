package com.dailycoder.examples;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageOfArrayElement {

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5,3,2,3,4};
		int length= num.length;
		int total =0;
		
		for(int i=0;i<length;i++) {
			total = total+num[i];
		}
		
		System.out.println("Total "+total);
		System.out.println("Avrage "+total/num.length);

		double average = Arrays.stream(num).average().getAsDouble();
		System.out.println("Stream Average "+average);
		
	}

}
