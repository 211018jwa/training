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
