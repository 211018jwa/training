package com.revature.app;

public class Application {

	/*
	 * Non-access modifiers
	 * 
	 * 	These are the modifiers that are not related to access (public, protected, default, private)
	 * 
	 * Some non-access modifiers to be aware of include:
	 * 	1. static: can be placed on a variable or a method to make that variable or method belong directly to the class itself (class scoping for variables)
	 * 	2. final: can be placed on a class, variable, or method (and has different implications for each)
	 * 				placed on a class: A class that is final cannot be extended by other classes
	 * 				placed on a variable: A variable that is final cannot have its value changed
	 * 				placed on a method: A method that is final cannot be overridden
	 * 	3. abstract: placed on a class to make the class abstract or a method within an abstract class to make that method abstract
	 *  4. synchronized: (multi-threading) not really going to cover
	 */
	
	public static void main(String[] args) {
		System.out.println(MyClass.property1);
		System.out.println(MyClass.property2);
		MyClass.method1();
		MyClass.method2();

		// We can make a variable final
		final int a;
		a = 10; // Once you assign a value to the variable for the first time, it cannot be reassigned to another value
		// In other words, 10 will be the value of a forever after that
		// a = 20; // This is not possible because the definition of a final variable is that you cannot change its value
	}

}
