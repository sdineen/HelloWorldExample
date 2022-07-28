package com.qa.example;

public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double percentage = method1(15500);
		System.out.println(percentage);
		
		double amountTaxed = method2(22500);
		System.out.println(amountTaxed);
	}

	private static double method2(int salary) {
		return salary * method1(salary)/100.0;
	}

	private static double method1(int salary) {

		if(salary >= 45000) {
			return 25;
		}
		if (salary >= 30000) {
			return 20;
		}
		if (salary >= 20000) {
			return 15;
		}
		if(salary >= 15000) {
			return 10;
		}
		return 0;
	}

}
