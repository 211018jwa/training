# TestNG

Similar to JUnit, TestNG is a framework that supplies an API for writing tests as well as providing platforms to execute the tests. For example, it is possible to execute the tests from the IDE by installing a TestNG plugin to the IDE, or by configuring the Maven surefire plugin (which handles test execution) within the pom.xml file of a Maven project. TestNG tests can be run using Maven by running `mvn test` from the command line (inside of the project directory).

TestNG was originally designed to address shortcomings with JUnit. For example, JUnit 4 had no way to explicitly specify the ordering of tests and did not have functionality to easily provide external data to the written test cases (data-driven tests). TestNG was therefore created and was aptly named with NG standing for `Next Generation`.

Of course, JUnit 5 (Jupiter) came along and added additional features for testers to make use of. However, TestNG still offers a wider range of features and configuration options and also enables testers to more easily organize and structure tests into different groupings. Therefore, TestNG is a powerful framework to serve as the basis of creating, for example, an **E2E testing framework**.

TestNG is still continuously updated and the same is true about JUnit. Both JUnit and TestNG are frameworks that will continue to be used into the future for tests automated using the Java programming language.

## Important Features in TestNG
- Test Organization
    - Suite
        - Test (test category)
            - Class
                - Group (optional)
                    - Method
- Data-driven / parameterized testing (Data providers)
- Test execution configuration using `testng.xml` file
- Ordering tests by priority
- Concurrent testing
    - "Concurrent": happening at the same time
    - TestNG supports multi-threading

## Annotations
- @BeforeSuite
- @AfterSuite
- @BeforeTest
- @AfterTest
- @BeforeClass
- @AfterClass
- @BeforeMethod
- @AfterMethod
- @Test
    - enabled
    - dependsOnMethods
    - groups
    - dataProvider
    - priority
    - timeOut
    - ...

[source](https://testng.org/doc/documentation-main.html)

## XML Configuration
TestNG provides support for XML configuration. Below is an example of a TestNG XML file. A TestNG XML file specifies the tests that make up on entire single suite. (1 suite, 1 XML file). If you want multiple suites, you will need to have multiple XML files.

Suites are the highest level of classification of various tests. 
- ex. Web App Suite
- ex. Mobile App Suite
- ex. Desktop App Suite

```xml
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="Web Application Test Suite" verbose="1" >
  <test name="Smoke">
    <classes>
       <class name="com.revature.LoginTests">
            <methods>
                <include name="validUsernameAndPassword" />
                <include name="validUsernameInvalidPassword" />
            </methods>
       </class>
    </classes>
  </test>
  <test name="Regression">
    <classes>
        <class name="com.revature.CartTests">
        </class>
        <class name="com.revature.ProductSortingTests">
        </class>
    </classes>
  </test>
</suite>
```

# E2E Testing Framework
You have already heard that JUnit and TestNG are "testing frameworks". However, the word "framework" can take on many different meanings depending on the context. In the case of JUnit and TestNG, these are tools composed of many different moving parts that make writing tests and executing tests possible.

However, when it comes to what is commonly referred to as an "E2E testing framework", "Automation testing framework", etc. in the industry, it means putting together these many different tools along with our own test scripts and potentially proprietary tools or helper utilities in order to better design, organize, and execute tests as well as provide reporting functionalities.

For example, the diagram below shows several tools (dependencies) put together into a Java (Maven) project intended to house our tests.
- Maven
- TestNG
- Selenium WebDriver
- Apache POI (for reading Microsoft office files such as excel files)

Other useful tools may include
- Cucumber (For behavior driven frameworks)
- Test reporting tools (ExtentReport)

Also, various design patterns and utility classes may be written
- Page object model (design pattern)
- Custom classes that read text files that contain various properties that we might define for different configurations of the framework

![https://www.nexsoftsys.com/articles/images/1-framework.jpg](https://www.nexsoftsys.com/articles/images/1-framework.jpg)

## Types of E2E frameworks
1. Linear Framework
    - Testing of small applications
    - Data is usually hardcoded
    - Tests are not organized into different modules
2. Modular Driven Framework
    - Test scripts are divided into modules for easier maintenance and scalability to 100s or 1000s of tests
    - TestNG really helps with this (suite -> test -> class -> method)
3. Behavior Driven Development Framework
    - Enables developers, testers, and business analysts (non-technical) to participate even with minimal coding expertise
    - Use non-technical, natural language to create test specifications (Gherkin -> feature files)
4. Data Driven Framework
    - Data (such as login credentials) are read from external files (CSV, Excel, Text, etc.)
    - Reduces number of test scripts required
        - ex. 1 test script for valid login, 100 different logins, 100 different executions
5. Keyword Driven Framework
    - Keywords are defined within a table along with input and expected output
    - The keyword matches with a particular test method to have it executed with given test data
    - Used primarily for small projects
6. Hybrid Framework
    - Combines data driven w/ keyword driven to leverage the benefits of both
