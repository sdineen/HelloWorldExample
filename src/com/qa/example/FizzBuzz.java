package com.qa.example;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = getResponse(15);
		System.out.println(value);
	}

	private static String getResponse(int value) {
		String text = "";
		if (value % 3 == 0) {
			text = "Fizz";
		}
		if (value % 5 == 0) {
			text += "Buzz";
		}
		if (text.isBlank()) {
			return Integer.toString(value);
		}
		return text;

	}

}
