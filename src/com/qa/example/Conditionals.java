package com.qa.example;

public class Conditionals {
	
	
	public static void main(String[] args) {

		flowchart(8);

	}







	private static void flowchart(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a>6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if(a > 4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if(a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if(a> 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
		
	}

	private static int input(int i, int j, boolean isSum) {
		if(isSum) {
			return i + j;
		}
		return i*j;
	}
	


}
