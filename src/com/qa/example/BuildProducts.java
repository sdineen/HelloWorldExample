package com.qa.example;

public class BuildProducts {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Tea", 1.13F, 2.45F);
		Product product2 = new Product("Coffee", 0.87F, 3.45F);
		
		Product product3 = new Product();	
		product3.setId(1);
		product3.setName("Tea");
		product3.setCostPrice(1.13);
		product3.setRetailPrice(2.45);
//		
//		product2.setId(2);
//		product2.setName("Coffee");
//		product2.setCostPrice(0.87);
//		product2.setRetailPrice(3.45);
		
		System.out.println(product1.getId());
		System.out.println(product1.getName());
		System.out.println(product1.getCostPrice());
		System.out.println(product1.getRetailPrice());
		
		System.out.println(product2.getId());
		System.out.println(product2.getName());
		System.out.println(product2.getCostPrice());
		System.out.println(product2.getRetailPrice());
	}

}
