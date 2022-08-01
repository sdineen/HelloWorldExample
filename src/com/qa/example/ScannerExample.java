package com.qa.example;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		String number = null;
		while ((number = scan.nextLine()) != null) {
			System.out.println("number is "+number);

		}
	}
}
