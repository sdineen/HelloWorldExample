package com.qa.examples.inheritance;

public class Circle implements Shape {

	@Override
	public double getArea(double radius) {
	 	return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter(double radius) {
		return 2 * Math.PI * radius;
	}

}
