package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxMinProductPrice {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28500f));  
        productsList.add(new Product(4,"Sony Laptop",28200f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        Optional<Product> p1= productsList.stream().max((a,b) -> a.getPrice()>b.getPrice()?1:-1);
        
        System.out.println("Product with higher price "+p1.get());
        
        
        Optional<Product> p2= productsList.stream().min((a,b) -> a.getPrice()<b.getPrice()?-1:1);
        
        System.out.println("Product with higher price "+p2.get());
        
        List<Product> p3= productsList.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        
        System.out.println("Product list in order "+p3);
	}
}
