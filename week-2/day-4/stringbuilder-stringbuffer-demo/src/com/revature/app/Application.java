package com.revature.app;

public class Application {

	public static void main(String[] args) {
		
		long beginTime;
		long endTime;
		
		// reverseStringUsingStringConcatenation
		beginTime = System.nanoTime(); // get the time in nanoseconds right before we run the below method
		System.out.println(reverseStringUsingStringConcatenation("hello world"));
		endTime = System.nanoTime();
		
		System.out.println("reverseStringUsingStringConcatenation took " + (endTime - beginTime) + " ns");
		
		
		// reverseStringUsingStringBuilder
		beginTime = System.nanoTime();
		System.out.println(reverseStringUsingStringBuilder("hello world"));
		endTime = System.nanoTime();
		
		System.out.println("reverseStringUsingStringBuilder took " + (endTime - beginTime) + " ns");
		
		// reverseStringUsingStringBuffer
		beginTime = System.nanoTime();
		System.out.println(reverseStringUsingStringBuffer("hello world"));
		endTime = System.nanoTime();
		
		System.out.println("reverseStringUsingStringBuffer took " + (endTime - beginTime) + " ns");

	}
	
	// If we are trying to build a String using String concatenation, it is a lot slower than using StringBuilder
	// The reason for this is that every time we perform a String concatenation operation, there is a lot of overhead that is needed
	// because it will create a new object each time.
	// Why does it need to create a new object each time? Because Strings are immutable. Which means once you create a String object,
	// its value cannot be changed
	public static String reverseStringUsingStringConcatenation(String s) {
		// String concatenation is using the + operator to combine two Strings together
		// What this actually does is takes the values of the two Strings and constructs a new String object consisting of those values
		String result = ""; // method scoped variable
		
		for(int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i); // block scoped variable
			
			result = result + c; // You can concatenate a String and char together
		}
		
		return result;
	}
	
	/*
	 * StringBuilder and StringBuffer are MUTABLE
	 * So, we can append additional characters to these objects and have a much faster performance
	 */
	
	public static String reverseStringUsingStringBuilder(String s) {
		
		StringBuilder sb = new StringBuilder(); // instantiate the StringBuilder object
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			
			sb.append(c);
		}
		
		String result = sb.toString(); // toString is returning a String representation of the characters contained inside the StringBuilder object
		// the toString method comes from the Object class. The StringBuilder class is just overriding this toString() method
		
		return result;
	}
	
	public static String reverseStringUsingStringBuffer(String s) {
		
		StringBuffer sb = new StringBuffer(); // instantiate the StringBuilder object
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			
			sb.append(c);
		}
		
		String result = sb.toString(); // toString is returning a String representation of the characters contained inside the StringBuilder object
		// the toString method comes from the Object class. The StringBuilder class is just overriding this toString() method
		
		return result;
	}

}
