package com.qa.examples.inheritance;

import phylogenetic.Eukaryota;
import phylogenetic.animals.Animals;
import phylogenetic.animals.Sponges;
import phylogenetic.plants.Plants;

public class Runner {

	public static void main(String[] args) {
		
        Shape s = new Square();
        System.out.println(s.getArea(3) + ", " + s.getPerimeter(3));

        s = new Circle();
        System.out.println(s.getArea(3) + ", " + s.getPerimeter(3));
        		
        
//		Bird bird1 = new Magpie();
//		bird1.noise();
//		
//		
//		Chicken chicken1 = new Chick();

		// polymorphic behaviour
//		Eukaryota eukaryota1 = null;
//
//		eukaryota1 = new Sponges("SpongBob");
//		System.out.println(eukaryota1.numberOfSpecies());
//		System.out.println(eukaryota1.getName());
//
//		eukaryota1 = new Plants();
//		System.out.println(eukaryota1.numberOfSpecies());
//
//		eukaryota1 = new Animals();
//		System.out.println(eukaryota1.numberOfSpecies());

//		Eukaryota euk1 = new Animals();
//		System.out.println(euk1.numberOfSpecies());

//		Animal cat1 = new Cat();
//		cat1.makeNoise(); //static method - calls method in reference variable type
//		cat1.eat(); //instance method - calls method in object type
//		
//		System.out.println(cat1 instanceof Animal);

//        Owl owlfriend = new Owl();
//        owlfriend.doThing();
//        owlfriend.noise(); // will return "tweet", because Owl extends Bird!
//
//        Chicken chikin = new Chicken();
//        chikin.doThing();
//        chikin.cluck();
//        chikin.noise();  // will return "tweet", because Chicken also extends Bird!
	}

}
