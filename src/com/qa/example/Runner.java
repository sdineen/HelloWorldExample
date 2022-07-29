package com.qa.example;

public class Runner {

	public static void main(String[] args) {
		Product product1 = new NormalGood(1, "Tea", 2.21);
		System.out.println(product1.getRetailPrice());
		
		Product product2 = new VeblenGood(2, "Rolex watch", 900);
		System.out.println(product2.getRetailPrice());

	}

}
