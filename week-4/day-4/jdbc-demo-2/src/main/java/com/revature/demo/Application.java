package com.revature.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.controller.ExceptionMappingController;
import com.revature.controller.GradeController;
import com.revature.controller.StudentController;

import io.javalin.Javalin;

public class Application {

	public static void main(String[] args) {
				
		Javalin app = Javalin.create();
		
		Logger logger = LoggerFactory.getLogger(Application.class);
		
		app.before(ctx -> {
			logger.info(ctx.method() + " request received to the " + ctx.path() + " endpoint");
		});
		
		StudentController controller = new StudentController();
		controller.registerEndpoints(app);
		
		ExceptionMappingController exceptionController = new ExceptionMappingController();
		exceptionController.mapExceptions(app);
		
		GradeController gradeController = new GradeController();
		gradeController.registerEndpoints(app);
				
		app.start();
		
	}

}
