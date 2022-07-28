package com.qa.example;

import java.util.Random;

public class Dice {
	
	static int total = 0; //class variable
	
	public static void main(String[] args) {
		System.out.println(rollTwoDTwenty());
	}

	private static int rollTwoDTwenty() {       
        total += rollDTwenty();
        total += rollDTwenty();
        return total;
	}

	private static int rollDTwenty() {
		return new Random().nextInt(21);
	}
	

}
