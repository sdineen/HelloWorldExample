package com.qa.examples.inheritance;

public abstract class Chicken extends Bird implements Flyable, Hatchable {
    private int eggCount = 0;

    public void doThing(){
        System.out.println("Flight? " + super.isFly());
    }

    public void cluck() {
        System.out.println("bwark");
    }

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("Chicken noise");
	}

	@Override
	public void spreadWings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergeFromEgg() {
		// TODO Auto-generated method stub
		
	}


}
