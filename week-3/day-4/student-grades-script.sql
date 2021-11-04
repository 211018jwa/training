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
	


-- grades table
DROP TABLE IF EXISTS grades;

CREATE TABLE grades (
	grade_id SERIAL PRIMARY KEY,
	grade INTEGER NOT NULL,
	assignment_name VARCHAR(100) NOT NULL,
	student_id INTEGER NOT NULL,
	
	CONSTRAINT fk_student FOREIGN KEY(student_id)
		REFERENCES students(student_id)
);

INSERT INTO grades (grade, assignment_name, student_id)
VALUES 
(85, 'homework 1.1', 1),
(90, 'homework 1.1', 2),
(93, 'homework 1.2', 1),
(92, 'homework 1.2', 2);


SELECT *
FROM grades

/*
 * Referential Integrity:
 * 
 * Whenever we create relationships between tables, such as by having a foreign key in one table link to a primary key in another table, 
 * SQL ensures that orphan records can never occur. SQL preserves this idea of having integrity with respect to references
 */

DROP TABLE students;
-- I cannot drop the students table, because the grades table has a foreign key that references a primary key in the students table
-- so, grades is dependent on students
-- If I wanted to drop the students table, I would need to drop the grades table first, and then drop the students table 


DELETE FROM grades 
WHERE student_id = 1;

DELETE FROM students 
WHERE student_id = 1;
-- I cannot delete student 1, because there are two grades that belong to student 1
-- I would need to delete the grades that belong to student 1, before I can delete student 1


/*
 * ACID properties: this is an acronym for the properties of transactions
 * 
 * Atomicity: The transaction entirely succeeds or not at all
 * Consistency: Constraints and referential integrity must be upheld by a transaction. A transaction cannot violate the constraints
 * Isolation: Two transactions should not be interfering with each other as they are happening in a concurrent situation
 * Durability: Once a transaction has been committed, those changes are permanently stored in the database's storage memory instead of RAM
 * 
 * Transaction: a grouping of DML statements that we would like to treat as a single operation
 * - Transactions are either
 * 	1. committed using the COMMIT statement
 * 	2. rolled back using the ROLLBACK statement
 * 
 * However, by default, we don't need to do this whenever we work with DML statements
 * 	BECAUSE AUTOCOMMIT is turned on by default
 * 
 * So, to demonstrate transactions in more detail, we will turn off autocommit
 * 
 * We can do this using the setting in DBeaver
 */

SELECT *
FROM students 

SELECT * 
FROM grades 

-- DML Operations: INSERT, SELECT, UPDATE, DELETE 
-- However, we don't really need to commit or rollback SELECT, because SELECT doesn't really make any changes to our database

DELETE FROM grades
WHERE grade_id = 3;

ROLLBACK; -- Can only be used before you commit a transaction's changes. Rollback will go back to the state before the transaction began


DELETE FROM grades 
WHERE grade_id = 6;

INSERT INTO grades (grade, assignment_name, student_id) 
VALUES (100, 'Midterm 1', 1);

COMMIT; -- Once you run the COMMIT command, changes made in a particular transaction will become permanent

/*
 * Scalar and Aggregate functions
 * 
 * Scalar function: a function that acts on individual rows of data
 * Aggregate function: a function that acts on many rows of data and gives a single value as output
 */

-- LENGTH is a scalar function
SELECT student_first_name, LENGTH(student_first_name), student_last_name, LENGTH(student_last_name)
FROM students;

-- AVG is an aggregate function
SELECT AVG(student_age)
FROM students;

SELECT *
FROM grades;

INSERT INTO grades (grade, assignment_name, student_id)
VALUES 
(70, 'Homework 1.2', 1),
(75, 'Homework 1.2', 2),
(70, 'Midterm 2', 1),
(80, 'Midterm 2', 2);

-- This will average together all of the grade values from the grades table
-- But, because we have homework 1.1 and Midterm 1, it probably doesn't make too much to sense to average these two different
-- types of assignments together
SELECT AVG(grade)
FROM grades;

-- What instead?
SELECT assignment_name, AVG(grade)
FROM grades
GROUP BY assignment_name; -- GROUP BY will create different groups based on that column having the same value 
-- So, we have Group 1: homework 1.1
-- And Group 2: Midterm 1
-- It will find the average within those individual groups instead of finding the entire average


-- Let's say we only wanted to display the assignments where the average grade is greater than 80
SELECT assignment_name, AVG(grade)
FROM grades 
GROUP BY assignment_name
HAVING AVG(grade) > 80;



-- WHERE v. HAVING
-- WHERE: filters out individual rows of data based on a condition not being met 
-- 		ex. WHERE grades > 90: filters out everything 90 or less
-- HAVING: filter out the conditions when we have already grouped together data 

-- For WHERE, compare
SELECT *
FROM grades;

-- And

SELECT *
FROM grades
WHERE grade > 80;

-- =================================

-- For HAVING, compare
SELECT assignment_name, AVG(grade)
FROM grades 
GROUP BY assignment_name;

-- vs

SELECT assignment_name, AVG(grade)
FROM grades 
GROUP BY assignment_name
HAVING AVG(grade) > 80;

/*
 * Joins
 * 1. INNER JOIN
 * 2. OUTER JOIN
 * 3. LEFT JOIN
 * 4. RIGHT JOIN
 */

SELECT *
FROM students s
INNER JOIN grades g
ON s.student_id = g.student_id;

SELECT s.student_id AS sid, s.student_first_name AS first_name, s.student_last_name AS last_name, g.assignment_name AS assignment, g.grade
FROM students s
INNER JOIN grades g
ON s.student_id = g.student_id;

SELECT s.student_first_name, g.assignment_name, AVG(grade)
FROM students s
INNER JOIN grades g
ON s.student_id = g.student_id
GROUP BY s.student_first_name, g.assignment_name;

/*
 * SQL SELECT command clauses
 * 
 * there are many optional clauses that can be used with a SELECT statement
 * 
 * They MUST go in this order:
 * 	- SELECT
 * 	- FROM
 * 	- ( ) JOIN ... ON .... = .....
 * 	- WHERE
 * 	- GROUP BY
 * 	- HAVING
 * 	- ORDER BY
 */

SELECT *
FROM grades 
ORDER BY grade; -- ORDER BY is ascending by default 

SELECT *
FROM grades 
ORDER BY grade DESC;




-- Querying all columns from the students table
SELECT *
FROM students;

-- Query specific columns
-- student_id, student_first_name, student_last_name
SELECT student_id, student_first_name, student_last_name
FROM students;

-- Querying a specific student by their id 
SELECT *
FROM students 
WHERE student_id = 1;


-- Data Manipulation language (INSERT, SELECT, UPDATE, DELETE)

UPDATE students 
	SET student_first_name = 'Megan',
		student_last_name = 'Do',
		student_classification = 'Sophmore',
		student_age = 19
WHERE 
	student_id = 5;


