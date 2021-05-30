package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethodDemo {

	public static void main(String[] args) {
		
		List<Products> productsList = new ArrayList<Products>();  
        //Adding Products  
        productsList.add(new Products(1,"HP Laptop",25000f));  
        productsList.add(new Products(2,"Dell Laptop",30000f));  
        productsList.add(new Products(3,"Lenevo Laptop",28000f));  
        productsList.add(new Products(4,"Sony Laptop",28000f));  
        productsList.add(new Products(5,"Apple Laptop",90000f));  
        
        Float totalPrice = productsList.stream().map(ele -> ele.getPrice()).reduce(0.0f, (sum,price) -> sum+price);
        
        System.out.println("Total products price is "+totalPrice);
        
        Float totalPrice1 =productsList.stream().map(ele -> ele.getPrice()).reduce(0.0f, Float::sum);
        
        System.out.println("Total products price is "+totalPrice1);
        
        Float maxPrice = productsList.stream().map(ele -> ele.getPrice()).reduce(0.0f, Float::max);
        
        System.out.println("maximum price is "+maxPrice);
        
        Float minPrice =productsList.stream().map(ele -> ele.getPrice()).reduce(maxPrice,Float::min);
        
        System.out.println("minimum price is "+minPrice);
        
      
	}
}


class Products{
	
	int id;  
    String name;  
    float price;
    
    
	public Products(int id, String name, float price) {
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
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
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
		Products other = (Products) obj;
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
