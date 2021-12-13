package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.model.User;

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
