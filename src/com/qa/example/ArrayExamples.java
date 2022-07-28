package com.qa.example;

public class ArrayExamples {
	public static void main(String[] args) {
		// printSumOfDigits(74);
		convertToText(11);

	}

	private static void convertToText(int number) {
		String numString = Integer.toString(number);
		String a = numString.substring(0, 1);
		String b = numString.substring(1, 2);

		String text = "";
		switch (a) {
		case "1":
			switch (b) {
			case "1":
				text = "eleven";
				break;
			case "2":
				text = "twelve";
				break;
			default:
			}
			break;

		case "2":
			text = "twenty-";
			break;
		case "3":
			text = "thirty-";
			break;

		default:
			break;
		}
		switch (b) {
		case "1":
			text += "one";
			break;
		case "2":
			text += "two";
			break;

		default:
			break;
		}

		System.out.println(text);
	}

	private static void printSumOfDigits(int number) {
		String numString = Integer.toString(number);
		String a = numString.substring(0, 1);
		String b = numString.substring(1, 2);
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		System.out.println(x + y);
	}
}
