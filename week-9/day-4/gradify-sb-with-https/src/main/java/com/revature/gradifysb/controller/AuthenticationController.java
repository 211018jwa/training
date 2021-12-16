package com.revature.gradifysb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.gradifysb.dto.LoginDTO;
import com.revature.gradifysb.exception.InvalidLoginException;
import com.revature.gradifysb.model.User;
import com.revature.gradifysb.service.UserService;

@RestController // @Controller as well
// What does @RestController add beyond what we have with @Controller?
// @ResponseBody
@CrossOrigin(originPatterns = "*", allowCredentials = "true")
public class AuthenticationController {

	@Autowired
	private UserService us;
	
	@Autowired
	private HttpServletRequest req; // Request scoped bean
	
	@Autowired
	private HttpServletResponse res;
	
	private static final String CURRENTUSER = "currentuser"; // constants have all capitalized letters by convention
	
	@PostMapping(path = "/login")
	public ResponseEntity<Object> login(@RequestBody LoginDTO dto) {
		
		try {
			User user = this.us.login(dto.getUsername(), dto.getPassword());
			
			HttpSession session = req.getSession();
			session.setAttribute(CURRENTUSER, user);
			
			/*
			 * SameSite=None requires Https to be enabled for the backend
			 */
			String originalSetCookieHeader = res.getHeader("Set-Cookie");
			String newCookieHeader = originalSetCookieHeader + "; SameSite=None; Secure";
			res.setHeader("Set-Cookie", newCookieHeader);
			
			return ResponseEntity.status(200).body(user);
			
		} catch (InvalidLoginException e) {
			
			return ResponseEntity.status(400).body(e.getMessage());
			
		}
		
	}
	
	@GetMapping(path = "/loginstatus")
	public ResponseEntity<Object> loginStatus() {
		User currentlyLoggedInUser = (User) req.getSession().getAttribute(CURRENTUSER);
		
		if (currentlyLoggedInUser != null) {
			return ResponseEntity.status(200).body(currentlyLoggedInUser);
		}
		
		// currentlyLoggedInUser is null
		return ResponseEntity.status(401).body("Not logged in");
	}
	
	@PostMapping(path = "/logout")
	public ResponseEntity<String> logout() {
		req.getSession().invalidate(); // Invalidate the session (logging out)
		
		return ResponseEntity.status(200).body("Successfully logged out");
	}
	
}
