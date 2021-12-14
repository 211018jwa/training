package com.revature.springbootdemo.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springbootdemo.dao.UserDao;
import com.revature.springbootdemo.exception.UserNotFoundException;
import com.revature.springbootdemo.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao ud;

	public List<User> getAllUsers() {
		List<User> users = ud.getAllUsers(); // Detached at this point, because it is no longer scoped w/ a persistence
												// context
		// since there is no transaction currently ongoing

		return users;
	}

	// Business logic
	// 1. check if the User exists, and if they don't, throw a UserNotFoundException
	// 2. If the User does exist, proceed with deleting the user
	public void deleteUserById(int id) throws UserNotFoundException {
		User user = ud.getUserById(id);

		// Check if user that we want to delete actually exists or not
		if (user == null) {
			throw new UserNotFoundException("User with id " + id + " does not exist");
		}

		// User does exist, so go ahead and delete user
		ud.deleteUserById(id);

	}

	// Business Logic:
	// 1. Trim whitespace in the inputs
	public User addNewUser(User u) {
		u.setFirstName(u.getFirstName().trim());
		u.setLastName(u.getLastName().trim());
		u.setUsername(u.getUsername().trim());
		u.setPassword(u.getPassword().trim());

		User newlyAddedUser = ud.addUser(u); // newlyAddedUser is what object state? Detached

		// IF you make any changes to the object here, because it is detached and not
		// persistent, it will not change on the database

		return newlyAddedUser;
	}

	// Attempt to grab a user with a certain username and password
	// If User is null,
	// then throw LoginException("Failed to login, please check username and/or
	// password");
	public User getUserByUsernameAndPassword(String username, String password) throws LoginException {
		User user = ud.getUserByUsernameAndPassword(username, password);
		
		if (user == null) {
			throw new LoginException("Failed to login, please check username and/or password");
		}
		
		return user;
	}

}
