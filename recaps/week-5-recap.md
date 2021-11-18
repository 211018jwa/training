# Week 5 Recap

## Day 1
* [AWS POWERPOINT](https://github.com/211018jwa/training/blob/main/week-5/day-1/aws-intro.pdf)
* [Link to Backend that was deployed to EC2 instance](https://github.com/211018jwa/training/tree/main/week-5/day-1/jdbc-demo-2)
* [Link to Frontend that was deployed to S3 bucket](https://github.com/211018jwa/training/tree/main/week-5/day-1/student-recordkeeping-frontend)
* [Link to SQL script to populate RDS](https://github.com/211018jwa/training/blob/main/week-5/day-1/student-grades-script.sql)
* Refer to videos on AWS setup
    - General steps for RDS
        - Create a new database instance
        - Provide configuration for Postgres
        - Free tier selected for Postgres 12.8
        - Public access: yes
        - Edit security groups to allow inbound port 5432 from any IP address
    - General steps for EC2
        - Create a new EC2 instance
        - Download .pem file (used to authenticate when connecting to the instance)
        - Create config file
            - [example config file format](https://github.com/211018jwa/training/blob/main/week-5/day-1/config)
        - `ssh abc`
        - Install Java 8
            - `sudo yum install -y java-1.8.0-openjdk-devel`
            - `java -version`
        - Upload .jar file to EC2 instance
            - `scp ./my-jar-file.jar abc:/home/ec2-user/`
        - Run the Java application on the EC2 instance
            - `nohup java -jar ./my-jar-file.jar &`
    - General steps for S3
        - Create a new S3 bucket
        - Allow public access
        - Upload new files
            - Specify permissions as public read
        - Go to properties and enable static website hosting option

## Day 2
* Backend modifications for ADD STUDENT functionality
    - Added a `messages` property to InvalidParameterException
        - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/jdbc-demo-2/src/main/java/com/revature/exceptions/InvalidParameterException.java#L8)
        - Used to store all messages indicating a invalid input for firstname, lastname, classification, age to be displayed on the frontend whenever the user inputs invalid data into the input elements
    - Editing StudentService's addStudent() method: Adding messages to the property for each incorrect input
        - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/jdbc-demo-2/src/main/java/com/revature/service/StudentService.java#L130-L159)
        - Create the exception object, add any messages based on invalid input conditions being met, and throw the exception IF there is any message at all within the exception
    - ExceptionMappingController: changing the JSON being sent for InvalidParameterException when it is thrown and managed by Javalin's Exception mapping feature
        - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/jdbc-demo-2/src/main/java/com/revature/controller/ExceptionMappingController.java#L23)
* Frontend modifications for ADD STUDENT functionality
    - New div element to contain the invalid input messages
        - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-recordkeeping-frontend/index.html#L60-L62)
    - Add the invalid input message `<p>` elements if the status code is 400
        - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-recordkeeping-frontend/index.js#L72-L87)
* Selenium
    - [SELENIUM POWERPOINT](https://github.com/211018jwa/training/blob/main/week-5/day-2/selenium.pdf)
    - Setting up Selenium
        1. Specify location of actual chromedriver
            - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/tests/StudentManagerTest.java#L31-L32)
        2. Instantiate the WebDriver object
            - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/tests/StudentManagerTest.java#L44-L45)
        3. Navigate to the website
            - [link](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/tests/StudentManagerTest.java#L65-L66)
    - Finding elements
        - `driver.findElement(By.<locator>)`
            - Returns a single WebElement
        - `driver.findElements(By.<locator>)`
            - Returns a List of WebElements
    - Selenium Locators
        - "Easy" locators
            - By.name
            - By.id
            - By.className
            - By.linkText
            - By.partialLinkText
            - By.tagName
        - "Hard" locators
            - By.xpath
            - By.cssSelector
    - CSS Selectors
        - Tag
        - Class
        - Id
        - Descendant
        - Attribute
    - XPath
        - Absolute v. relative XPath
    - Selenium Waits
        - Implicit
            - [example](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/tests/StudentManagerTest.java#L51)
            - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/tests/StudentManagerTest.java#L48-L63)
            - `driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));`
        - Explicit
            - [example and notes](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/pages/StudentManagerHomePage.java#L66-L91)
            - [second example](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/pages/StudentManagerHomePage.java#L96-L102)
    - Page Object Model (Selenium)
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/pages/StudentManagerHomePage.java#L12-L20)
        - [example](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/pages/StudentManagerHomePage.java#L20-L103)
    * E2E Testing
        - [example](https://github.com/211018jwa/training/blob/main/week-5/day-2/student-management-e2e/src/test/java/com/revature/tests/StudentManagerTest.java)
            - Using Page Object Model design pattern
            - Utilizing JUnit 5 (Jupiter) to write and execute tests
# Day 3
* Introduction to BDD
    - Approach to software development
        - SUPERSET of TDD, "TDD is part of BDD"
    - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#behavior-driven-development)
    - Steps of developing application features
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#steps-of-developing-features)
    - Benefits of BDD
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#bdd-benefits)
    - Implementing BDD
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#implementing-bdd)
    - Gherkin
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#gherkin)
        - Gherkin Scenarios
            - [notes and example](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#scenarios)
    - Feature Files
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#terminologies)
    - Glue code
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#terminologies)
    - Test Runner
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#terminologies)
    - Cucumber parameterization
        - [notes](https://github.com/211018jwa/training/blob/main/week-5/day-3/bdd.md#cucumber-parameterization)
* End-to-end Testing w/ Cucumber (BDD), JUnit 5 (Jupiter), and Selenium
    - [feature file example](https://github.com/211018jwa/training/blob/main/week-5/day-3/calculator-e2e-bdd-testing/src/test/java/com/revature/features/add.feature)
    - [glue code example](https://github.com/211018jwa/training/blob/main/week-5/day-3/calculator-e2e-bdd-testing/src/test/java/com/revature/tests/AddNumbersTest.java#L17-L57)
    - [test runner example](https://github.com/211018jwa/training/blob/main/week-5/day-3/calculator-e2e-bdd-testing/src/test/java/com/revature/features/TestRunner.java)    

# Questions
* What is AWS RDS?
* What is AWS EC2?
* What is AWS S3?
* How do we create an EC2 instance?
* What is the purpose of setting inbound rules for a security group?
* How do we connect to our EC2 instance?
* What is the purpose of the .pem file?
* What command do we use to run a .jar file as a Java application?
---
* What are the first 3 steps in setting up Selenium?
* What Selenium locators are there?
* What common CSS selectors are there? How can we use Selenium's By.cssSelector locator to locate elements with these CSS selectors?
* What is XPath?
* What is the difference between absolute XPath and relative XPath?
* What is the Chropath plugin and how does it help us determine if the CSS selector or XPath selectors we are writing are valid or not?
* What is the purpose of a wait when using Selenium?
* What 2 types of waits are there?
* What is the difference between an implicit and explicit wait?
* Which type of wait is preferable to use? Why?
* What is the page object model, what is its benefits, and how do we use it with Selenium?
---
* What is BDD?
* What is TDD?
* What does it mean for BDD to be a superset of TDD?
* How do we approach development of a feature for an application when utilizing BDD?
* What are the benefits of BDD?
* Cucumber is a BDD framework. What 3 types of files are important to write and execute tests with Cucumber?
* What is a feature file?
* What is a glue code/step definition file?
* What is the purpose of the Test Runner class?
* What plugin do we need to install to Spring Tool Suite / Eclipse for running our feature files to generate the gluecode snippets?
* What english-like language does Cucumber use when we define the feature files?
* What step keywords does Gherkin utilize for Scenarios?
* Write an example of a scenario using Given ... When ... Then (And and But can also be used) for the calculator app
* What types of parameterization does Cucumber support?
* What is inline parameterization?
* What is table parameterization
* What is scenario outline parameterization?