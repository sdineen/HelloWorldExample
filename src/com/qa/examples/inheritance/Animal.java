package com.qa.examples.inheritance;

public class Animal {
	//instance method
    public void eat(){
        System.out.println("om nom nom");
    }
    
    public void sleep() {
        System.out.println("zzz");
    }
    
    //static method (or class method)
    public static void makeNoise() {
        System.out.println("growllll");
    }
}
