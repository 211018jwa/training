package com.revature.dal;

import java.util.ArrayList;

import com.revature.model.Person;

// This class is a blueprint for a Data Access Object
// The purpose of a DAO within the data access layer is to perform actions on some database
// Ex. adding, deleting, retrieving, or updating data that exists on a database
// Right now, we don't have enough knowledge to interface with a real database (such as a SQL database)
// So, in place of an actual database, we will just create an ArrayList inside of this DAO that will store our Person objects
// We will cover about the Collection API (which contains ArrayList) tomorrow
public class PersonDAO {
	
	private ArrayList<Person> people; // An ArrayList is similar to an Array, except you can add as many elements as you want. There is no size limit
	
	// Constructor
	public PersonDAO() {
		this.people = new ArrayList<>(); // An ArrayList is an object, so whenever we construct this PersonDAO object, we should also instantiate 
		// the ArrayList
	}
	
	public void add(Person per) {
		this.people.add(per); // Lists have an add method that can be used to add elements to it.
	}
	
	public ArrayList<Person> getAll() {
		return this.people;
	}

}
