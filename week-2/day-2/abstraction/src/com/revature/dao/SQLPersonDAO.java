package com.revature.dao;

import com.revature.model.Person;

// The purpose of this DAO is to store/retrieve data about people from a SQL database
public class SQLPersonDAO implements PersonDAO { // implements is used to inherit from an interface v. extends for a class

	@Override
	public void add(Person p) {
		System.out.println("Adding person to SQL database");
		// ... put database related code here
	} 

}
