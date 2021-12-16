package com.revature.gradifysb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.revature.gradifysb.dao.UserDao;
import com.revature.gradifysb.exception.InvalidLoginException;
import com.revature.gradifysb.model.User;

// @Component (can use this one as well, both annotations do essentially the same thing)
@Service
public class UserService {

	// What does UserService depend on?
	@Autowired // field injection (we also have constructor and setter injection)
	private UserDao ud;
	
	
	// This method should either return the User object corresponding to a particular username and password
	// OR it should throw InvalidLoginException
	public User login(String username, String password) throws InvalidLoginException {
		
		try {
			User user = this.ud.getUserByUsernameAndPassword(username, password);
			
			return user;
		} catch(DataAccessException e) {
			throw new InvalidLoginException("Username and/or password is incorrect");
		}
		
	}
	
}
