package com.dailycoder.examples;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="avaJ lairotuT avaJ";
		
		char[] chArray=str.toCharArray();
		reverse(chArray,chArray.length);
	}
	
	public static void reverse(char[] ch, int length) {
		
		if(length>0) {
			
			System.out.print(""+ch[length-1]);
			length--;
			
			reverse(ch,length);
		}
		
	}
}
