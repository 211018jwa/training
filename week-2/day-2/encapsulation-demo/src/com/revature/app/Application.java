package com.revature.app;

import java.util.ArrayList;

import com.revature.model.Person;
import com.revature.service.PersonService;

public class Application {

	public static void main(String[] args) {

		
		// Let's imagine we received some data from an HTML form
		// 	POST request was sent from a user to our server
		//  Our server received the request w/ some data
		//  We extract the data from the form (form data)
		
		// Imagine the following values are from this HTML form that was extracted inside of the controller layer of our application
		String firstName = "Bach"; // pretend it is coming from an HTML form
		String lastName = "Tran"; // pretend it is coming from an HTML form
		int age = 24; // pretend it is coming from an HTML form
		String phoneNumber = "512-826-2486"; // pretend it is coming from an HTML form
				
		// Use the Person Java Bean to package the above data into a single unit
		Person p1 = new Person();
		p1.setFirstName(firstName);
		p1.setLastName(lastName);
		p1.setAge(age);
		p1.setPhoneNumber(phoneNumber);
		
		// We can then pass around all of this data by simply passing a reference to this Person object anywhere in our application
		
		// Let's pass it on over to the service layer
		PersonService personService = new PersonService();
		personService.addPerson(p1);
		
		ArrayList<Person> people = personService.getAll();
		System.out.println(people);
		
		// Let's add a second Person
		Person p2 = new Person();
		p2.setFirstName("John");
		p2.setLastName("Doe");
		p2.setAge(100);
		p2.setPhoneNumber("342-234-3444");
		
		personService.addPerson(p2);
		
		System.out.println(personService.getAll());

	}

}
