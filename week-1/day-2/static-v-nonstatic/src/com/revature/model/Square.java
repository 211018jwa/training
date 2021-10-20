package com.revature.model;

public class Square {

	// Fields, whether they are non-static OR static, will have default values
	public double side; // default value of 0
	public static int numberOfInstances; // default value of 0
	
	public Square(double side) {
		this.side = side;
		
		numberOfInstances++; // same as numberOfInstances += 1 or numberOfInstance = numberOfInstances + 1
	}
	
}
