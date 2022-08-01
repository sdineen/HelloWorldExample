package com.qa.example;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
	
		while(scan.hasNextLine()) {
			String number = scan.nextLine();
			System.out.println("number is "+number);
			int i = Integer.parseInt(number);
		}
		
		
//		while ((number = scan.nextLine()) != null) {
//			System.out.println("number is "+number);
//			int i = Integer.parseInt(number);
//
//		}
	}
}
