# Week 2 Recap

## Day 1
### [Link to Day 1 powerpoint](https://github.com/211018jwa/training/blob/main/week-2/powerpoint.pdf)

* Inheritance
    - [link to examples](https://github.com/211018jwa/training/tree/main/week-2/inheritance-demo/src/com/revature/model)
        - [Animal class](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Animal.java)
        - [Dog class](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Dog.java)
        - [Cat class](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Cat.java)
        - [Lion class](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Lion.java)
* Polymorphism
    - [makeNoise overriding example](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Dog.java#L11-L24)
    - [overloading example](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Dog.java#L27-L38)
* Object class
    - [Java 8 Official documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
    - [notes](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/app/Application.java#L73-L103)
    - [hashCode()](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Animal.java#L32-L35)
    - [equals()](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Animal.java#L37-L48)
    - [toString()](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/model/Animal.java#L50-L53)
* Downcasting refresher
    - [link](https://github.com/211018jwa/training/blob/main/week-2/inheritance-demo/src/com/revature/app/Application.java#L36-L59)


# Question Practice
* What is the purpose of inheritance?
* What is a subclass / child class?
* What is a superclass / base class?
* What does the subclass inherit from the super class?
* What is the purpose of super()?
* What is method overriding?
* How is method overriding different than method overloading?
* If Dog extends Animal, can you use an Animal reference variable to point to a Dog object?
* If a method is first defined in the Dog class (not overridden from the Animal class), can we invoke that method from an Animal reference variable? If not, what do we need to do with that Animal reference variable? (hint: starts with down)
* What is special about the Object class?
* What methods does the Object class contain?
* What is the purpose of overriding the equals() method?
* If we do not override the equals() method, how does its implementation in the Object class work?
* What is the purpose of overriding the toString() method?
* If we do not override the toString() method, what does it do by default?