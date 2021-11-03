# Week 3 Recap

## Day 1
* Using custom exception (MissingNumberInputException) with calculator app
    - [Exception being thrown example](https://github.com/211018jwa/training/blob/main/week-3/day-1/my-calculator-app-using-exceptions/src/main/java/com/revature/service/ArithmeticService.java#L14-L32)
    - [Handling the Exception](https://github.com/211018jwa/training/blob/main/week-3/day-1/my-calculator-app-using-exceptions/src/main/java/com/revature/controller/ArithmeticController.java#L30-L34)
* Exception notes
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-1/ExceptionDemo/src/com/revature/app/Application.java#L31-L76)
* Creating a Custom Checked Exception
    - [example](https://github.com/211018jwa/training/blob/main/week-3/day-1/ExceptionDemo/src/com/revature/exceptions/DivideByZeroException.java#L3-L26)
    - [using the custom exception](https://github.com/211018jwa/training/blob/main/week-3/day-1/ExceptionDemo/src/com/revature/app/CheckedDemo.java#L81-L92)
* Handling exceptions
    - try-catch
    - multiple catch blocks
    - try-catch-finally
    - try-(multiple catch)-finally
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-1/ExceptionDemo/src/com/revature/app/CheckedDemo.java#L55-L76)
    - [multiple catch example](https://github.com/211018jwa/training/blob/main/week-3/day-1/ExceptionDemo/src/com/revature/app/CheckedDemo.java#L9-L53)
    - [unchecked example (Java's built in ArithmeticException)](https://github.com/211018jwa/training/blob/main/week-3/day-1/ExceptionDemo/src/com/revature/app/UncheckedDemo.java#L7-L22)
* DBeaver and Postgres Setup
* Basic SQL script
    - Creating a table
    - Inserting data into the table
    - Querying data from the table
    - [script](https://github.com/211018jwa/training/blob/main/week-3/day-1/student-script.sql#L1-L33)
* JDBC basic demo
    - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-1/jdbc-demo-1/src/main/java/com/revature/demo/Application.java)

## Day 2
* SQL Notes
    - Structured Query Language
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#sql-structured-query-language)
    - Relational Database Management System (RDBMS)
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#relational-database-management-system-rdbms)
    - Common datatypes
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#common-datatypes)
    - Schema
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#schema)
    - SQL Sublanguages
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#sql-sublanguages)
    - Constraints
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#constraints)
    - Composite Keys
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#composite-keys)
    - Database Normalization
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#database-normalization)
    - Multiplicity / Cardinality
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/sql-notes.md#multiplicity--cardinality)
* SERIAL datatype
    - Auto-incrementing INTEGER type
    - [example](https://github.com/211018jwa/training/blob/main/week-3/day-2/student-script.sql#L8)
* Creating a Utility class for obtaining a Connection object
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/jdbc-demo-2/src/main/java/com/revature/util/JDBCUtility.java#L15-L21)
    - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-2/jdbc-demo-2/src/main/java/com/revature/util/JDBCUtility.java#L9-L35)
* Three-layered architecture
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-2/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L13-L21)
* DAO methods (getAllStudents and getStudentById)
    - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-2/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L43-L107)

## Day 3
* Data Transfer Object (DTO)
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dto/AddOrUpdateStudentDTO.java#L5-L15)
    - [example](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dto/AddOrUpdateStudentDTO.java#L17-L94)
* Add Student functionality in StudentDAO
    - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L35-L72)
        - INSERT Syntax
            - [lines](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L43-L44)
        - prepareStatement configuration to return generated primary key
            - [line of code](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L46)
        - throwing a SQLException if inserted records is 0
            - [lines of code](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L53-L59)
        - getting the generated key and returning an object representing the record created in the SQL database
            - [lines of code](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L61-L69)
* Update Student
    - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L140-L170)
        - UPDATE Syntax
            - [lines](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L145-L151)
* Delete Student
    - By Id
        - [example](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L179-L195)
    - All
        - [example](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dao/StudentDAO.java#L197-L211)
* Object dependencies
    - [example](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/service/StudentService.java#L12-L22)
        - "StudentService objects depend on having a StudentDAO object"
* StudentService
    - Edit First Name of Student
        - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/service/StudentService.java#L24-L55)
* StudentController
    - Edit First Name of Student
        - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/controller/StudentController.java#L19-L30)
        - Extract information from HTTP patch request
            - [screenshot of POSTMAN](https://github.com/211018jwa/training/tree/main/week-3/day-3/patch-request-firstname.png)
            - path variable (id)
            - JSON -> object (EditFirstNameDTO)
        - EditFirstNameDTO
            - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dto/EditFirstNameDTO.java)
        

# Questions
* What is an exception?
* Are exceptions inherently bad? Why do we use them in applications?
* How can we relate throwing and handling exceptions to what should happen in our application when a user does something incorrectly? (ex. not using all inputs for the calculator app?)
* How do you handle exceptions?
* What does "declaring" an exception mean? How is that different than handling (catching) an exception?
* What is the difference between a checked and unchecked exception?
* How do we create a custom checked exception?
* How do we create a custom unchecked exception?
* If we have multiple catch blocks, should more specific exceptions come first or last?
* What is the purpose of DBeaver?
* Why did we install DBeaver and Postgres?
* What is JDBC?
---
* What does SQL stand for?
* Is SQL a programming language?
* What is a relational database management system (RDBMS)?
* What are common numerical datatypes we might use in SQL?
* What are common character types we might use?
* What are common date/time types we might use?
* What is a schema?
* What SQL sublanguages are there?
* What commands are associated with DDL?
* What commands are associated with DML?
* How is DQL related to DML? Which command from DML does DQL have?
* What does CRUD mean?
* What commands are associated with DCL?
* What commands are associated with TCL?
* What are the 6 common constraints in SQL?
* What are composite keys?
* What is the purpose of database normalization?
* What is 1NF?
* What is 2NF?
* What is 3NF?
* What are the 3 relationships that describe multiplicity/cardinality?
* What is the SERIAL datatype in Postgres?
* What does utility class mean?
* What steps do we need to take to query data from the database using the JDBC API in Java?
* What are the three layers?
* What is the purpose of the data access layer?
