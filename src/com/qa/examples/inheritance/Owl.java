package com.qa.examples.inheritance;

public class Owl extends Bird {
    private int wingspan = 30;

    public void doThing(){
        System.out.println("Wingspan: " + this.wingspan + ", Flight?: " + super.isFly());
    }

	@Override
	public void noise() {
		System.out.println("hoot");
		
	}
}
