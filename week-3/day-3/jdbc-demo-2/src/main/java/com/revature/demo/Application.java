package com.revature.demo;

import java.sql.SQLException;
import java.util.List;

import com.revature.dao.StudentDAO;
import com.revature.model.Student;

public class Application {

	public static void main(String[] args) {
		
		StudentDAO studentDao = new StudentDAO();
		
		try {
//			List<Student> results = studentDao.getAllStudents();
//			
//			System.out.println(results);
			
//			Student s = studentDao.getStudentById(1);
//			System.out.println(s);
			
			Student studentToBeAdded = new Student(0, "Andrew", "Doe", "Junior", 21);
			
			
			Student insertedRecord = studentDao.addStudent(studentToBeAdded);
			System.out.println(insertedRecord);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
