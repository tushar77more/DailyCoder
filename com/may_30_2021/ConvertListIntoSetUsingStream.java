package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListIntoSetUsingStream {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<Product>();  
		  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        Set<Product> productSet = productsList.parallelStream().collect(Collectors.toSet());
        
        System.out.println("productSet "+productSet);
        
        //Convert List into Map
        
        Map<Object,Object> productMap = productsList.parallelStream().collect(Collectors.toMap(ele -> ele.getName(), ele -> ele.getPrice()));
        
        System.out.println("Converting list to Map using stream "+productMap);
        
	}
}
