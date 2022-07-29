package com.qa.examples.inheritance;

public abstract class Bird extends Object {
	//attributes
	private boolean fly = true;

	
	//methods
    public abstract void noise();


	public boolean isFly() {
		return fly;
	}


	public void setFly(boolean fly) {
		this.fly = fly;
	}
}
