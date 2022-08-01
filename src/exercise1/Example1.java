package exercise1;

import java.util.Scanner;

import com.qa.example.Product;

public class Example1 {

	public static void main(String[] args) {
		
        // Set up scanner object
        Scanner scan = new Scanner(System.in);

        // Read an int from the user
        System.out.println("Please enter a number: ");
        int first = scan.nextInt();    

        // Read a whole line from the user
        System.out.println("Please enter a message: ");
        String second = scan.nextLine(); // <- This will appear to be skipped

        // Print the responses
        System.out.println("First value = " + first);
        System.out.println("Second value = " + second);
		
	}


	
	
	

}