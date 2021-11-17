
DROP TABLE IF EXISTS grades;
DROP TABLE IF EXISTS students;

-- Creating a Table called students
CREATE TABLE students (
	-- This is a comment
	-- When creating a table, we need to specify the columns that we want
	-- The format is <column_name> <data type> <constraints>
	student_id SERIAL PRIMARY KEY, -- SERIAL: defines an INTEGER type that increments automatically on its own
	student_first_name VARCHAR(255) NOT NULL,
	student_last_name VARCHAR(255) NOT NULL,
	student_classification VARCHAR(20) NOT NULL,
	student_age INTEGER NOT NULL
);

-- Inserting two rows into the students table
INSERT INTO students 
	(student_first_name, student_last_name, student_classification, student_age)
VALUES 
	('John', 'Doe', 'Freshman', 18),
	('Jane', 'Doe', 'Senior', 22);
	

-- Grades table
CREATE TABLE grades (
	grade_id SERIAL PRIMARY KEY,
	grade INTEGER NOT NULL,
	assignment_name VARCHAR(100) NOT NULL,
	student_id INTEGER NOT NULL,
	
	CONSTRAINT fk_student FOREIGN KEY(student_id)
		REFERENCES students(student_id) ON DELETE CASCADE
);

INSERT INTO grades (grade, assignment_name, student_id)
VALUES 
(85, 'homework 1.1', 1),
(90, 'homework 1.1', 2),
(93, 'homework 1.2', 1),
(92, 'homework 1.2', 2);


SELECT * 
FROM students;

SELECT *
FROM grades;