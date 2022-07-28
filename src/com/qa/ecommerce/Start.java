package com.qa.ecommerce;

import java.text.NumberFormat;
import java.util.Locale;

public class Start {
	public static void main(String[] args) {
		
//		Locale gb = new Locale("en", "gb");
//		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(gb);
//		System.out.println(numberFormat.format(12.43));
		
		//customer1 is an object reference variable
		Customer customer1 = new Customer("Simon", "Dineen");
		customer1.setFirstName("John");
		customer1.setSurname("Jones");
		
		Customer customer2 = new Customer("Sue", "Smedley");
//		customer2.setFirstName("joe");
//		customer2.setSurname("jones");
		
		System.out.println(customer1.getFirstName() + 
				customer1.getSurname());
		
		System.out.println(customer2.getFirstName() + 
				customer2.getSurname());
		
		
		System.out.println(Customer.getCustomerCount());
		
		
		Product product1 = new Product("Coffee",3.45);
		
		Product product2 = new Product("Brownie",2.50);
	
		
		System.out.println(product1.getName() + product1.getPrice());
		System.out.println(product2.getName() + product2.getPrice());
		
		System.out.println(Product.getProductCount());
		
		System.out.println(product1.getProductCount());
		System.out.println(product2.getProductCount());
		
		Customer customer3 = null;
		
		if(customer3 instanceof Customer) {
			System.out.println("Customer");
		}
		else {
			System.out.println("not a customer");
		}
		
		
	}
}
