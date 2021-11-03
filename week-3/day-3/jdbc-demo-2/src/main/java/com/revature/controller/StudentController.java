package com.revature.controller;

import com.revature.dto.EditFirstNameDTO;
import com.revature.service.StudentService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class StudentController {

	// The Controller layer will be directly communicating with the Service layer, and the Service layer will be communicating with the Data access layer
	// Our dependency here for our Controller
	private StudentService studentService; // StudentController instance HAS-A StudentService
	
	public StudentController() {
		this.studentService = new StudentService();
	}
	
	private Handler editStudentFirstName = (ctx) -> {
		
		// Extract the id from the URI path
		String studentId = ctx.pathParam("id");
		
		int id = Integer.parseInt(studentId);
		
		// Extract the information in the form of JSON from the body and place it into an object of the type EditFirstNameDTO
		EditFirstNameDTO dto = ctx.bodyAsClass(EditFirstNameDTO.class);
		
		this.studentService.editFirstNameOfStudent(id, dto.getFirstName());
	};
	
	
	
	
	public void registerEndpoints(Javalin app) {
		app.patch("/students/{id}/firstname", editStudentFirstName);
	}
	
}
