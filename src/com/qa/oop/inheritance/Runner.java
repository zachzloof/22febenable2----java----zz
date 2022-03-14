package com.qa.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog bob = new Dog(15, 4, "black", "Staffy", false);
		Cat cat = new Cat(15, 4, "white", "bald", true);
		
		System.out.println(cat);
		cat.makeNoise();
		
		//dog belongs to all 3 classes
		
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(bob);
		listOfAnimals.add(cat);

	}

}
