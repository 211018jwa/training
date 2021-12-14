package com.revature.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springbootdemo.exception.UserNotFoundException;
import com.revature.springbootdemo.model.User;
import com.revature.springbootdemo.service.UserService;

@RestController
public class UserController {
	
	// 3 types of injection
	// 1. field
	// 2. constructor
	// 3. setter
	@Autowired // field injection utilizes something known as the Java Reflection API
	// Reflection is an advanced topic in Java that allows for a program to "inspect" itself
	// In fact, Spring framework heavily makes use of Java Reflection in order to have the annotations
	// do different tasks
	private UserService us;
	
	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return us.getAllUsers();
	}
	
	@DeleteMapping(path = "/users/{id}")
	public Object deleteUserById(@PathVariable("id") int id) {
		try {
			us.deleteUserById(id);
			
			return "Successfully deleted User with id " + id;
		} catch (UserNotFoundException e) {
			return e.getMessage();
		}
	}
	
	@PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addNewUser(@RequestBody User userToAdd) {
		
		User u = us.addNewUser(userToAdd);
		
		return ResponseEntity.status(201).body(u); // Return the newly created object to the client as JSON
		// and also have a status code of 201
	}
}
