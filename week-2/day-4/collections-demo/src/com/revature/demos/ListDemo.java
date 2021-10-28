package com.revature.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void demo() {
		// Lists maintain order of elements. Elements in a List are indexed, meaning we can access individual elements starting from index 0
		// (similar to Arrays)
		// The order of elements is maintained by the order in which they are added
		
		// ArrayLists are the typical go-to implementation when working with a List. You should use LinkedLists only if you see a real performance
		// benefit for some advanced use-case
		
		/*
		 * Compare Arrays v. Lists
		 *  
		 * 1. BOTH are indexed (starting from 0)
		 * 2. Arrays are fixed in size
		 * 3. Lists are NOT fixed in size
		 * 4. You can obtain the number of elements in an Array using .length
		 * 5. For Lists, you use a method called .size()
		 * 6. To access individual elements in an array, you use this syntax myIntArray[5] <- access the 6th element
		 * 7. To access individual elements in a List, you use .get(int index)
		 * 8. BOTH arrays and lists can have duplicate element values
		 */
		
		// Let's create our first ArrayList to store Strings
		List<String> listOfStrings0 = new ArrayList<String>(); // <String> is used to specify what type of object you would like for the Collection
		// to store.
		// <String> is an example of a generic. Generics can be a pretty advanced topic, but for our purposes, we can think of it as a "parameterized type"
		
		List<String> listOfStrings = new ArrayList<>(); // normally, programmers leave off the type on the right side if they are assigning a Collection to 
		// a reference variable. This is because it can automatically infer that the ArrayList being constructed is supposed to store Strings
		
		listOfStrings.add("Mango");
		listOfStrings.add("Peach");
		listOfStrings.add("banana");
		listOfStrings.add("Banana");
		listOfStrings.add("Banana");
		listOfStrings.add("plum");
		listOfStrings.add("mangosteen");
		listOfStrings.add("longan");
		
		System.out.println("listOfStrings: " + listOfStrings); // printing out the listOfStrings will print out all of the elements inside it
		// This is because of how ArrayList overrides the toString() method
		
		System.out.println("Number of elements inside listOfStrings: " + listOfStrings.size());
		
		listOfStrings.remove(new String("Peach")); // behind the scenes, the remove method checks to see if any elements are equal to the one you want
		// to remove using the .equals() method of that object (in the case, the .equals() method that the String class overrides)
		// Another way of putting it is, does (new String("Peach").equals(element in list)? <- Pseudocode
		
		listOfStrings.remove(new String("Banana")); // remove will only remove the first occurrence
		
		System.out.println(listOfStrings);
		
		// Traversing a List
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println("index: " + i + ": " + listOfStrings.get(i));
		}
				
		// Let's try to remove all occurrences of Banana
		// The best way to do that is by using what is known as an iterator object
		// This iterator object is connected with our ArrayList object
		// And will allow us to traverse through the List and also remove elements that we specify
		Iterator<String> iter = listOfStrings.iterator();
		
		// Traversal through the list
		while (iter.hasNext()) { // While the iterator still has elements to continue iterating over (returns true if it does, returns false if it doesn't)
			String nextElement = iter.next(); // iter.next(): move the cursor to the next element in the list and also return that element
			if (nextElement.equals("Banana")) {
				iter.remove(); // remove the element at the current position of the cursor (iter.next())
			}
		}
		
		System.out.println("All Bananas are gone: " + listOfStrings);
		
		/*
		 * The idea of an iterator is actually really important, because that is actually how enhanced for loops (for-each loops) really work
		 */
		// Traverse using an enhanced for loop
		for (String s : listOfStrings) {
			System.out.println(s);
		}
		
		System.out.println("=====");
		
		// Same as
		Iterator<String> myIter = listOfStrings.iterator();
		while (myIter.hasNext()) {
			System.out.println(myIter.next());
		}
		
		/*
		 * Collection v. Collections
		 * 
		 * Collection: an interface that is part of the Collections API hierarchy
		 * Collections: a class that NOTHING else inherits. It is simply a utility class that we can use
		 * 
		 * Utility class: A class that is NOT used as a blueprint for objects, but instead contains static methods that might be useful to use
		 */
		
		Collections.reverse(listOfStrings); // reverse is a STATIC method. STATIC means it belongs to the class itself
		// So, we can access the reverse method not from an object of the class, but directly from the class
		// Collections.reverse <- reverses in-place
		
		System.out.println("reversed list: " + listOfStrings);
		
		Collections.sort(listOfStrings); // Will sort the list alphabetically (in-place)
		
		System.out.println(listOfStrings);
		
		Collections.shuffle(listOfStrings);
		
		System.out.println("shuffled list: " + listOfStrings);
	}
	
}
