package com.revature.model;

public class Person {

	// Access modifiers are a different concept from variable scopes
	// Variable Scopes:
	// 	1. class scope (static): is the variable belonging to the class itself?
	//  2. instance scope: does the variable belong to individual instances (objects)?
	//  3. block scope: was the variable declared inside of a block? (if block, while loop, for loops, etc.)
	//  4. method scope: was the variable declared directly inside of a method, but outside of a block?
	
	// Fields w/ different access modifier levels
	public String firstName; // instance scoped variable w/ the public access modifier
	protected String lastName; // instance scoped variable w/ the protected access modifier
	double age; // instance scoped variable w/ default access modifier
	private String phoneNumber; // instance scoped variable w/ private access modifier
	
	// static fields
	public static int numOfInstances; // class scoped variable w/ public access modifier
	
	// Constructor
	public Person(String firstName, String lastName, double age, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		
		numOfInstances++;
	}
	
	// instance method
	public String getPhoneNumber() {
		return this.phoneNumber; // This method can access the private variable phoneNumber because it is inside of the same class
		// as that variable
	}
	
	public void printPhoneNumber() {
		System.out.println(this.firstName + "'s phone number is " + (this.phoneNumber));
	}
	
}
