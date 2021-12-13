package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.model.User;

public class FakeUserDao implements UserDao {

	private List<User> fakeUsers;
	
	public FakeUserDao() {
		List<User> users = new ArrayList<>();
		
		users.add(new User(1, "bach_tran", "password12345"));
		users.add(new User(2, "jane_doe", "pass123"));
		users.add(new User(3, "test", "testing123"));
		
		this.fakeUsers = users;
	}
	
	public List<User> getAllUsers() {
		return this.fakeUsers;
	}
	
}
