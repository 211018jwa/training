package com.revature.gradifysb.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	// @Before
	// @After
	// @AfterReturning
	// @AfterThrowing
	// @Around
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.revature.gradifysb.dao.*.*(..))")
	public void logDaoMethodsBefore(JoinPoint jp) {
		
		MethodSignature methodSignature = (MethodSignature) jp.getSignature();
		
		String methodName = methodSignature.getName();
		
		logger.info("DAO method " + methodName + " is about to be executed");
		
	}
	
	@AfterReturning(pointcut = "execution(* com.revature.gradifysb.dao.*.*(..))", returning = "returnedValue")
	public void logDaoMethodsAfterReturning(JoinPoint jp, Object returnedValue) {
		
		MethodSignature methodSignature = (MethodSignature) jp.getSignature();
		String methodName = methodSignature.getName();
		
		logger.info("DAO method " + methodName + " successfully returned " + returnedValue);
		
	}
	
}
