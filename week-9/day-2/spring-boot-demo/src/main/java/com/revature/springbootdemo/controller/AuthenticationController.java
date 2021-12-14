package com.revature.springbootdemo.controller;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springbootdemo.dto.LoginDTO;
import com.revature.springbootdemo.model.User;
import com.revature.springbootdemo.service.UserService;

@RestController
public class AuthenticationController {

	// Bean scopes in Spring:
	// Universal Scopes
	// 1. Singleton scope (single instance in the entire application)
	// 2. Prototype scope (creates a new instance every time something requests that type)
	// 
	// Web-aware Scopes
	// 1. Request scope
	// 2. Session scope
	
	// 3. application scope
	// 4. web socket scope
	
	// When we're dealing with logging in, what keeps track of the currently logged in user?
	// HttpSession object keeps track of it
	
	@Autowired
	private UserService us; // Singleton
	
	@Autowired
	private HttpServletRequest req; // Request scope
	
	@Autowired
	private HttpSession session; // Session scope
	
	@PostMapping(path = "/login")
	public ResponseEntity<Object> login(@RequestBody LoginDTO dto) {
		try {
			User user = us.getUserByUsernameAndPassword(dto.getUsername(), dto.getPassword());
			
//			HttpSession session = req.getSession();
			this.session.setAttribute("currentuser", user);
			
			return ResponseEntity.status(200).body(user);
		} catch (LoginException e) {
			return ResponseEntity.status(400).body(e.getMessage());
		}
	}
	
	@GetMapping(path = "/currentuser")
	public ResponseEntity<Object> getCurrentlyLoggedInUser() {
//		HttpSession session = req.getSession();
		
		User user = (User) this.session.getAttribute("currentuser");
		
		if (user == null) {
			return ResponseEntity.status(401).body("You are not currently logged in");
		}
		
		return ResponseEntity.status(200).body(user);
	}
	
}
