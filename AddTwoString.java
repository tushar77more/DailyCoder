package com.dailycoder.examples;

public class AddTwoString {

	public static void main(String[] args) {
		
		try {
			String str1="456";
			String str2="232";
			int outputStr=addTwoStringMethod(str1,str2);
			System.out.println("output String is "+String.valueOf(outputStr));
		} catch (NumberFormatException e) {
			System.out.println("Please provide proper interger values for addition ");
		}
		
	}
	
	public static Integer addTwoStringMethod(String str1,String str2) throws NumberFormatException {
		
		int i = Integer.parseInt(str1);
		int j = Integer.parseInt(str2);
		
		return i+j;
	}
}
