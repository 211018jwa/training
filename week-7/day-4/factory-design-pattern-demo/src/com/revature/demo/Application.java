package com.revature.demo;

public class Application {

	public static void main(String[] args) {
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal a1;
		a1 = animalFactory.createAnimal("chicken");
		a1.makeNoise();

		a1 = animalFactory.createAnimal("dog");
		a1.makeNoise();
		
		a1 = animalFactory.createAnimal("cat");
		a1.makeNoise();
		
		Animal cat1 = animalFactory.createAnimal("cat");
		Animal cat2 = animalFactory.createAnimal("cat");
		System.out.println("is cat1 pointing to the same object as cat2? " + (cat1 == cat2)); // no
	}

}
