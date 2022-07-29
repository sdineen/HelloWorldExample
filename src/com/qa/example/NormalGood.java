package com.qa.example;

public class NormalGood extends Product {

	public NormalGood(int id, String name, double costPrice) {
		super(id, name, costPrice, 0);
	}

	@Override
	public double getRetailPrice() {
		return getCostPrice() * 2;
	}
	

}
