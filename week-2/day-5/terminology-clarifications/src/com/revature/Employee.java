package com.revature;

// A blueprint for Employee objects (instances)
public class Employee {

	/*
	 * Instance related properties and behaviors + constructor
	 */
	
	// Properties of Employee objects
	// non-static fields
	public int age; // primitive field
	public String name; // reference field
	public int salary; // primitive field
	
	// Constructors are scoped to the instance being created
	// Therefore, it has direct access to the instance variables
	public Employee(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	// Behaviors of Employee objects
	// non-static methods
	public void changeSalaryAndName(int s, String name) {
		changeSalary(s); // instance methods can call other instance methods
		changeName(name);
	}
	
	public void changeSalary(int s) {
		salary = s;
	}
	
	public void changeName(String n) {
		name = n;
	}
	
	
	
	// Main method (entry point into our Java application)
	// Is static
	public static void main(String[] args) {
		Employee.changeCeo("Ashwin");
		
		System.out.println(Employee.ceoName); // Employee.ceoName (static variable)
		
		// You need to create an instance to actually invoke instance methods or access instance variables
		// BECAUSE these methods and variables belong to individual objects created from the blueprint
		Employee e1 = new Employee(50, "John", 75000);
		Employee e2 = new Employee(45, "Quinn", 60000);
		Employee e3 = new Employee(40, "Jim", 65000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		// We have 3 instances, each instance has its own instance variables:
		// 	1. age
		//  2. name
		//  3. salary
		
		// We can invoke the behaviors (instance methods) of each instance to do anything we want with those instance's instance variables
		e1.changeSalary(100000); // salary went from 75000 to 100000 for e1
		e2.changeSalary(50000); // salary went from 60000 to 50000 for e2
		e3.changeSalaryAndName(80000, "Jymm"); // salary went from 65000 to 80000 and name changed from "Jim" to "Jymm" for e3
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		// Change the CEO
		Employee.ceoName = "Bob";
		
		// It is possible to access static variables from the instances
		System.out.println(e1.ceoName); // Bob
		System.out.println(e2.ceoName); // Bob
		System.out.println(e3.ceoName); // Bob
		
		Employee.changeCeo("Bill");
		
		System.out.println(e1.ceoName); // Bill
		System.out.println(e2.ceoName); // Bill
		System.out.println(e3.ceoName); // Bill
		
		// Trick question
		e1.ceoName = "Jane"; // ceoName is not an instance variable, so there are not 3 copies of ceoName for each of our 3 instances
		// ceoName is a static variable, so it belongs to the Employee class
		// So, although we can access the static variables and static methods from our individual instances, the changes will be made to the 
		// class itself and therefore is reflected in all of our instances
		
		System.out.println(e1.ceoName); // Jane
		System.out.println(e2.ceoName); // Jane
		System.out.println(e3.ceoName); // Jane
	}
	
	
	
	
	
	/*
	 * Static (class) related properties and behaviors
	 */
	
	// Properties of the Employee class
	// static fields
	public static String ceoName;
	
	// Behaviors of the Employee class
	// static methods
	public static void changeCeo(String name) {
		Employee.ceoName = name;
	}

	
	
	/*
	 * Object class methods to override: toString(), hashCode(), equals()
	 */
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
