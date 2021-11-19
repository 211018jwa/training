package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ArithmeticController {

	private ArithmeticService arithmeticService;
	
	private Handler add = (ctx) -> {
		String num1 = ctx.formParam("number1");
		String num2 = ctx.formParam("number2");
		
		String sum = this.arithmeticService.add(num1, num2);
		
		ctx.result(sum);
	};
	
	private Handler subtract = (ctx) -> {
		String num1 = ctx.formParam("number1");
		String num2 = ctx.formParam("number2");
		
		String difference = this.arithmeticService.subtract(num1, num2);
		
		ctx.result(difference);
	};

	private Handler multiply = (ctx) -> {
		String num1 = ctx.formParam("number1");
		String num2 = ctx.formParam("number2");
		
		String product = this.arithmeticService.multiply(num1, num2);
		
		ctx.result(product);
	};
	
	private Handler divide = (ctx) -> {
		String num1 = ctx.formParam("number1");
		String num2 = ctx.formParam("number2");
		
		String quotient = this.arithmeticService.divide(num1, num2);
		
		ctx.result(quotient);
	};
	
	// Constructor
	public ArithmeticController() {
		this.arithmeticService = new ArithmeticService();
	}
	
	public void mapEndpoints(Javalin app) {
		app.post("/add", add);
		app.post("/subtract", subtract);
		app.post("/multiply", multiply);
		app.post("/divide", divide);
	}
	
}
