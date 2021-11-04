# SQL (Structured Query Language)

SQL = Structured query language

It is NOT a programming language. It's a language we use to perform operations on a **relational database**.

Relational Database: databases that are structured in the form of tables that could be potentially related to each other through foreign keys and primary keys.
- Data in tables is structured as columns (properties) and rows (each entry)
    - ex. rows correspond to each student, columns correspond to the properties of those students (first_name, last_name, age)

A database is a collection of data in some organized format
- Allows us to input, manage, and retrieve data quickly
- For relational databases, rows and columns
- For non-relational, it could be key-value pairs, etc.

# Relational Database Management System (RDBMS)
To provide a way of utilizing the concept of relational databases, we have RDBMSes, or relational database management systems. This is what we obtained when we installed Postgres. Postgres is a particular implementation of a relational database structured around the idea of SQL (Structured query language).
- Is the actual "engine"/"brain" of the database
- Upholds relationships between tables
- Maintains security, accuracy, integrity, and consistency of the data
- There are many different dialects/flavors of SQL ("Sequel")
    - MariaDB
    - PostgreSQL
    - MySQL
    - OracleSQL
    - MS SQL Server

# Common Datatypes

## Number data
* INTEGER: whole numbers
* BIGINT: really large whole numbers
* NUMERIC: decimal numbers

## Character data
* VARCHAR(<n>): variable number of characters (with a maximum of <n>)
* CHAR(<n>): fixed number of storage (<n> characters)
    - A lot less efficient

## Binary data
* BLOB: to store binary data (images, files, etc.)

## Date and time
* TIMESTAMP: Date and time
* DATE
* TIME

# Schema
Two different definitions of Schema: 
1. The layman term: The formal structure of the data and tables in a relational database. This includes tables and their columns, constraints, and data types, and can be described or illustrated through diagrams (entity relationship diagrams (ERDs)).

2. Refers to the collection of database objects in our database, such as tables, stored procedures, indices, sequences etc. 

If we look inside of DBeaver and see something called schema, we are referring to the second definition.

In Postgres, we have a default schema called `public`. So, by default, when you connect to this database and execute SQL queries, it will by default look for tables inside of the public schema.

```sql
SELECT *
FROM students -- automatically look for the students table in public -> "FROM public.students"
```

If you create another schema in the database, you will need to explicitly specify that you want to query for a table from that other schema.

```sql
SELECT *
FROM my_new_schema.social_media_posts -- the social_media_posts table belongs to the schema "my_new_schema"
```

# SQL Sublanguages
Understanding and remembering the sublanguages and the commands that are part of each sublanguage is very important. It will give you a mental model of how to easily remember each of these SQL commands.

* DDL = Data Definition Language
    - Used to create/alter tables
    - How we DEFINE the structure of our database
    - CREATE, ALTER, TRUNCATE, DROP
        - CREATE: used to add a new database object (creating a table)
        - ALTER: used to modify an existing table (changing the column data types, changing the column name, adding a new column, removing a column)
        - TRUNCATE: deletes all data from a table without deleting the table itself
        - DROP: deletes the entire table
* DML = Data Manipulation Language
    - Creating/manipulating data within a table (modifying the records in the table)
    - CRUD operations (Create, read, update, delete)
    - INSERT, SELECT, UPDATE, DELETE
        - INSERT: insert a new record into a table
        - SELECT: retrieve data from a table
        - UPDATE: update existing records in a table
        - DELETE: delete a record in the table
* DQL = Data Query Language
    - Some people argue that the SELECT statement that is part of DML should be its own separate sublanguage
    - So, that is what this bulletpoint on DQL is for
* DCL = Data Control Language
    - Regulate access to the data by imposing restrictions such as user permissions
    - Pertains to security
    - GRANT, REVOKE
* TCL = Transaction Control Language
    - Used to control database transactions
    - Transaction: "a single unit of work"
        - While we are modifying data using DML statements, we might choose to treat multiple statements as a single transaction
    - COMMIT, ROLLBACK, SAVEPOINT
        - COMMIT: persist the DML operations to permanent memory. It is not possible to rollback changes once you have committed.
        - ROLLBACK: used to rollback changes to before the transaction. This can only be done if we have not yet committed the transaction
        - SAVEPOINT: set checkpoints along the way to ROLLBACK to those specific checkpoints instead of before the transaction
    - By default, every DML statement that you execute will be automatically committed. You would need to turn off autocommit to be required to actually run COMMIT to commit changes

