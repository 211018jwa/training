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
        - Throwing a custom exception if student with id not found
            - [lines of code](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/service/StudentService.java#L42-L44)
        - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/service/StudentService.java#L24-L55)
* StudentController
    - Edit First Name of Student
        - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/controller/StudentController.java#L19-L30)
        - Extract information from HTTP patch request
            - [screenshot of POSTMAN](https://github.com/211018jwa/training/tree/main/week-3/day-3/patch-request-firstname.PNG)
            - path variable (id)
            - JSON -> object (EditFirstNameDTO)
        - EditFirstNameDTO
            - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-3/jdbc-demo-2/src/main/java/com/revature/dto/EditFirstNameDTO.java)

## Day 4
* StudentController
    - Change "Edit First Name of Student" handler logic
        - [changes](https://github.com/211018jwa/training/blob/main/week-3/day-4/jdbc-demo-2/src/main/java/com/revature/controller/StudentController.java#L31-L42)
* HTTP
    - Topics
        - Example of an HTTP client v. HTTP server
        - HTTP Requests
            - URI
            - method
            - headers
            - body
        - HTTP Responses
            - status code
            - headers
            - body
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-4/jdbc-demo-2/src/main/java/com/revature/controller/StudentController.java#L46-L88)
* SQL 
    - Adding grades table
        - one student has many grades (one-to-many)
        - [sql script](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L24-L42)
    - Referential Integrity
        - [notes and demo](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L48-L67)
    - ACID properties
        - [notes and demo](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L70-L112)
    - Scalar and aggregate functions
        - [demo and notes](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L114-L189)
    - Joins
        - [demo and notes](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L191-L213)
    - SELECT clauses order
        - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L215-L228)
    - ORDER BY
        - [demo](https://github.com/211018jwa/training/blob/main/week-3/day-4/student-grades-script.sql#L230-L236)
## Day 5
* JDBC
    - DriverManager class
    - SQLException class
    - Connection interface
    - Statement interface
    - PreparedStatement interface
    - CallableStatement interface
    - ResultSet interface
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-5/jdbc-notes.md)
* Web Services / REST
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-5/http-rest-webservices.md)
* Mapping endpoints
    - [example](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/controller/StudentController.java#L128-L133)
* Implementing addStudent functionality
    - [handler example](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/controller/StudentController.java#L43-L50)
    - [service layer](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/service/StudentService.java#L118-L146)
* Implementing getAllStudents functionality
    - [handler example](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/controller/StudentController.java#L52-L56)
    - [service layer](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/service/StudentService.java#L80-L89)
* Implementing getStudentById functionality
    - [handler example](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/controller/StudentController.java#L58-L64)
    - [service layer](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/service/StudentService.java#L93-L109)
* Implementing deleteStudentById functionality
    - [handler example](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/controller/StudentController.java#L70-L74)
    - [service layer](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/service/StudentService.java#L148-L167)
* Writing Unit Tests for StudentService
    - ARRANGE, ASSERT, ACT
    - [getAllStudents() tests](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/test/java/com/revature/service/StudentServiceTest.java#L26-L106)
    - [getStudentById(int id) tests](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/test/java/com/revature/service/StudentServiceTest.java#L108-L207)
    - [editFirstNameOfStudent(String studentId, String changedName) tests](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/test/java/com/revature/service/StudentServiceTest.java#L209-L288)
    - [addStudent(AddOrUpdateStudentDTO dto) tests](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/test/java/com/revature/service/StudentServiceTest.java#L290-L442)
* Javalin Exception mapping
    - [notes and demo](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/java/com/revature/controller/ExceptionMappingController.java#L10-L38)
* Logging with Logback framework and SLF4J
    - [notes](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/resources/logback.xml#L1-L23)
    - [configuration](https://github.com/211018jwa/training/blob/main/week-3/day-5/student-web-service-with-unit-testing/src/main/resources/logback.xml#L25-L49)

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
---
* What is a DTO (Data transfer object)?
* What was the motivation for creating a AddOrUpdateStudentDTO class to use when adding or updating a student in our demo example?
* When we insert a new record, if the datatype for the primary key is SERIAL, do we need to provide a primary key value ourselves?
* What layer's methods will the service layer's methods be invoking?
* What layer's methods will the controller layer's methods/lambdas be invoking?
* What technology do we use in the controller layer (starts with J)?
* What technology do we use in the data access layer (also starts with a J)?
* What does `ctx.bodyAsClass(EditFirstNameDTO.class)` do in the demo's controller layer?
* What does `ctx.pathParam("id")` do in the demo's controller layer?
---
* What is the purpose of `ctx.json(...)`?
* What is the purpose of `ctx.status(...)`?
* What is HTTP?
* Describe the HTTP request/response cycle in relation to our backend application
* What are the 5 commonly used HTTP methods?
* What is the proper usage of GET v. POST v. PUT v. PATCH v. DELETE?
* What 4 components does an HTTP request consist of?
* What 3 components does an HTTP response consist of?
* What do each of the 1XX, 2XX, 3XX, 4XX, and 5XX status code categories mean?
* If I wanted to delete a student with ID of 1, what is the appropriate HTTP method to use, and what might the URI look like?
* What is referential integrity?
* What are the 4 ACID properties?
* What is atomicity?
* What is consistency?
* What is isolation?
* What is durability?
* What are aggregate functions and scalar functions? How are they different from each other?
* Research and remember some examples of aggregate functions
* Research and remember some examples of scalar functions
* What is the purpose of the GROUP BY clause? What type of function (scalar? aggregate?) do we use with GROUP BY?
* What is the difference between WHERE and HAVING?
* What are the 4 types of joins?
* How would you describe an INNER JOIN, an OUTER JOIN, a LEFT JOIN, and a RIGHT JOIN?
* Of the following clauses associated with the SELECT command (`FROM`, `JOIN ... ON ... = ...`, `WHERE`, `GROUP BY`, `HAVING`, `ORDER BY`) remember the order they must be written in
* How does ORDER BY order the data from a query by default (ascending? descending?) ? How do we have it do the opposite?
---
