package com.dailycoder.examples;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		//1 .Using built method
		
		String str="Java tutorial     		   point";
		
		String noSpace=str.replaceAll("\\s", "");
		
		System.out.println("String without white space -->");
		System.out.println(noSpace);
		
		
		//2. without using built in methods
		
		char[] strArray= str.toCharArray();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<strArray.length;i++) {
			if((strArray[i]!=' ') && (strArray[i]!='\t')) {
				sb.append(strArray[i]);
			}
		}
		
		System.out.println("String without white space without built in function -->");
		System.out.println(sb.toString());
		
		
		
	}

}
