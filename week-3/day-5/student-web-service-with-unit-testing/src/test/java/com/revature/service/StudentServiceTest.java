package com.revature.service;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.dao.StudentDAO;
import com.revature.exceptions.InvalidParameterException;
import com.revature.exceptions.StudentNotFoundException;
import com.revature.model.Student;

public class StudentServiceTest {

	// Define the System under test (SUT): StudentService
	private StudentService sut;

	
	/*
	 * StudentService's getAllStudents() tests
	 */
	
	// Positive test (happy path)
	@Test
	public void testGetAllStudentsPositive() throws SQLException {
		
		/*
		 * AAA
		 * 
		 * A - Arrange
		 * A - Act
		 * A - Assert
		 */
		
		
		/*
		 * ARRANGE
		 */
		
		// StudentService requires a StudentDAO object to function properly
		// So, let's go ahead and mock a StudentDAO object
		StudentDAO mockStudentDao = mock(StudentDAO.class); // this is a fake object, because we're not using "new <constructor>())", we are using mock from Mockito
		// That creates a fake object that we can specify scenarios for, whenever we call that object's instance methods
		
		Student student1 = new Student(10, "Bob", "Jones", "Senior", 22);
		Student student2 = new Student(100, "John", "Doe", "Freshman", 18);
		Student student3 = new Student(15, "Jane", "Doe", "Sophmore", 19);
		
		List<Student> studentsFromDao = new ArrayList<>();
		studentsFromDao.add(student1);
		studentsFromDao.add(student2);
		studentsFromDao.add(student3);
		
		when(mockStudentDao.getAllStudents()).thenReturn(studentsFromDao);
		
		StudentService studentService = new StudentService(mockStudentDao);
		
		/*
		 * ACT
		 */
		List<Student> actual = studentService.getAllStudents();
		
		/*
		 * ASSERT
		 */
		List<Student> expected = new ArrayList<>();
		expected.add(new Student(10, "Bob", "Jones", "Senior", 22));
		expected.add(new Student(100, "John", "Doe", "Freshman", 18));
		expected.add(new Student(15, "Jane", "Doe", "Sophmore", 19));
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	// Negative Test
	@Test
	public void testGetAllStudentsSQLExceptionOccursNegative() throws SQLException {
		/*
		 * ARRANGE
		 */
		StudentDAO mockStudentDao = mock(StudentDAO.class);
		
		when(mockStudentDao.getAllStudents()).thenThrow(SQLException.class);
		
		StudentService studentService = new StudentService(mockStudentDao);
		
		/*
		 * ACT AND ASSERT
		 */
		
		// Our test will pass, if the code inside the second argument's lambda expression throws a SQLException
		// If no exception occurs, then the test will fail
		Assertions.assertThrows(SQLException.class, () -> {
			
			studentService.getAllStudents(); // we actually want for SQLException to emanate from our studentService getAllStudents
			
		});
		
	}
	
	/*
	 * StudentService's getStudentById(int id)
	 */
	
	// Positive test (happy path)
	@Test
	public void testGetStudentByIdPositive() throws SQLException, InvalidParameterException, StudentNotFoundException {
		/*
		 * ARRANGE
		 */
		StudentDAO mockStudentDao = mock(StudentDAO.class);
		
		when(mockStudentDao.getStudentById(eq(5))).thenReturn(new Student(5, "Bach", "Tran", "Senior", 22));
		
		StudentService studentService = new StudentService(mockStudentDao);
		
		/*
		 * ACT
		 */
		Student actual = studentService.getStudentById("5");
		
		/*
		 * ASSERT
		 */
		
		Assertions.assertEquals(new Student(5, "Bach", "Tran", "Senior", 22), actual);
	}
	
	// Negative Test
	// StudentNotFoundException is thrown
	@Test
	public void testGetStudentByIdNotFoundNegative() throws SQLException, InvalidParameterException, StudentNotFoundException {
		/*
		 * ARRANGE
		 */
		StudentDAO mockStudentDao = mock(StudentDAO.class);
		
		// By default, any object returned from one of the methods called from the mock student dao will return null
		// So here we are not specifying any when(...).thenReturn(...);
		
		StudentService studentService = new StudentService(mockStudentDao);
		
		/*
		 * ACT AND ASSERT
		 */
		
		Assertions.assertThrows(StudentNotFoundException.class, () -> {
			studentService.getStudentById("1"); // ACT
		});
		
		
	}
	
	// Negative Test
	// InvalidParameterException is thrown
	@Test
	public void testGetStudentByIdAlphabeticalIdNegative() {
		/*
		 * ARRANGE
		 */
		StudentDAO mockStudentDao = mock(StudentDAO.class);
		
		// By default, any object returned from one of the methods called from the mock student dao will return null
		// So here we are not specifying any when(...).thenReturn(...);
		
		StudentService studentService = new StudentService(mockStudentDao);
		
		/*
		 * ACT AND ASSERT
		 */
		
		Assertions.assertThrows(InvalidParameterException.class, () -> {
			studentService.getStudentById("abc"); // ACT
		});
	}
	
	// Negative Test
	// InvalidParameterException is thrown
	@Test
	public void testGetStudentByIdDecimalIdNegative() {
		/*
		 * ARRANGE
		 */
		StudentDAO mockStudentDao = mock(StudentDAO.class);
		
		// By default, any object returned from one of the methods called from the mock student dao will return null
		// So here we are not specifying any when(...).thenReturn(...);
		
		StudentService studentService = new StudentService(mockStudentDao);
		
		/*
		 * ACT AND ASSERT
		 */
		
		Assertions.assertThrows(InvalidParameterException.class, () -> {
			studentService.getStudentById("1.0"); // ACT
		});
	}
}
