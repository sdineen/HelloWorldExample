package com.qa.example;

public class Blackjack {

	public static void main(String[] args) {
		int result = play(10,21);
		System.out.println(result);
	}

	private static int play(int i, int j) {
		if (i > 21 && j > 21) {
			return 0;
		}
		if (i > j) {
			return i;
		}
		return j;
		
	}

}
