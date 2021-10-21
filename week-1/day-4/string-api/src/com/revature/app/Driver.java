package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		// String: an object whose role is to provide a structure for a sequence of characters
		String s1 = "Hello world";
		
		// Unlike other objects, we can utilize String literals such as "Hello World" instead of the new keyword
		// But, like other objects we can still do so anyways
		char[] myCharacters = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		String s2 = new String(myCharacters);
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		System.out.println("s1 == s2: " + (s1 == s2)); // false because s1 and s2 do not point to the same object
		
		// We are using the s1 String object's instance method, equals() to compare values of different String objects
		System.out.println("s1.equals(s2): " + (s1.equals(s2))); // true, because these two String objects have the same underlying value
		
		// concat() method: used to add two strings together
		String s3 = "Hello";
		String s4 = " world";
		s3 = s3.concat(s4); // Strings are immutable, so you are not actually changing the value of the String s3
		// the concat method, in other words, will create a new String object, and you then need to point to that new String object
		// the concat method will always create an object in the regular part of the heap and not in the String pool
		System.out.println(s3);
		
		System.out.println("Hello" + " world" == s3); // false
		System.out.println("Hello" + " world" == "Hello world"); // true
		
		System.out.println(s3);
		s3 = s3.replace('l', 'x'); // s3 is now pointing to the object that was created by s3.replace('l', 'x')
		// This object that was created is in the regular heap (not the String pool)
		System.out.println(s3);
		
		/*
		 * Commonly used String methods
		 * 
		 * The big difference between String instance methods and instance methods of most other classes (including the ones we create ourselves) is that String instance methods
		 * DO NOT modify the properties of the String object itself.
		 * 
		 * Why? Because Strings are IMMUTABLE. You CANNOT change the value of a String object once it has been created
		 * 
		 * So, methods such as concat or replace do not modify the existing String object. They instead create a new String object in the regular heap
		 * 
		 * API (Application Programming Interface):
		 * 	We commonly refer to the String class and its associated methods as the "String API"
		 * 	An API, as I like to think of it, is a collection of routines/sub-routines/methods/backend interfaces/whatever else
		 * 		That 
		 * 			1. Takes in an input
		 * 			2. Returns an output
		 */
		
		// String concat(String str)
		// boolean startsWith(String str)
		// boolean endsWith(String str)
		// boolean contains(String str)
		// char charAt(int index)
		// boolean matches(String regex)
		// String substring(int beginIndex)
		// String substring(int beginIndex, int endIndex) (endIndex is non-inclusive)
		// String[] split(String regex)
		
		String s5 = "Hello, world, my, name, is, Bach";
		String[] myStrings = s5.split(", ");
		
		for (int i = 0; i < myStrings.length; i++) {
			System.out.println(myStrings[i]);
		}
	}

}
