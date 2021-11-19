package com.revature.app;

import com.revature.controller.ArithmeticController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Application {
	
	public static void main(String[] args) {
		Javalin app = Javalin.create((config) -> {
			config.enableCorsForAllOrigins();
			
			config.addStaticFiles("static", Location.CLASSPATH);
		});
		
		ArithmeticController arithmeticController = new ArithmeticController();
		arithmeticController.mapEndpoints(app);
		
		app.start(8081);
	}

}
