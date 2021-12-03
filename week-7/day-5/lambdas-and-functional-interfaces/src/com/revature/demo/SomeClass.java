package com.revature.demo;

public class SomeClass implements Predicate<String> {

	// Check if string is less than or equal to 10 characters
	// "is less than or equal to 10 characters"
	@Override
	public boolean test(String t) {
		// This method will check for the length of a string, and if it exceeds 10 characters, 
		// returns false
		if (t.length() > 10) {
			return false;
		}
		
		return true;
	}

}
