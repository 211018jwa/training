package com.revature.demo;

/*
 * The purpose of the factory design pattern is to give the responsibility of 
 * the creation of specific types of objects
 * to a special "Factory" class
 */

// The purpose of the AnimalFactory is to create Animal objects
public class AnimalFactory {

	public AnimalFactory() {
	}
	
	public Animal createAnimal(String type) {
		if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cat")) {
			return new Cat();
		} else if (type.equals("chicken")) {
			return new Chicken();
		}
		
		return null;
	}
	
}
