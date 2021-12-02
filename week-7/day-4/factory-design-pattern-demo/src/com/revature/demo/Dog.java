package com.revature.demo;

public class Dog implements Animal {

	public Dog() {
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Bark!");
	}
}
