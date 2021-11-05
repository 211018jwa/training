package com.revature.service;

import java.sql.SQLException;
import java.util.List;

import com.revature.dao.StudentDAO;
import com.revature.dto.AddOrUpdateStudentDTO;
import com.revature.exceptions.InvalidParameterException;
import com.revature.exceptions.StudentNotFoundException;
import com.revature.model.Student;

public class StudentService {
	
	private StudentDAO studentDao; // HAS-A relationship. StudentService HAS-A StudentDAO
	// In other words, StudentService depends on StudentDAO
	// StudentDAO is a dependency of StudentService
	
	// The word dependency has many meanings in programming and technology in general. 
	// 1. Maven dependency: an API of sorts that we are using inside of our own Maven project (Javalin, Postgres Driver, JUnit 5)
	// 2. Object dependencies (ex. a StudentService object depends on a StudentDAO object)
	
	// This constructor up here will create a real StudentDAO object for our StudentService object being constructed
	public StudentService() {
		this.studentDao = new StudentDAO();
	}
	
	// Create a new constructor for us to pass in a mock StudentDAO object
	public StudentService(StudentDAO studentDao) {
		this.studentDao = studentDao; 
	}
	
	/*
	 * This is our service layer logic for updating ONLY the firstName of a student
	 * 
	 * What this method does is first grab the Student with that particular student id from the database
	 * 	- If a student does not exist with that studentId, it will throw a StudentNotFoundException
	 * 	- Otherwise, it will go ahead and call the updateStudent method in the DAO layer and provide the appropriate arguments.
	 * 
	 * 
	 */
	public Student editFirstNameOfStudent(String studentId, String changedName) throws SQLException, StudentNotFoundException, InvalidParameterException {
		
		// Convert the String to an int
		try {
			int id = Integer.parseInt(studentId);
		
		
		
			// First, grab the information about the student with a student id of the value studentId
			Student studentToEdit = this.studentDao.getStudentById(id);
		
			// How does getStudentById work?
			// 1st scenario: If we have a studentId that indeed exists in the database, it will return us a Student object containing the information
			// 2nd scenario: If we have a studentId that does not have corresponding record in the database, it will return null
			// null = absence of an object
			if (studentToEdit == null) {
				throw new StudentNotFoundException("Student with an id of " + studentId + " was not found");
			}
		
			// This DTO will contain the first name that will be changed, while everything else stays the same as before
			AddOrUpdateStudentDTO dto = new AddOrUpdateStudentDTO(changedName, studentToEdit.getLastName(), studentToEdit.getClassification(), studentToEdit.getAge());
			// This DTO object contains the firstName, the lastName, the classification, and the age that we want to update the student to
			// Because we are only updating the firstName, that is the only change inside of the DTO. Everything else (lastName, classification, and age) are 
			// populated from the Student object we grabbed from the database (using getStudentById)
			
			Student updatedStudent = this.studentDao.updateStudent(id, dto);
			
			return updatedStudent;
		
		} catch(NumberFormatException e) {
			throw new InvalidParameterException("Id provided is not an int convertable value");
		}
	}
	
	// We know based on our logic, if getAllStudents from the DAO layer throws a SQLException, our service layer will also throw a SQLException
	// Because we are not catching it in this method
	// We are using throws SQLException in the method signature
	public List<Student> getAllStudents() throws SQLException {
		List<Student> students = this.studentDao.getAllStudents();
		
		return students;
	}
	
	
	
	public Student getStudentById(String studentId) throws SQLException, InvalidParameterException, StudentNotFoundException {
		// convert from a String to an int
		try {
			int id = Integer.parseInt(studentId);
			
			Student s = this.studentDao.getStudentById(id);
			
			if (s == null) {
				throw new StudentNotFoundException("Student with id of " + studentId + " was not found");
			}
			
			return s;
		} catch(NumberFormatException e) {
			throw new InvalidParameterException("Id provided is not an int convertable value");
		}
		
	}
	
	
}
