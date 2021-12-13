package com.revature.service;

import java.util.List;

import com.revature.dao.UserDao;
import com.revature.model.User;

public class UserService {

	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getAllUsers() {
		return this.userDao.getAllUsers();
	}
	
}
