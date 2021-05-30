package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsExample {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	    productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        Double sumPrices = productsList.stream().collect(Collectors.summarizingDouble(ele -> ele.getPrice())).getSum();
        
        System.out.println("Sum of prices: "+sumPrices); 
        
        
        Double average  =productsList.stream().collect(Collectors.averagingDouble(ele -> ele.getPrice())).doubleValue();
        
        System.out.println("Average of prices: "+average); 
        
        int count = productsList.stream().collect(Collectors.counting()).intValue();
        
        System.out.println("Count of product: "+count); 
	}
}
