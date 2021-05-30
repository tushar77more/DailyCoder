package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;

public class CountMethodInStreamDemo {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28500f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        long count = productsList.stream().filter(ele -> ele.getPrice()>28000).count();
        
        System.out.println("Products count greater than 28000 is "+count);
	}
}
