package com.qa.example;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = getResponse(16);
		System.out.println(value);
	}

	private static String getResponse(int value) {
		String text = "";
		if (!(value % 3 == 0 || value % 5 == 0)) {
			return Integer.toString(value);
		}
		if (value % 3 == 0) {
			text = "Fizz";
		}
		if (value % 5 == 0) {
			text = "Buzz";
		}
		if (value % 5 == 0 && value % 3 == 0) {
			text = "FizzBuzz";
		}
		return text;

	}

}
