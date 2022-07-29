package com.qa.example;

public class ClassB extends ClassA {
	//compile error - can't hide an instance method
//    public static void methodOne(int i) {
//    }

	//overrides method in base class
	public void methodTwo(int i) {
	}

	//compile error - can't override a static method
//    public void methodThree(int i) {
//    }

    //hides method in base class
	public static void methodFour(int i) {
	}

	public static void main(String[] args) {
		ClassA c1 = new ClassB();
		c1.methodFour(0);
	}
}