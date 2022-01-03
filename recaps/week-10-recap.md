# Week 10 Recap

## Day 1
- [Add to Spring Boot project](https://github.com/211018jwa/training/blob/main/week-10/day-1/gradify-sb/pom.xml#L21-L36)
    - Spring Boot actuator
    - Spring Boot DevTools
    - Lombok
- [Types of Pointcut expressions](https://github.com/211018jwa/training/blob/main/week-10/day-1/spring-aop-notes.md#types-of-pointcut-expressions)

## Day 2
- Utilizing Spring Data
    - [UserDao interface extending JpaRepository interface](https://github.com/211018jwa/training/blob/main/week-10/day-2/gradify-sb/src/main/java/com/revature/gradifysb/dao/UserDao.java#L7-L15)
        - [Using Spring Data naming conventions to create DAO behaviors](https://github.com/211018jwa/training/blob/main/week-10/day-2/gradify-sb/src/main/java/com/revature/gradifysb/dao/UserDao.java#L13)
    - [Using @Query for custom behaviors](https://github.com/211018jwa/training/blob/main/week-10/day-2/gradify-sb/src/main/java/com/revature/gradifysb/dao/AssignmentDao.java#L12-L13)
- [Using HttpClient to consume endpoints w/ Angular](https://github.com/211018jwa/training/blob/main/week-10/day-2/gradify-sb-angular/src/app/login.service.ts#L11-L34)
    - [Subscribing to observable (check login status)](https://github.com/211018jwa/training/blob/main/week-10/day-2/gradify-sb-angular/src/app/login-page/login-page.component.ts#L28-L49)
    - [Subscribing to observable (login)](https://github.com/211018jwa/training/blob/main/week-10/day-2/gradify-sb-angular/src/app/login-page/login-page.component.ts#L51-L74)

## Day 3
- [Revisiting testing lifecycle](https://github.com/211018jwa/training/blob/main/week-10/day-3/testing-revisited.md)
- [Gradify Testing documents](https://github.com/211018jwa/training/tree/main/week-10/day-3/gradify-testing-process)
    - Business requirements
    - Test plan document
    - Test case design document
    - Requirements traceability matrix

## Day 4
- [Bash Scripting example](https://github.com/211018jwa/training/blob/main/week-10/day-4/build-project.sh)
    - Automatically builds Angular project
    - Moves built Angular project into static folder of Spring Boot project
    - Builds the Spring Boot project
    - Uploads the built .jar file onto EC2 instance

# Questions

## Spring Boot
* What is the purpose of the Spring Boot actuator?
* What is the purpose of Spring Boot DevTools?

## Spring Data
* What is Spring Data JPA?
* Spring Data abstracts away Hibernate when we build our DAO layer. Why is this useful and what is the process we follow to do so?
* What is JpaRepository?
* What can we do once we create an interface that extends JpaRepository?
* What are the naming conventions for the abstract methods whenever we extend JpaRepository (or any other Spring Data JPA interface)?
* What is the purpose of the @Query annotation?

## Testing
* What is the purpose of the test plan document?
* What is the purpose of the test case design document? What does it contain?
* What is the purpose of the requirements traceability matrix?

## Misc
* What is Lombok?
* What is bash scripting?
