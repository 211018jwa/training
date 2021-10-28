package com.revature.demos;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void demo() {
		// Sets
		// 1. DO NOT have an index
		// 2. Can only contain unique elements
		// 
		// Two implementations of Set to be aware of:
		// 1. HashSet: no ordering of elements
		// 2. TreeSet: ordering of elements
		
		// Change between HashSet and TreeSet
//		Set<String> mySet = new HashSet<>();
		Set<String> mySet = new TreeSet<>();
		
		// Using the Set interface type as our reference variable
		// referring to a HashSet object (constructed from the HashSet class)
		
		mySet.add("Peach");
		mySet.add("Avocado");
		mySet.add("Mangosteen");
		mySet.add("Banana");
		mySet.add("Banana");
		
		System.out.println("mySet: " + mySet); // no order if it is a HashSet, but there is an order if it is TreeSet
		
		for (String c : mySet) {
			System.out.println(c);
		}
		
		// Sets come in handy if you need to check if you have already encountered some value
		// Some algorithms that you write might have to utilize this type of strategy
		
	}

}
