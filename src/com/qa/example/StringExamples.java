package com.qa.example;

public class StringExamples {

	public static void main(String[] args) {
		
		int count = method1("to be or not to be");
		System.out.println(count);

	}

	private static int method1(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			String substr = str.substring(i, i + 1);
			if(substr.equals(" ")) {
				count++;
			}
		}
		return count;
	}

}
