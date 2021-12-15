# Spring Test
Testing is an extremely important part of any software development. Spring provides a module called `spring-test`, which is also included with Spring Boot projects by default, which makes doing tests such as integration tests and dao layer tests easy. 

In particular, Spring test gives features such as allowing us to test a fully integrated system as a whole using features such as providing an **application context** and dependency injection.

Application Context: responsible for instantiating, storing, and configuring (wiring) all of our beans together.
- 3 tier application:
    - Controller
    - Service
    - Dao
- We want to have these layers wired together through the application context (IoC container), so that we can perform integration testing

# Annotations that go on top of Test classes
- `@SpringBootTest`: loads an entire application context (the entire app, just like when you run the Spring Boot application normally)
- `@WebMvcTest`: Loads only the necessary beans that the controllers depend on (such as the service beans, dao beans, etc.)
- `@DataJpaTest`: loads only the configuration for JPA. We can use this when doing DAO Unit tests