package com.dailycoder.may_30_2021;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,0,2,0,3,0,0,0,0};
		
		int[] i = {0,0,2,10,3,0,50,0,0};
		
		int[] result1 =toShiftZeroToRight(i);
		System.out.println(Arrays.toString(result1));
		
		System.out.println("Shift all zero to first");
		
		System.out.println(Arrays.toString(toShiftZeroToFirst(result1)));
	}

	private static int[] toShiftZeroToFirst(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++;
			}
		}
		
		int[] temp = new int[a.length];
		int j=count;
		for(int i=0;i<a.length-count;i++) {
			temp[j]= a[i];
			j++;
		}
		
		
		
		return temp;
	}

	private static int[] toShiftZeroToRight(int[] a) {
		
		if(a.length==1) {
			return a;
		}
		
		int newArray[] = new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
				newArray[count]=a[i];
				count++;
			}
			
		}
		return newArray;
	}
}
