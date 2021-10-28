package com.revature.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void demo() {
		// Maps: a data structure comprised of key-value pairs
		// 	1. The key is used to retrieve the associated value
		// 	2. The retrieval of the value occurs in O(1) time
		// 	3. keys are unique
		//  4. values DO NOT have to be unique
		
		String myString = "asd;lfj;lkjvoijoieoiufeijg;lijqoijdf;lkjerooius;lkj;lkjrepoijwlkjgoiuuiouoiwrutoiwuioueworiuewrdlkjlcknvcxkmldksjfl;ajrogohwoih";
		
		// Objective: count up the frequency of characters in this long string
		// A good data structure to use is a map
		
		// Notice we are using the wrapper classes, Character and Integer
		// That is because Collections CANNOT store primitives directly
		// They can only store objects
		// This is why we need wrapper objects if we still want to work with "primitive" types within Collections
		Map<Character, Integer> characterFrequency = new HashMap<>();
		
		// Iterate through the String
		for (int i = 0; i <= myString.length() - 1; i++) {
			char c = myString.charAt(i);
			
			// Check to see if this is the first time we have encountered this character
			if (characterFrequency.get(c) == null) { // if the character is not inside the Map yet
				characterFrequency.put(c, 1); // this is the first time, so we put in a value of 1, since we have so far only encountered 1 of these characters
			} else {
				characterFrequency.put(c, characterFrequency.get(c) + 1); // Otherwise, increment the frequency by 1
			}
		}
		
		// Iterating over the keys
		Set<Character> uniqueCharacters = characterFrequency.keySet();
		
		for (Character c : uniqueCharacters) {
			System.out.println(c);
		}
		
		// Iterate over both Keys and values
		
		// A Set of Entry elements consisting of the Character type for the key and Integer type for the value
		Set<Entry<Character, Integer>> keyValuePairs = characterFrequency.entrySet();
		
		for (Entry<Character, Integer> keyValuePair : keyValuePairs) {
			System.out.println(keyValuePair.getKey() + " : value = " + keyValuePair.getValue());
		}
		
		/*
		 * The important takeaway is that to solve certain problems, you will require certain data structures to use
		 * For example, a great way to count up all of the characters encountered in a String is using a Map
		 */
		
		System.out.println("number of o's: " + characterFrequency.get('o'));
		
		// With regards to the hierarchy of the Collections API,
		// Map is NOT part of the Collection hierarchy
		// 	- It is a collection, but not part of the same inheritance structure as Set, Queue, and List
		// 	- It is off by itself because Map doesn't realistically fit into being an Iterable, considering it has a key-value pair (2 pieces of information)
		// 		instead of 1 like the other 3

	}
	
}
