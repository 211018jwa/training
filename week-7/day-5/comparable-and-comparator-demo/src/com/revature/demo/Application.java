package com.revature.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> listOfStrings = new ArrayList<>();
		
		listOfStrings.add("tomato");
		listOfStrings.add("peach");
		listOfStrings.add("banana");
		listOfStrings.add("plum");
		
		// Collections.sort(...) does not know on its own how elements in a List
		// should be sorted
		// It depends on the "natural ordering" of a String
		// The natural ordering of a String is determined by the String class implementing
		// the Comparable interface
		Collections.sort(listOfStrings); 
		System.out.println(listOfStrings);
		
		/*
		 * We created the Person class which then implements the Comparable interface
		 * 	which we then provide an implementation for compareTo in order to provide a
		 * "natural ordering" of Person objects
		 */
		List<Person> listOfPeople = new ArrayList<>();
		
		listOfPeople.add(new Person("Bach", "Tran", 24));
		listOfPeople.add(new Person("Elon", "Musk", 50));
		listOfPeople.add(new Person("John", "Doe", 18));
		listOfPeople.add(new Person("Bob", "Jones", 18));
		listOfPeople.add(new Person("Jane", "Doe", 32));
		listOfPeople.add(new Person("Bob", "Tran", 18));
		listOfPeople.add(new Person("Bob", "Tran", 14));
		
		System.out.println(listOfPeople);
		
		Collections.sort(listOfPeople);
		System.out.println(listOfPeople);
		
		/*
		 * Even though a class might have a "natural ordering", we can choose to sort by
		 * something other than the natural ordering by using what is known as a Comparator object
		 * 
		 * Comparator is an interface
		 */
		Comparator<Person> lastNameComparator = (p1, p2) -> {
			return p1.getLastName().compareTo(p2.getLastName());
		};
		
		// this overloaded sort takes a second argument which is the Comparator object that you 
		// can pass in to sort in a customized way other than utilizing the natural ordering
		Collections.sort(listOfPeople, lastNameComparator);
		// The Comparator is NOT the natural ordering, it's an alternative way of specifying
		// your own ordering for objects that are being sorted.
		
		// What is the natural ordering of Person? age, then firstName, then lastName
		// What is the ordering using lastNameComparator? just lastName
		System.out.println(listOfPeople);
	}

}
