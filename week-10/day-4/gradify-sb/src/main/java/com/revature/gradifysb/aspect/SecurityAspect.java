package com.revature.gradifysb.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.revature.gradifysb.model.User;

@Aspect
// Need to register as Spring Bean
@Component
public class SecurityAspect {

	@Autowired
	private HttpServletRequest req;
	
	/*
	 * Definitions:
	 * 
	 * 1. Aspect: the class that contains the advice
	 * 2. Advice: the individual methods inside of the aspect class
	 * 3. PointCut: an expression that matches to a particular JoinPoint
	 * 4. JoinPoint: the actual method in our application that is the target of interest
	 */
	
	// This is where advice goes
//	@Around
//	public void protectEndpointTrainerAndAssociateOnly() {
//		
//	}
	
	@Around("@annotation(com.revature.gradifysb.annotation.Associate)")
	public Object protectEndpointAssociateOnly(ProceedingJoinPoint pjp) throws Throwable {
		
		/*
		 * Before
		 */
		HttpSession session = req.getSession();
		
		User currentlyLoggedInUser = (User) session.getAttribute("currentuser");
		
		if (currentlyLoggedInUser == null) {
			return ResponseEntity.status(401).body("You are not logged in");
		}
		
		if (!currentlyLoggedInUser.getRole().getRole().equals("associate")) {
			return ResponseEntity.status(401).body("You are logged in, but only associates are allowed to access this endpoint");
		}
		
		/*
		 * Execution of JoinPoint
		 */
		// So if we make it past the security checks, actually go ahead and execute the endpoint method
		Object returnValue = pjp.proceed(); // This is the actual endpoint method
		
		/*
		 * After
		 */
		
		return returnValue;
		
	}
	
	@Around("@annotation(com.revature.gradifysb.annotation.Trainer)")
	public Object protectEndpointTrainersOnly(ProceedingJoinPoint pjp) throws Throwable {
		
		/*
		 * Before
		 */
		HttpSession session = req.getSession();
		
		User currentlyLoggedInUser = (User) session.getAttribute("currentuser");
		
		if (currentlyLoggedInUser == null) {
			return ResponseEntity.status(401).body("You are not logged in");
		}
		
		if (!currentlyLoggedInUser.getRole().getRole().equals("trainer")) {
			return ResponseEntity.status(401).body("You are logged in, but only trainers are allowed to access this endpoint");
		}
		
		/*
		 * Execution of JointPoint
		 */
		// So if we make it past the security checks, actually go ahead and execute the endpoint method
		Object returnValue = pjp.proceed(); // This is the actual endpoint method
		
		/*
		 * After
		 */
		
		return returnValue;
	}
}
