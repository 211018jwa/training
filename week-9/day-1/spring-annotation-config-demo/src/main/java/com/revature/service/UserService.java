package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.model.User;

@Service
// @Service: typically used for any Spring bean in the service layer
// @Component: typically used for generic Spring beans
// @Repository: typically used for DAO layer Spring beans
// These 3 annotations used to register Spring beans effectively behave the same (with the exception of @Repository which does have
// some special functionality when utilizing @Transactional for transaction management using Spring)
public class UserService {
	
	private UserDao userDao;
	
	@Autowired // Constructor injection using @Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getAllUsers() {
		return this.userDao.getAllUsers();
	}
	
}
