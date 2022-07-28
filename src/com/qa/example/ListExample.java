package com.qa.example;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {
	
	 

	public static void main(String[] args) {
		ArrayList<String> meat = new ArrayList<>();
		meat.add("Beef");
		meat.add("Ham");
		meat.add("Chicken");
		Collections.shuffle(meat);

		for (String item : meat) {
			System.out.println(item);
		}
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(50);
		numbers.add(10);
		numbers.add(15);
		
		Collections.sort(numbers);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		


	}

}
