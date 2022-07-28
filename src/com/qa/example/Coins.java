package com.qa.example;

public class Coins {

	public static void main(String[] args) {
		printChange(4.58, 20);
	}

	private static void printChange(double cost, double amount) {
		double change = amount - cost;
		int tenPoundCount = 0;
		int fivePoundCount = 0;
		int onePoundCount = 0;
		int fiftyPenceCount = 0;
		int twentyPenceCount = 0;
		int tenPenceCount = 0;
		int fivePenceCount = 0;
		int twoPenceCount = 0;
		int onePenceCount = 0;
		
		while (change - 10 >= 0) {
			change -= 10;
			tenPoundCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 5 >= 0) {
			change -= 5;
			fivePoundCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 1 >= 0) {
			change -= 1;
			onePoundCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change -0.5 >= 0) {
			change -= 0.5;
			fiftyPenceCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 0.2 >= 0) {
			change -= 0.2;
			twentyPenceCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 0.1 >= 0) {
			change -= 0.1;
			tenPenceCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 0.05 >= 0) {
			change -= 0.05;
			fivePenceCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 0.02 >= 0) {
			change -= 0.02;
			twoPenceCount++;
		}
		change = Math.round(change*100)/100.0;
		while (change - 0.01 >= 0) {
			change -= 0.01;
			onePenceCount++;
		}
		System.out.println("10 x "+tenPoundCount);
		System.out.println("5 x "+fivePoundCount);
		System.out.println("1 x "+onePoundCount);
		System.out.println("0.5 x "+fiftyPenceCount);
		System.out.println("0.2 x "+twentyPenceCount);
		System.out.println("0.1 x " +tenPenceCount);
		System.out.println("0.05 x " +fivePenceCount);
		System.out.println("0.02 x " +twoPenceCount);
		System.out.println("0.01 x " +onePenceCount);
		
	}

}
