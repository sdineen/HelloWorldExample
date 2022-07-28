package com.qa.example;

public class Car {
	private String make;
	private String model;
	private boolean isElectric;
	
	//overloaded constructors (more than one, with different numbers or types of parameter)
	private Car (String make, String model){
		this.setMake(make);
		this.setModel(model);
	}
	
	public Car(String make, String model, boolean isElectric) {
		this(make, model);
//		this.setMake(make);
//		this.setModel(model);
		this.setElectric(isElectric);
	}
	
	public static Car newCar(String make, String model) {
		return new Car(make, model);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	

}
