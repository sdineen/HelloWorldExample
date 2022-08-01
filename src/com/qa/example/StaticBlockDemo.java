package com.qa.example;

import java.util.LinkedList;
import java.util.List;

public class StaticBlockDemo {
    public static List<String> languages = new LinkedList<>();

    //static block
    static {
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
    }

    static {
        languages.add("HTML");
        languages.add("Groovy");
    }
    
    
    public static void main(String[] args) {
    	System.out.println(languages);
	}
}
