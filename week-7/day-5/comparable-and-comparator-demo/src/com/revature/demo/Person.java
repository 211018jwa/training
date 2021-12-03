package com.revature.demo;

import java.util.Objects;

public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/*
	 * compareTo should follow the following contract:
	 * 
	 * If the two objects are equal, then the compareTo method should return 0
	 * If the current object should come BEFORE the object we are comparing to, it should return 
	 * 	a negative number (< 0)
	 * 
	 * If the current object should come AFTER the object we are comparing to, it should return
	 * 	a positive number (> 0)
	 */
	@Override
	public int compareTo(Person anotherPerson) {
		// Compare by ages first, then by firstName, then by lastName
		
		if (this.age == anotherPerson.age) {
			// If the ages are equal
			if (this.firstName.equals(anotherPerson.firstName)) { // check if firstNames are equal
				return this.lastName.compareTo(anotherPerson.lastName);
			}
			
			return this.firstName.compareTo(anotherPerson.firstName);
		}
		
		return this.age - anotherPerson.age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName);
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
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}
