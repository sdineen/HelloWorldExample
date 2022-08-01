package com.qa.example;


//read only class
public class Product {
	//instance variables
	private int id;
	private String name;
	private double costPrice;
	private double retailPrice;
	
	//overloaded constructors
	public Product(String name, float costPrice, float retailPrice) {
		this(0,name, costPrice, retailPrice);
	}
	
	public Product(int id, String name, double costPrice, double retailPrice) {
		this.setId(id);
		this.setName(name);
		this.setCostPrice(costPrice);
		this.setRetailPrice(retailPrice);
	}
		
	public Product() {
		
	}
	
	public static Product createProduct() {
		return new Product(1,"Tea", 2, 3);
	}
	
	//getter and setter methods
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public double getRetailPrice() {
		return retailPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
