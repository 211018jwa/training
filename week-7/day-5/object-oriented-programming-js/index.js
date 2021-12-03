/*

Objects
- Properties
- Behaviors

Ways to create objects:
1. Object literals {}
2. Function constructors


*/

// Object literals
let person1 = {
    // ...
    // key-value pairs
    firstName: 'Bach',
    lastName: 'Tran',
    greet: function() {
        console.log(`${this.firstName} ${this.lastName} says hi!`)
    }
}

// Function constructor
function Person(fn, ln) {
    this.firstName = fn;
    // We have an object referenced using
    // the 'this' keyword
    // We are adding a new property to that
    // object called firstName
    // and giving it a value of fn
    this.lastName = ln;
    // same with this.lastName = ln;

    // Do not define functions like this inside of 
    // your function constructors
    // Because, if you create 100 Person objects, for example,
    // You will in effect be creating 100 individual functions
    // This is a waste of memory and is extra overhead in our
    // application
    // this.greet = function() {
    //     console.log(`${this.firstName} ${this.lastName} says hi!`)
    // }
}

// JavaScript makes use of a concept called prototypal inheritance
// Whenever we use function constructors (which will serve as blueprints
// of objects), we can add properties that we would like other objects
// to be able to inherit to the function constructor's prototype
// property
Person.prototype.greet = function() {
        console.log(`${this.firstName} ${this.lastName} says hi!`)
    }

let person2 = new Person('Jane', 'Doe');
console.log(person2);
person2.greet();
// when I create the person2 object using the function constructor,
// person2 is inheriting all of the properties
// from the function constructor's prototype object

// We can examine the prototype key belonging to the Person
// function constructor
console.log(Person.prototype);

/* 
    Let's revisit call, apply, bind
    In particular, we'll make use of call
*/

// This is equivalent to using the 'new' keyword
// let person3 = new Person('John', 'Doe');
let person3 = {};
Person.call(person3, 'John', 'Doe');
person3.__proto__ = Person.prototype; // inheritance

console.log(person3);
person3.greet();


// Another example of prototypal inheritance
let obj1 = {
    someFunc: function() {
        console.log('inside someFunc()');
    }
}

let obj2 = {};
obj2.__proto__ = obj1; // whatever __proto__ points to is the object
// you inherit the key-value pairs from
obj2.someFunc();

/*
    ES6 classes

    behind the scenes, the way inheritance works in JS is
    through prototypal inheritance

    If you want to have blueprints that you construct objects from
    instead of using string literals, you use Function constructors

    ES6 did introduce this concept of a class, but classes in JS
    are not really "real". They are instead considered 
    "syntactical sugar"

    Syntactic sugar = syntax that makes things "sweeter" for human use:
        readability and expressability
*/
class Student {

    // We have two parts
    // 1. the constructor block where properties are set
    // 2. the various functions we want the objects to have
    constructor(fn, ln, a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
    }

    greet() {
        console.log(`${this.firstName} ${this.lastName} says hi!`);
    }
}

const s1 = new Student('John', 'Doe', 18);
console.log(s1);


/*
    Other syntax associated with classes
*/
class Rectangle {
    constructor(w, h) {
        this._width = w;
        this._height = h;
    }

    // Getters and setters in JS

    // Area is NOT a property of this object
    // it is simply a calculation of the width and height
    get area() {
        console.log('area getter invoked')
        return this._width * this._height;
    }

    // Getters and setters for our properties
    get width() {
        console.log('width getter invoked');
        return this._width;
    }

    get height() {
        console.log('height getter invoked');
        return this._height;
    }

    set height(h) {
        console.log('height setter invoked');
        this._height = h;
    }

    set width(w) {
        console.log('width setter invoked');
        this._width = w;
    }
}

let rect1 = new Rectangle(10, 15);
console.log(rect1.area); // area looks like a property. But is NOT
// actually a property! It's a function

console.log(rect1.width); // using getter
console.log(rect1.height); // using getter

rect1.height = 20; // using setter
rect1.width = 100; // using setter

console.log(rect1.area); // using getter