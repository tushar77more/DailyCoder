package com.dailycoder.may_30_2021;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner joinName = new StringJoiner(",");
		joinName.add("Rahul");  
		joinName.add("Raju");  
		joinName.add("Peter");  
		joinName.add("Raheem");  
                  
        System.out.println(joinName);  
        
        StringJoiner joinNames = new StringJoiner(",", "[", "]");
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);
        
        
        StringJoiner merge = joinNames.merge(joinName);   
        System.out.println(merge);  
        
	}
}
