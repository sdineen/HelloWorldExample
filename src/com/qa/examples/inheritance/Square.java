package com.qa.examples.inheritance;

public class Square implements Shape {

    @Override
    public double getArea(double side){
        return side * side;
    }

    @Override
    public double getPerimeter(double side){
        return side * 4;
    }

    public String getColour(){
        return "blue";
    }
}
