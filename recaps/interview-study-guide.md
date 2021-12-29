# Interview Study Guide
This document is intended to help you prepare for client interviews. From previous experience, the client you will likely initially interview with has emphasis on the following topics:
- Java
- SQL (query questions, etc.)
- SDLC
    - Agile v. Waterfall
    - Scrum framework
- Testing concepts
- Selenium
- Cucumber

Other topics that are good to look over as well:
- REST
- DevOps

**Please reference the RevaturePro calendar as that will contain an overview of topics covered throughout training. Do additional research online on possible interview questions with regards to each topic so that you can be as prepared as possible. Don't use this study guide as your sole resource. This is only designed to help guide you in the interview preparation process**

# Soft Skills
* Tell me about yourself
* Tell me about the projects you've worked on
* How did you overcome challenges with collaborating on group projects? What tools and communication strategies did you use? What processes did you follow?

# Java
* What is a class?
* What is an object?
* How is a class different than an object?
* What are the four pillars of OOP?
* What is inheritance?
* What is encapsulation?
* What are the Java access modifiers and what do they each do?
* What are getters/setters?
* What is polymorphism?
* Explain method overriding and overloading and how they are different from each other
* What is abstraction?
* What are abstract methods?
* What is an abstract class and how is it different from a regular class?
* What is an interface?
* How many abstract classes can you extend? How many interfaces can you implement?
* Explain what Lists, Sets, and Maps are
* How is an Array different than a List?
* What is the difference between a List and Set?
* Can you access an element in a Set using an index? 
* Are strings mutable or immutable?
* What is an exception?
* Explain the difference between checked and unchecked exceptions
* Explain throws v. throw
* What is try-with-resources?
* What is the purpose of the finally block?
* Can you have multiple catch blocks?

# SQL
* What are the 5 sub-languages of SQL?
* What commands are associated with DDL?
* What commands are associated with DML?
* What commands are associated with DQL?
* What commands are associated with TCL?
* What commands are associated with DCL?
* What relationships can you have between tables? (multiplicity)
* What SQL constraints are there?
* What is the difference between LEFT/RIGHT, INNER, and OUTER joins?
* What are scalar v. aggregate functions?

## SQL Query questions
* Query for the employee from a table called Employee who has the highest salary
* Query for the employee from a table called Employee who has the SECOND highest salary
* Join two tables together (what is the syntax for joining?)
* Given a table of Employee w/ the columns id, name, salary, and department, query for the average salary of each department (need to use GROUP BY and the AVG aggregate function)

# SDLC
* What is the SDLC?
* What are the 7 phases of the SDLC?
* Agile v. Waterfall?
* 4 Core values of Agile?
* Examples of Agile frameworks/methodologies?
* Explain Scrum in detail
* What is a Sprint?
* What are the Scrum artifacts?
* What is a user story?
* What is the product backlog? Who is in charge of managing the product backlog?
* What is the Sprint backlog? The user stories included in the Sprint backlog are decided in what Scrum meeting?
* What are acceptance criteria for a user story? How is this related to drafting test cases?
* What Scrum roles are there?
* Responsibilities of the Product Owner?
* Responsibilities of the Scrum Master?
* What Scrum ceremonies/meetings are there?
* What questions should be answered during the daily standup meeting?
* Sprint review v. Sprint retrospective meeting?
* What are the 6 Scrum principles? https://www.scrumstudy.com/whyscrum/scrum-principles

# Testing Concepts
* What is the mindset that a tester should have?
* What are the phases in the testing lifecycle?
* Verification v. Validation?
* Activities involved with verification/static testing?
* Validation testing is made up of what 2 subcategories?
* What is functional testing?
* What 4 types of tests make up the testing pyramid? What tradeoffs are there as you go from lower to higher in the pyramid?
* What is whitebox v. blackbox testing?
* Which tests are considered whitebox tests?
* Which tests are considered blackbox tests?
* What is the difference between positive and negative tests?
* Should positive or negative tests be written first?
* What is exploratory testing?
* What is exhaustive testing and is it feasible?
* Explain equivalence partitioning v. boundary testing
* What is regression testing? Why is it important?
* What is smoke testing? Why should smoke testing be done before regression testing?
* What is sanity testing?
* How does regression testing relate with DevOps and the process of deploying code to production?
* What is manual testing? What type of formal structure/documents do we follow when executing tests manually?
* What is test automation?
* What tests are usually always automated? Which ones can be manual?
* What is non-functional testing? What 2 subcategories are there?
* What is performance testing?
* Describe load, spike, ramp up/down and stress testing
* What is usability testing?
* What is a defect/bug?
* What should happen when a defect is found by a tester?
* Describe the defect lifecycle and the phases of the defect lifecycle
* Describe what a defect report should contain
* What severity and priority levels are there?
* What is test driven development (TDD)?
* What is behavior driven development (BDD)?

# Cucumber


# Selenium
* What is Selenium?
* What are the advantages of automation testing v. manual testing?
* Selenium WebDriver v. Selenium IDE v. Selenium Grid? Which one did you use during training?
* What are the steps to set up Selenium Java and navigate to a webpage?
* How can we use the ChromeOptions object with the WebDriver object to open up an incognito browser?
* What locators are there for Selenium?
* Which locator is more efficient/faster: CSS or XPath locator?
* Which locator is more flexible: CSS or XPath locator?
* What is the difference between absolute v. relative XPath? Which one is more fragile?
* `driver.findElement() v. driver.findElements()`?
* What is the difference between implicit and explicit wait?
* Why might we need to use waits?
* `driver.close() v. driver.quit()`?
* What method is used to click on an element?
* What is method is used to type into an element?
* What is the Actions class in Selenium? https://www.browserstack.com/guide/action-class-in-selenium

# DevOps
* What is DevOps, and how is it related to Agile?
* CI/CD: Continuous integration v. continuous delivery v. continuous deployment?
* What is Jenkins?
* What is a Jenkins pipeline?
