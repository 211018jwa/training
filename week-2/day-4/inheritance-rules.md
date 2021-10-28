# Inheritance Rules: Classes v. Interfaces

- Classes can inherit ONLY ONE class
    - ex. `public class Dog extends Animal {}`
- Classes can, however, inherit multiple interfaces
    - ex. `public class Dog extends Animal implements Barkable, Fetchable {}`
    - In this case, inheriting ONE class and MULTIPLE interfaces
    - But you can always inherit interfaces by themselves

When we start looking at the Java docs for the Collections API, it can have a very extensive inheritance hierarchy