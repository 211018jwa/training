package com.revature.demo;

// A functional interface is an interface that contains only 1 abstract method
// So, any interface with only a single abstract method 
// will always be considered a functional interface

// The primary purpose of a functional interface is to create lambda expressions that implement
// that interface, rather than creating a class that implements the interface

// This annotation is not necessary. The purpose of putting it there
// is to inform the compiler and IDE that you intend to make this a functional interface
// And if it is not actually a functional interface, the IDE and/or compiler will complain
@FunctionalInterface 
public interface Predicate<T> {

	public boolean test(T t);
		
}
