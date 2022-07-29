package com.qa.example;

public class VeblenGood extends Product {

	public VeblenGood(int id, String name, double costPrice) {
		super(id, name, costPrice, 0);
	}

	@Override
	public double getRetailPrice() {
		return 4 * getCostPrice();
	}
	
	


}
