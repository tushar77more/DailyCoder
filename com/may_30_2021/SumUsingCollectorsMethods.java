package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumUsingCollectorsMethods {

	public static void main(String[] args) {
		
		 List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	     productsList.add(new Product(1,"HP Laptop",25000f));  
	     productsList.add(new Product(2,"Dell Laptop",30000f));  
	     productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	     productsList.add(new Product(4,"Sony Laptop",28000f));  
	     productsList.add(new Product(5,"Apple Laptop",90000f));
	     
	     double totalPrice3 =productsList.stream().collect(Collectors.summingDouble(ele -> ele.getPrice()));
	     
	     System.out.println(totalPrice3);  
	     
	     double priceAverage = productsList.stream().collect(Collectors.averagingDouble(ele -> ele.getPrice()));
	     
	     System.out.println(priceAverage);  
	     
	     Optional<Product> maxPrice = productsList.stream().collect(Collectors.maxBy((a,b) -> a.getPrice()>b.getPrice()? 1: -1));
	     
	     System.out.println("Product with maximum price "+maxPrice.get());  
	     
	     Optional<Product> minPrice =productsList.stream().collect(Collectors.minBy((a,b) -> a.getPrice()>b.getPrice()?1:-1));
	     
	     System.out.println("Product with minimum price "+minPrice.get());  
	}
}
