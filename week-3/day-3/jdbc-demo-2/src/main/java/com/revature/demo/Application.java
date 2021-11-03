package com.revature.demo;

import com.revature.controller.StudentController;

import io.javalin.Javalin;

public class Application {

	public static void main(String[] args) {
				
		Javalin app = Javalin.create();
		
		StudentController controller = new StudentController();
		
		controller.registerEndpoints(app);
		
		app.start();
		
	}

}
