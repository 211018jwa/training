package com.revature.service;

import java.util.ArrayList;

import com.revature.dal.PersonDAO;
import com.revature.model.Person;

public class PersonService {
	
	private PersonDAO personDao;
	
	public PersonService() {
		this.personDao = new PersonDAO();
	}
	
	// The purpose of the service layer is to contain the business logic of our application
	// In this case, we will use it to first validate whether the information that was sent by the user is valid or not
	// We can then proceed to add this data to our database
	
	// Validate the data inside of the person object
	public void addPerson(Person person) {
		// Check #1: see if the age is positive
		if (person.getAge() < 0) {
			System.out.println("Error: we cannot add this person object to the database because the age is negative");
			return; // for a void method, immediately end the method right then and there
		}
		
		// Check #2: see if they have a valid phoneNumber entered or not (XXX-XXX-XXXX)
		// What we are going to do here is utilize a method from the String class that takes in what is known as a regular expression
		// pattern (regex)
		// If our String does not match that pattern, print out an error message
		if (!person.getPhoneNumber().matches("\\d{3}-\\d{3}-\\d{4}")) {
			System.out.println("Error: we cannot add this person object to the database because the phonenumber does not match xxx-xxx-xxxx");
			return;
		}
		
		// If they make it to this point, go ahead and add the Person to the database
		this.personDao.add(person);
		
	}
	
	public ArrayList<Person> getAll() {
		return this.personDao.getAll();
	}
	
}
