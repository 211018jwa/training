package com.revature.model;

public class Bus {

	// These are known as fields
	// We know that they are fields because they are directly specified inside the class itself and not in a method
	
	// Fields are different than variables declared inside of a method in that they have default values
	// 	Default value for reference fields: null
	//  Default value for numbers: 0 (integral types) 0.0 (for floating-point types)
	//  Default value for boolean: false
	
	// (Non-static fields) are known as instance variables. They are properties scoped to individual objects. Each object has its own copy of these properties
	// Ex. All humans have a copy of two properties: firstName and lastName
	public String type; // default value of null
	public int numberOfWheels; // default value of 0
	public int year; // default value of 0
	public String model; // default value of null
	
	/*
	 * Constructors: subroutines that are similar to methods, except that they are invoked in order to actually create the object.
	 * 	We can utilize constructors to populate the initial properties of an object
	 * 
	 * 	In order to define a constructor, we simply create what looks like a method, but with the name of the class
	 * 
	 * 	If we do not declare any constructor inside of our class, the Java compiler will automatically provide a constructor by default
	 * 
	 * 	This default constructor is known as the "default no-args constructor"
	 * 
	 * 	However, as soon as we define any sort of constructor (no matter the number of parameters it takes), it will NOT BE PROVIDED
	 * 
	 * 	Constructors DO NOT have a return type (unlike methods)
	 */
	
	// This constructor has 0 parameters
	// Constructor overloading
	public Bus() {	
	}
	
	public Bus(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public Bus(int numberOfWheels, int year) {
		this(numberOfWheels);
		this.year = year;
	}
	
	public Bus(int numberOfWheels, int year, String model) {
		this(numberOfWheels, year);
		this.model = model;
	}
	
	// This constructor has 4 parameters
	public Bus(int numberOfWheels, int year, String model, String type) {
		// "this" is referring to the object itself that we are creating
		// We want to set the properties of "this" object to the following values
		
		this(numberOfWheels, year, model); // constructor chaining
		// this() is used to invoke other constructors that are defined for the same class
		// can be used to prevent duplicate code
		
		this.type = type;
	}
	
	/*
	 * Technical terminology aside: parameter v. argument?
	 * 
	 * Arguments are what you send into a constructor (or method)
	 * 
	 * Parameters are what you use inside of that constructor (or method)
	 */
	
	
}
