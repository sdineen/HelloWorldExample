package com.qa.example;

public class BuildCars {

	public static void main(String[] args) {
		Car car1 = new Car("Tesla", "Model X", true);
		Car car2 = new Car("BMW", "318d", false);
		Car car3 = new Car("Ford", "Mondeo", false);
		Car car4 = Car.newCar("VW", "Golf");
		
		car1.setElectric(true);
		
		System.out.println(car1.getMake() +" "+car1.getModel()+" " + car1.isElectric());
		System.out.println(car2.getMake() +" "+car2.getModel()+" " + car2.isElectric());
		System.out.println(car3.getMake() +" "+car3.getModel()+" " + car3.isElectric());

	}

}
