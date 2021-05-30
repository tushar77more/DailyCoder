package com.dailycoder.may_30_2021;

public class RemoveAllOccurrencesOfGivenCharacter {

	public static void main(String[] args) {
		
		String str1 = "abcd";
		
		//str1 = str1.replaceAll("a", "");
		
		//str1 = str1.replace("a", "");
		
		System.out.println(""+str1);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<=str1.length()-1;i++) {
			
			char ch = str1.charAt(i);
			if(ch!='a') {
				sb.append(ch);
			}
		}
		
		System.out.println(""+sb.toString());
		
	}
}
