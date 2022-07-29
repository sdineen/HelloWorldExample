package com.qa.examples.inheritance;

public class Cat extends Animal {
	
	//annotation (meta data)
	@Override
    public void eat(){
        System.out.println("am nyam nyam");
    }
	
	//hiding a method in the base class
    public static void makeNoise() {
        System.out.println("hissss");
    }
}
