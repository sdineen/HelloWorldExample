package com.qa.ecommerce;

public class Product {
 	private String name;
	private double price;
	
	private static int productCount = 0;
	
	public static int getProductCount() {
		return productCount;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		productCount++;
	}

	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
