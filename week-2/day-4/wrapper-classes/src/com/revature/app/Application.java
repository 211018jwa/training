package com.revature.app;

public class Application {

	public static void main(String[] args) {
		
		// Wrapper classes: classes that serve as blueprints for objects that wrap up primitive values
		
		// In Java, there is some automatic management of going between primitives to the wrapper objects and vice versa
		// 	- Unboxing: The automatic "extraction" of the primitive value from the wrapper object
		//	- Autoboxing: The automatic creation of a wrapper object from a primitive
		//
		// The reason we have unboxing and autoboxing is because of how commonly we need to perform math operations or to treat primitives as objects
		
		/*
		 * Example of where unboxing comes in handy
		 */
		Integer i = new Integer(10); // i is a reference variable to an Integer object
		
		System.out.println(i + 5); // Normally, we should not be able to add an object to a primitive. That doesn't make any sense
		// What happens here is that the Integer object gets unboxed into a primitive, which then allows us to perform math operations
		// 10 (Object) + 5 -> 10 (int) + 5 (int) = 15 (int)
		
		// You can't do math with objects, you can only do math with primitives
		
		/*
		 * Another example of unboxing
		 */
		int someInt = i; // i gets unboxed into an int of value 10, which then gets assigned to someInt
		System.out.println(someInt);
		
		/*
		 * Unboxing arguments
		 */
		printInt(i); // i gets unboxed into an int of value 10, and passed into the method that takes an int parameter
		
		/*
		 * Autoboxing example
		 */
		Integer i2 = 10; // The primitive int value of 10 will be used to instantiate an Integer object with an internal value (property) of 10
		Integer i3 = 15;
		
		// Unboxing followed by autoboxing
		Integer i4 = i2 + i3; // i2 and i3 get unboxed into primitives, added together, and then autoboxed into another Integer object
		
		/*
		 * Summary: Autoboxing and unboxing allow for a seamless transition between working with primitives and their wrapper objects
		 */
	}
	
	public static void printInt(int a) {
		System.out.println(a);
	}

}
