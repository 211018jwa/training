package com.revature.app;

import com.revature.model.Person;

public class Application {
	
	public static void main(String[] args) {
		System.out.println(Person.numOfInstances); // static scoped variables, as a refresher, do not need to be access from 
		// an instance (object) because they are not scoped to instances, they are scoped to the class itself.
		// We can access the numOfInstances variable from the Application class, because the variable is public.
		// public = anywhere inside of our project
		
		Person p1 = new Person("Billy", "Bob", 25, "512-000-0000");
		System.out.println(p1.firstName); // we can access firstName because it is public
		// System.out.println(p1.lastName); // we can't do this either even though lastName is protected and Application extends from Person
		// Because it is an instance variable. We would however be able to access lastName if we create an Application object
		
		// System.out.println(p1.age); // we cannot access age because it is default
		// System.out.println(p1.phoneNumber); // we cannot access phoneNumber because it is private
		
		System.out.println(p1.getPhoneNumber());
		
		p1.printPhoneNumber();
		
	}

}
