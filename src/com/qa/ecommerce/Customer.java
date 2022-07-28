package com.qa.ecommerce;

public class Customer {
	
	 //instance variables
	 private String firstName; //camel casing
	 private String surname;
	 
	 private int id;
	 
	 //static variable
	 public static int customerCount = 0;
	 
	 
	 
	 
	 
	 //constructor
	 public Customer(String firstName, String surname) {
		 this.firstName = firstName;
		 this.surname = surname;
		 customerCount++;
	}

	//getter method
	 public String getFirstName() {
		 return firstName;
	 }
	 
	 public String getSurname() {
		 return surname;
	 }
	 
	 //setter method
	 public void setFirstName(String firstName) {		 
		 this.firstName = firstName;
	 }
	 
	 public void setSurname(String surname) {
		 this.surname = surname;
	 }

	public static int getCustomerCount() {
		// TODO Auto-generated method stub
		return customerCount;
	}
	 
	 
}
