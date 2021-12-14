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
