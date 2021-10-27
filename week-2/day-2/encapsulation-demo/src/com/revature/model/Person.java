package com.revature.model;

import java.util.Objects;

// Here is where we are demonstrating encapsulation
// We want a way to wrap up data about a person into a single unit
// Having a Person blueprint in order to create Person objects that will store that data is a good idea

/*
 * Java Bean: a Java bean is a class that
 * 	1. Has a no-args constructor
 * 	2. Has getters/setters for its properties
 * 	3. Is serializable (however this is obsolete at this point), so we will consider a Java bean to be just the first 2 conditions
 */
public class Person {
	
	private String firstName; // private means you can only access the field within the same class
	private String lastName;
	private int age;
	private String phoneNumber;
	
	// No-args constructor
	public Person() {
		super();
	}
	
	public Person(String firstName, String lastName, int age, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * Getters/Setters
	 * 
	 * Getters: used to retrieve the values of the properties of an object
	 * Setters: used to change the values of the properties of an object
	 */
	
	// Getter
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Setter
	public void setFirstName(String firstName) {
		// firstName = firstName; // This doesn't work if we have the instance variable with the same name as the method parameter
		// This is due to "variable shadowing". The firstName parameter will shadow over the firstName instance variable
		// in effect, firstName = firstName is the same as setting the parameter to equal the value of itself, which accomplishes nothing
		
		// So, to remove ambiguity with regards to variable shadowing, we use the this keyword
		this.firstName = firstName; // this.firstName makes it really clear we want to set the firstName INSTANCE VARIABLE to the value
		// of the firstName method parameter
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * Object class method overriding
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	
}
