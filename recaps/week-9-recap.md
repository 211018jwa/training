# Week 9 Recap

## Day 1
- Hibernate Notes
    - [What is Hibernate?](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#what-is-hibernate)
    - [Advantages of Using Hibernate](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#advantages)
    - [JPA (Java Persistence API)](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#jpa)
    - [Hibernate Hierarchy](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#hibernate-hierarchy)
        - Configuration class
        - SessionFactory interface
        - Session interface
        - Transaction interface
    - [JPA Annotations](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#jpa-annotations)
        - @Entity
        - @Table
        - @Id
        - @Column
        - Mapping annotations
            - @OneToOne
            - @OneToMany
            - @ManyToOne
            - @ManyToMany
    - [Object States](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#jpa-annotations)
        - Transient
        - Persistent
        - Detached
    - Automatic Dirty Checking
        - Committing transaction
        - Flushing session
    - [Retrieve data w/ Hibernate](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#ways-to-retrieve-data-using-hibernate)
    - [JPA Cascade types](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#jpa-cascade-types)
    - [Unidirectional v. Bidirectional mapping](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#unidirectional-v-bidirectional-relationships)
    - [Caching](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#caching)
    - [Lazy v. Eager loading](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#lazy-v-eager-loading)
    - [Proxy object](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate.md#proxy-object-associated-w-lazy-loading)

![Hibernate Object State Transition Diagram](https://vladmihalcea.com/wp-content/uploads/2014/07/jpaentitystates.png)

- hibernate-demo project
    - [Hibernate Configuration File](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate-demo/src/main/resources/hibernate.cfg.xml)
    - [Configuration object to build SessionFactory object](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate-demo/src/main/java/com/revature/util/SessionFactorySingleton.java#L12-L18)
    - [User Class w/ JPA Annotations](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate-demo/src/main/java/com/revature/model/User.java#L13-L41)
    - [Reimbursement Class w/ JPA Annotations](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate-demo/src/main/java/com/revature/model/Reimbursement.java)
        - [@ManyToOne annotations for author and resolver](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate-demo/src/main/java/com/revature/model/Reimbursement.java#L46-L52)
    - [Populating User and Reimbursement Data](https://github.com/211018jwa/training/blob/main/week-9/day-1/hibernate-demo/src/main/java/com/revature/demo/Main.java#L17-L48)
- complex-hibernate-demo
    - 5 table diagram
    ![5 table diagram](https://raw.githubusercontent.com/211018jwa/training/main/week-9/day-1/p1-complex-table-diagram.jpeg)
    - [@ManyToOne from User to Role](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/model/User.java#L40-L41)
    - @ManyToOne from Reimbursement
        - [to User (author)](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/model/Reimbursement.java#L44-L47)
        - [to User (resolver)](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/model/Reimbursement.java#L49-L50)
        - [to ReimbType](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/model/Reimbursement.java#L52-L53)
        - [to ReimbStatus](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/model/Reimbursement.java#L55-L56)
    - [Persisting initial data](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/demo/Main.java#L45-L100)
    - [Adding a Reimbursement that is pending and of type travel w/ author being User id 2](https://github.com/211018jwa/training/blob/main/week-9/day-1/complex-hibernate-demo/src/main/java/com/revature/demo/Main.java#L24-L43)
- Spring notes
    - [Goals](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#goals)
    - [Inversion of Control (IoC)](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#ioc)
    - [Dependency Injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#dependency-injection)
    - [Spring Bean](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#spring-bean)
    - [Spring Modules](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#modules)
    - [Spring Boot](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#spring-projects)
    - [Bean Factory v. ApplicationContext](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#beanfactory-vs-applicationcontext)
    - [Spring Bean Configuration types](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#configuration)
    - [Bean Scopes](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#bean-scopes)
    - [Dependency Injection Types](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#dependency-injection-types)
    - [Autowiring](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-notes.md#autowiring)
- Spring XML Config Demo
    - [applicationContext.xml](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-xml-config-demo/src/main/resources/applicationContext.xml)
    - [Configuring a bean](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-xml-config-demo/src/main/resources/applicationContext.xml#L14-L15)
    - [Configuring a bean and using setter injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-xml-config-demo/src/main/resources/applicationContext.xml#L19-L20)
    - [Configuring a bean and using constructor injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-xml-config-demo/src/main/resources/applicationContext.xml#L30-L31)
    - [Requesting the service beans from the IoC container](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-xml-config-demo/src/main/java/com/revature/demo/Main.java#L13-L28)
- Spring Annotation Config Demo
    - [enabling component scanning in applicationContext.xml](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/resources/applicationContext.xml#L10-L14)
    - [Using @Repository annotation to register ReimbursementDao as Spring Bean](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/java/com/revature/dao/FakeReimbursementDao.java#L10)
    - [Using @Service to register ReimbursementService as Spring Bean](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/java/com/revature/service/ReimbursementService.java#L11)
    - [Using @Autowired on setter method to perform setter injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/java/com/revature/service/ReimbursementService.java#L20-L24)
    - [Using @Repository annotation to register UserDao as Spring Bean](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/java/com/revature/dao/FakeUserDao.java#L10)
    - [Using @Service annotation to register UserService as Spring Bean](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/java/com/revature/service/UserService.java#L11)
    - [Using @Autowired on constructor to perform constructor injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-annotation-config-demo/src/main/java/com/revature/service/UserService.java#L21-L24)
- Spring Java Config Demo
    - [Using @Configuration to register BeanConfig class as special configuration class](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-java-config-demo/src/main/java/com/revature/config/BeanConfig.java#L13-L15)
    - [@Bean annotation](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-java-config-demo/src/main/java/com/revature/config/BeanConfig.java#L18-L22)
    - [ReimbursementDao configuration](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-java-config-demo/src/main/java/com/revature/config/BeanConfig.java#L24-L26)
    - [ReimbursementService configuration w/ Setter injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-java-config-demo/src/main/java/com/revature/config/BeanConfig.java#L29-L37)
    - [UserService configuration w/ Constructor injection](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-java-config-demo/src/main/java/com/revature/config/BeanConfig.java#L44-L49)
    - [Requesting ReimbursementService and UserService beans](https://github.com/211018jwa/training/blob/main/week-9/day-1/spring-java-config-demo/src/main/java/com/revature/demo/Main.java#L12-L28)

## Day 2
- [Spring Web Annotations](https://github.com/211018jwa/training/blob/main/week-9/day-2/spring-web-annotations.md#spring-web-annotations)
    - Utilized with Controller beans
- Spring Boot Application
    - Generating a Spring Boot application using Spring Initializr
        - [link](https://start.spring.io/)
        - Dependencies to add
            - Spring Data JPA
            - Spring Web
            - Postgres Driver
    - [application.properties](https://github.com/211018jwa/training/blob/main/week-9/day-2/spring-boot-demo/src/main/resources/application.properties)
    - [Controller examples](https://github.com/211018jwa/training/tree/main/week-9/day-2/spring-boot-demo/src/main/java/com/revature/springbootdemo/controller)
    - [User entity example](https://github.com/211018jwa/training/blob/main/week-9/day-2/spring-boot-demo/src/main/java/com/revature/springbootdemo/model/User.java)
    - [UserService example](https://github.com/211018jwa/training/blob/main/week-9/day-2/spring-boot-demo/src/main/java/com/revature/springbootdemo/service/UserService.java)
    - [UserDao example](https://github.com/211018jwa/training/blob/main/week-9/day-2/spring-boot-demo/src/main/java/com/revature/springbootdemo/dao/UserDao.java)
- [EntityManager notes](https://github.com/211018jwa/training/blob/main/week-9/day-2/spring-boot-demo/src/main/java/com/revature/springbootdemo/dao/UserDao.java#L19-L31)
    - `@PersistenceContext` annotation
    - `@Transactional` annotation

## Day 3
- [Angular Review](https://github.com/211018jwa/training/blob/main/week-9/day-3/angular-review.pdf)
- [Spring Stereotype Annotations](https://github.com/211018jwa/training/blob/main/week-9/day-3/spring-stereotype-annotations.md)
    - `@Component`
    - `@Service`
    - `@Repository`
    - `@Controller`
- [Spring Test Notes](https://github.com/211018jwa/training/blob/main/week-9/day-3/spring-test.md)
- Gradify Spring Boot Demo
    - [Dao layer](https://github.com/211018jwa/training/tree/main/week-9/day-3/gradify-sb/src/main/java/com/revature/gradifysb/dao)
    - [User Service](https://github.com/211018jwa/training/blob/main/week-9/day-3/gradify-sb/src/main/java/com/revature/gradifysb/service/UserService.java)
    - [Authentication Controller](https://github.com/211018jwa/training/blob/main/week-9/day-3/gradify-sb/src/main/java/com/revature/gradifysb/controller/AuthenticationController.java)
- Spring Test Demos (Gradify Spring Boot Demo)
    - [Dao Unit Tests](https://github.com/211018jwa/training/tree/main/week-9/day-3/gradify-sb/src/test/java/com/revature/gradifysb/daounittests)
    - [AuthenticationController Integration tests](https://github.com/211018jwa/training/blob/main/week-9/day-3/gradify-sb/src/test/java/com/revature/gradifysb/integrationtests/AuthenticationControllerTest.java)

## Day 4
- [Aspect Oriented Programming - AOP](https://github.com/211018jwa/training/blob/main/week-9/day-4/spring-aop-notes.md#aop---aspect-oriented-programming)
- [AspectJ and Spring AOP](https://github.com/211018jwa/training/blob/main/week-9/day-4/spring-aop-notes.md#aop-ecosystem)
- Important Terminology
    - [Aspect](https://github.com/211018jwa/training/blob/main/week-9/day-4/spring-aop-notes.md#aop---aspect-oriented-programming)
    - [Join Point](https://github.com/211018jwa/training/blob/main/week-9/day-4/spring-aop-notes.md#join-points)
    - [Point Cut](https://github.com/211018jwa/training/blob/main/week-9/day-4/spring-aop-notes.md#pointcut)
    - [Advice](https://github.com/211018jwa/training/blob/main/week-9/day-4/spring-aop-notes.md#advice)
        - `@Before`
        - `@After`
        - `@AfterReturning`
        - `@AfterThrowing`
        - `@Around`
- [Creating Around advice for Associate endpoint security](https://github.com/211018jwa/training/blob/main/week-9/day-4/gradify-sb/src/main/java/com/revature/gradifysb/aspect/SecurityAspect.java#L38-L68)
    - [Annotations at top of Aspect class](https://github.com/211018jwa/training/blob/main/week-9/day-4/gradify-sb/src/main/java/com/revature/gradifysb/aspect/SecurityAspect.java#L15-L17)
    - [Creating custom @Associate annotation](https://github.com/211018jwa/training/blob/main/week-9/day-4/gradify-sb/src/main/java/com/revature/gradifysb/annotation/Associate.java)

# Questions

## Hibernate
* What is Hibernate?
* What is an ORM (Object relational mapper)?
* What is the Java Persistence API? How is Hibernate related to this API?
* What class and interfaces are associated w/ Hibernate?
* What are some general JPA annotations used with Hibernate to map entities?
* What are entities?
* What are some of the mapping annotations?
* What are the 3 object states? Describe each of them
* What is Automatic dirty checking?
* What does flushing a session do?
* What are the different ways to retrieve data with Hibernate?
* What is HQL and JPQL?
* What is lazy loading v. eager loading?
* Is @ManyToOne lazily or eagerly loaded?
* Is @OneToMany lazily or eagerly loaded?
* Is @OneToOne lazily or eagerly loaded?
* Is @ManyToMany lazily or eagerly loaded?
* What is a proxy object?

## Spring
* What is inversion of control (IoC)?
* What is dependency injection?
* What is an inversion of control container?
* What are two examples of inversion of control containers in Spring?
* What are the most important differences between BeanFactory and ApplicationContext? Which one is used nowadays?
* What is a Spring Bean?
* What is the difference between Spring Modules and Spring Projects?
* What are some examples of Spring Modules?
* What are some examples of Spring Projects? Which very important one did we use for P2 and are using for P3?
* What 3 ways are there to configure Spring Beans?
* What is Java based configuration and the syntax for it? What two annotations are important for Java based configuration?
* What is annotation based configuration? What are the 4 "stereotype" annotations used for annotation based configuration?
* What are the 3 types of dependency injection in Spring?
* What is the purpose of the @Autowired annotation? What 3 things can we place this annotation on top of?
* What is Spring Boot?
* What does it mean for Spring boot to be `opinionated` and to have `convention over configuration`?
* How does Spring Boot's autoconfiguration work?
* What is one way to generate a Spring boot project?
* What is the application.properties file in a Spring Boot application?

## Spring Data
* Inside of the DAO layer, what object do we use to perform database related operations using JPA? (it is annotated with @PersistenceContext)
* What is a PersistenceContext?
* What is the purpose of the `@Transactional` annotation?

## Spring Web
* What is the difference between `@Controller` and `@RestController`?
* What is the purpose of `@ResponseBody`?
* What is the purpose of `@RequestBody`?
* What is the purpose of `@PathVariable`?
* What is the purpose of `@RequestParam`?
* What 6 annotations can we place onto methods to map them to endpoints?
* What design pattern does Spring Web use for controllers?
* What is the role of the DispatcherServlet?

## Spring Test
* What is the difference between unit and integration tests?
* What is an H2 database? Why do we use an H2 database for testing?
* Where should the properties file with the settings for the H2 database go (for testing purposes)?
* What is the purpose of the `@SpringBootTest` annotation? Why do we need this annotation for integration tests?
* Why might we need to use the `@DirtiesContext` annotation while doing DAO tests and integration tests?
* What is MockMvc?

## Spring AOP
- What is the purpose of AOP?
- What does AOP stand for?
- What is an Aspect?
- What is advice?
- What is a pointcut expression?
- What is a join point?
- What type of advice are there?
- What is the the most powerful advice?
