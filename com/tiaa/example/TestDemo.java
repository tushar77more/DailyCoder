package com.tiaa.example;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {

		int a[]= {1,2,3,8,2,4,5,8,9,7,6,3};
		
		int currEle=a[0];
		int prevEle=0;
		int curLen=1;
		int maxLen=0;
		Object[] arr;
		ArrayList<Integer> number=new ArrayList<>();
		for(int i=0;i<a.length-1;i++) {

				if(a[i]>currEle) {
					
					curLen++;
					number.add(a[i]);
					currEle=a[i];
					
				}else {
					if(maxLen<curLen) {
						maxLen=curLen;
						curLen=0;
						arr=number.stream().toArray();
						number.clear();
					}
					
					currEle=a[i];
				}
				
		}
		
		
		System.out.println("");
	}

}
