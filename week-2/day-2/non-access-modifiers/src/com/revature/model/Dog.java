package com.revature.model;

public class Dog extends Animal {

	public Dog() {
		super();
	}
	
	public Dog(String name) {
		super(name);
	}
	
	// Can't do this because makeNoise in Animal is final
//	@Override
//	public void makeNoise() {
//		
//	}
	
}
