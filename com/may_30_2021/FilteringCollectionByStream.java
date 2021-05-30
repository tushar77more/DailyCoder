package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringCollectionByStream {

	public static void main(String[] args) {
		
		 List<Product> productsList = new ArrayList<Product>();  
	     productsList.add(new Product(1,"HP Laptop",25000f));  
	     productsList.add(new Product(2,"Dell Laptop",30000f));  
	     productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	     productsList.add(new Product(4,"Sony Laptop",28000f));  
	     productsList.add(new Product(5,"Apple Laptop",90000f));  
	     
	     
	     List<Float> productPriceList2 = productsList.stream().filter(ele -> ele.getPrice()<30000).map(ele -> ele.getPrice()).collect(Collectors.toList());
	     
	     System.out.println(productPriceList2);  
	     
	     List<Product> productList2 =productsList.stream().filter(ele -> productPriceList2.contains(ele.getPrice())).collect(Collectors.toList());
	     
	     System.out.println(productList2);  
	}
}


class Product{
	
	 int id;  
	 String name;  
	 float price;
	 
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	} 
	 
	 
	
}