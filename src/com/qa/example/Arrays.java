package com.qa.example;

public class Arrays {

	public static int votes[] = { 1, 1, 2, 1, 3 };

	public static void process(int vote) {
		System.out.println(vote);
	}

	public static int nums[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		
		char c = 'q';
		String s = "text";
		
		
		
		for (int i : nums) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == i) {
					System.out.println("i:" + i + " j:" + nums[j] + " i and j match");
				}
			}
		}

//		int[][] ageArray = {{25, 30, 21},{56, 67, 39},{8}};
//		
//		for (int[] outer : ageArray) {
//			for (int inner : outer) {
//				System.out.println(inner);
//			}
//		}
//		
//		for (int i = 0; i < ageArray.length; i++) {
//			for (int j = 0; j < ageArray[i].length; j++) {
//				System.out.println(ageArray[i][j]);
//			}
//		}

//		int[][] ageArray = new int[3][];
//		ageArray[0] = new int[3];
//		ageArray[1] = new int[3];
//		ageArray[2] = new int[1];
//		
//		ageArray[0][0] = 25;
//		ageArray[0][1] = 30;
//		ageArray[0][2] = 21;
//		
//		ageArray[1][0] = 56;
//		ageArray[1][1] = 67;
//		ageArray[1][2] = 39;
//		
//		ageArray[2][0] = 8;

	}

}
