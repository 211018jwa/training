package com.revature.gradifysb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.gradifysb.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

	// This is just an abstract method with no implementation
	// Normally, you need to define a class that will implement the interface and all of its abstract methods
	// However, Spring Data, using certain naming conventions for the method names, will be able to automatically
	// provide implementations for us
	public User findByUsernameAndPassword(String username, String password);
	
}
