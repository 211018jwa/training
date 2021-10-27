package com.revature.dao;

import com.revature.model.Person;

// The purpose of this DAO is to store/retrieve Person objects into an ArrayList that is contained as a property of one of these ArrayListPersonDAO objects
public class ArrayListPersonDAO implements PersonDAO {

	@Override
	public void add(Person p) {
		System.out.println("Adding Person to ArrayList");
		// put code here
	}

}
