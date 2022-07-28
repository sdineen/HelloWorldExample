package com.qa.example;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b;

	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double divide (double a, double b) {	
		if (a < b) {
		return a / b;
		}
		
		System.out.println("division can't be performed");
		return 0;
	}
	
	public static void main(String[] args) {
		Calculator calculator1 = new Calculator();
		System.out.println(calculator1.divide(51,7));
	}
}
