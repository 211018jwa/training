package com.revature.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		
		Predicate<String> sc = new SomeClass();
		
		boolean b1 = sc.test("fdslkjflksjlkjkljlkj");
		System.out.println(b1);
		
		/*
		 * Anonymous class
		 */
		// In Java, we have "named classes" and "anonymous classes"
		// Anonymous classes have no name
		
		// Anonymous clases came before lambdas
		Predicate<String> obj = new Predicate<String>() { 
			// Between the curly braces is an anonymous class that is implementing the 
			// Predicate interface
			// because we have an implementation, we can then instantiate an object from 
			// that anonymous class
			@Override
			public boolean test(String s) {
				if (s.length() > 10) {
					return false;
				}
				
				return true;
			}
		};
		
		boolean b3 = obj.test("asdd");
		System.out.println(b3);
		
		/*
		 *  Lambda expression
		 */
		Predicate<String> myLambda = (s) -> {
			if (s.length() > 10) {
				return false;
			}
			
			return true;
		};
		
		// A lambda expression is the implementation of a functional interface and the instantiation
		// of this implementation all in one.
		// In other words, a lambda is actualy an object created from what is known as an 
		// "anonymous class"
		
		boolean b2 = myLambda.test("fdslkjflksjlkjkljlkj");
		System.out.println(b2);
		
		// Java's built-in BiPredicate functional interface:
		BiPredicate<String, Integer> checkIfStringIsCertainLength = (s, i) -> {
			
			if (s.length() == i) {
				return true;
			}
			
			return false;
		};
		
		boolean b4 = checkIfStringIsCertainLength.test("abc", 3);
		System.out.println(b4);
		
		// Java's built-in Consumer functional interface
		Consumer<String> printStringWithPunctuation = (s) -> {
			System.out.println(s + "!!!!!!!!!");
		};
		
		printStringWithPunctuation.accept("Hello");
		
		// Java's built-in Function functional interface
		Function<String, String> transformString = (s) -> {
			return s + "!!!";
		};
		
		String s1 = transformString.apply("hey");
		System.out.println(s1);
		
		// 
		Function<String, Integer> countNumberOfsCharacters = (s) -> {
			int numOfsChars = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 's') {
					numOfsChars++;
				}
			}
			
			return numOfsChars;
		};
		
		int count = countNumberOfsCharacters.apply("Functional interfaces are awesome");
		System.out.println(count);
		
		/*
		 * List of Strings
		 */
		List<String> myStrings = new ArrayList<>();
		myStrings.add("abc");
		myStrings.add("def");
		myStrings.add("adsflkskdjlkjkljlkjlkjljl");
		myStrings.add("testing123");
		
		// filter out all of the strings that have a length > 10
		Stream<String> myStream = myStrings.stream().filter((s) -> {
			if (s.length() > 10) {
				return false;
			}
			
			return true;
		});
		
		List<String> filteredStrings = myStream.collect(Collectors.toList());
		System.out.println(filteredStrings);
	}

}
