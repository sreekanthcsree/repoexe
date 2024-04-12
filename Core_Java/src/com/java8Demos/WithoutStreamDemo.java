package com.java8Demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class WithoutStreamDemo {
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1,"HP Laptop",25000f));  
		products.add(new Product(2,"Dell Laptop",30000f));  
		products.add(new Product(3,"Lenevo Laptop",28000f));  
		products.add(new Product(4,"Sony Laptop",28000f));  
		products.add(new Product(5,"Apple Laptop",90000f));
		
		List<Float> priceList = products.stream()
				                 .filter(p->p.price>30000)//filter data
				                 .map(p->p.price)//fetching price
				                 .collect(Collectors.toList());
		System.out.println(priceList);
		
		/*
		 * for(Product p : products) { if(p.price<=30000) { //filtering data of list
		 * System.out.println(priceList.add(p.price)); //adding price to a
		 * productPriceList } } System.out.println(priceList);//print the data
		 */	}

}
