package com.qa.example;

public class Person {
    private String name;
    private String eyeColour;

    public static int numberOfPeople;

    public Person(String name, String colour) {
        this.name = name;
        this.eyeColour = colour;
        numberOfPeople++;
    }

    public String getName(){
        return this.name;
    }
    public String getEyeColour(){
        return this.eyeColour;
    }
    
    public static void setNumOfPeople(int numPeople){
        Person.numberOfPeople = numPeople;
    }
}