# Constraints
In SQL, we have this idea of constraints that we can define for our columns when creating a table. This allows us to ensure consistency with our data and its integrity. Some of the constraints include the following:
- PRIMARY KEY: serves as a unique identifier for a record in a table
    - A primary key is also UNIQUE and NOT NULL (implicitly)
- FOREIGN KEY: serves as a reference to a primary key in another table (or actually in the same table as well, but typically in a different table). Foreign keys help to establish a multiplicative relationship (one-to-one, one-to-many, many-to-many)
- UNIQUE: only unique values are possible for a certain column. We cannot have other rows of data with the same value in this column as another row
- NOT NULL: this means you cannot have null values for that particular column
- CHECK: Ensures that data must follow a certain condition. `CREATE TABLE person (... , age INTEGER CHECK (age) >= 18, ...)`
- DEFAULT: If we do not provide a value for a column with the DEFAULT constraint applied, it will be DEFAULT be given a certain value that is specified. `CREATE TABLE person (... , age INTEGER DEFAULT 0, ...)` will have the default age be 0 if you insert the record without an age being specified.

## Composite Keys
Composite keys are primary keys made up of more than one column. Typically, a primary key will just be a single column, but sometimes depending on the circumstance, you might choose to use more than 1 column. Each column that makes up this composite key is known as a `candidate key`.

Example: Song table

Let's say we have a table called `song` that contains entries corresponding to individual songs. This table has the columns `album_id`, `track_no`, `genre`, `song_description`, etc.. In order to identify a particular song uniquely, we need to use a composite key made up of album_id and track_no.

Composite key = `album_id` AND `track_no`

# Database Normalization
Normalization is how we aim to reduce redundancy and duplicate data when designing a database. This process aims to help keep a database organized, expandable, and maintainable.

Levels of normalization:
- 0NF = Zero Normal Form (not really a normalization level, just means you didn't normalize at all)
    - Total chaos
- 1NF = 1st Normal Form
    - Data should be atomic (ex. if we have multiple phone numbers for a person, we should not be listing out all the phone numbers in a single cell. DO NOT DO THIS: `512-000-0000, 512-000-0001`)
    - Table must have a primary key
- 2NF = 1st NF + No partial dependencies
    - No partial dependencies = cannot have columns that are describing only one part of the composite key
        - ex. if we have a column called `album_description` in our `song` table, we are violating 2NF
            - Why? We have a composite key made up of `album_id` and `track_no`, and `album_description` is only describing `album_id`.
        - However, `song_description` is valid, because it describes the entire composite key
            - `album_id` and `track_no` together identify a particular song. `song_description` is describing the entire composite key
    - If you don't use a composite key, and are already in 1NF, then that means you are in 2NF already
- 3NF = 2NF + No transitive dependencies
    - No transitive dependencies = cannot have a column describing another column that then describes the primary key
        - Cannot have C describes B describes A
        - We can't have `genre_description` describe `genre` which then describes the composite key `album_id` AND `track_no`
    - Every column should describe nothing but the primary key

GENERAL GUIDELINES:
- 1NF: We must have a primary key
- 2NF: We must describe the entire key
- 3NF: And describe nothing but the key

# Multiplicity / Cardinality
Describes the relationship between two tables. There are 3 different types of relationships you can have.

- 1 to 1
    - Records in one table are associated with only 1 record in another table
    - Can be created using both a FOREIGN KEY constraint and a UNIQUE constraint for that foreign key column
    - ex. classroom table and projector table
        - 1 classroom can have 1 projector
- 1 to many (many to 1)
    - Each record in a table can be associated with many records in another table
    - ONE user can have MANY social media posts
    - ONE beehive can have MANY bees
    - ONE cohort can have MANY associates
    - To establish this relationship, we need a foreign key on the MANY side of the relationship
        - ex. FOREIGN KEY should be on
            - the bees table
            - associates table
            - social_media_posts tables
- Many to many
    - Records in both tables are associates with many records in the other
    - Students and courses
        - A student can have MANY courses, but courses can also have MANY students
        - Many students have many courses
    - We need a junction table to establish this relationship

**Students Table**

| id | name |
| :- | :--- |
| 1 | John |
| 2 | Jane |
| 3 | Bob |

**Courses Table**
| id | name |
| :- | :--- |
| 1 | Algebra |
| 2 | History |

**Join Table**
| student_id | course_id |
| :--------- | :-------- |
| 1 | 1 |
| 1 | 2 |
| 2 | 2 |
| 3 | 1 |