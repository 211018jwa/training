package com.revature.model;

import java.util.Objects;

// Let's make it a Java Bean
public class Animal {

	private String name;
	
	// No-args constructor
	public Animal() {
		super();
	}
	
	// Parameterized / all-args constructor
	public Animal(String name) {
		this.name = name;
	}
	
	// Behavior
	public final void makeNoise() { // because this method is final, we can't override it in the child classes / subclasses
		System.out.println("**Generic Animal Noises**");
	}

	// Getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Override methods from Object class
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
}
