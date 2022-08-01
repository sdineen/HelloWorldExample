package exercise1;

import java.util.Scanner;

import com.qa.example.Product;

public class Example1 {

	public static void main(String[] args) {
        String personName = "";
        changePersonName(personName);
        System.out.println(personName);
	}

    static void changePersonName(String personName) {
        personName = "Stephan";
}

}