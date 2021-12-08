console.log('Hello TypeScript');

/**
 * As we know, there are many basic datatypes in JavaScript:
 *  1. string
 *  2. null
 *  3. boolean
 *  4. object
 *  5. undefined
 *  6. number
 */

/**
 * Within TypeScript, we can provide types for our variables
 * We can think of TypeScript as a strongly-typed version of JS
 * 
 * The main purpose of TS is to help us avoid bugs regarding the potential
 * mis-assignment of values to certain variables.
 * 
 * When we transpile from TS to JS, we are able to catch these issues early because
 * the transpiler will complain to us that we are trying to assign a string
 * to a number variable, for instance
 * 
 * Are there any speed or performance benefits with using TypeScript?
 * - No
 * - It simply makes our lives easier as developers
 * - Especially for those who come from strongly typed languages (like Java)
 * 
 * Because TypeScript is so widely utilized in various code editors, there are a lot
 * of intellisense features (auto-recommendations) and error linting benefits that
 * come with using TypeScript
 */

let a: string;
a = `2 + 2 is: ${2 + 2}`;
console.log(a);

// Type inferencing
let b = 'Another string'; // What type does b have here?
// b is a string type

// b = 123; // this does not work, because b can only store strings

let c; // c is of type 'any'
// Because we're just declaring the variable and not assigning an immediate value
c = 'string';
c = 123;

let d: any = 100;
console.log(d);
d = 'string12312312';
console.log(d);
d = { firstName: 'Billy' }
console.log(d);

let sentence = 'this is a sentence';
// sentence is of type string
// so VSCode is smart enough to help provide function recommendations for strings
console.log(sentence.charAt(2));


let notGuaranteedToBeStoringAStringValue: any = 'This is another sentence';

// Not type-safe, because if the variable were storing a number, charAt would not be
// applicable
notGuaranteedToBeStoringAStringValue.charAt(5);

/**
 * Functions in TypeScript
 * 
 * 1. Named functions
 * 2. Anonymous functions
 * 3. Arrow functions
 * 
 * Functions have parameters and a value that the function returns
 * Within TypeScript, we can enforce that a parameter must be a certain type
 * and that the return value must be a certain type
 */

function namedFunction(a: string, b: number): void {
    console.log(`value of a is ${a}, and value of b is ${b}`);
}
// 2 parameters:
// a: string
// b: number
// return type of void

let sub = function(a: number, b: number): number {
    return a - b;
}

let add = (a: number, b: number): number => {
    return a + b;
}

/**
 * Objects
 */

let person = {
    'firstName': 'Bach',
    'lastName': 'Tran',
    'age': 24
};
// { firstName: string, lastName: string, age: number }
// ^^ Not to be confused with an object
// The notation above is the type of the person variable
// "person is of an object type with a firstName property with a type of string,
// a lastName property with a type of string, and an age property with type of number"

// reassigning another object to the person variable that corresponds to the type
// of the person variable
person = {
    firstName: 'Jane',
    lastName: 'Doe',
    age: 26
}

/**
 * Interfaces in TS
 * - The idea of interfaces does not exist in JS, it was added with TS
 * 
 * If we have a lot of properties to deal with, we can create an Interface that defines
 * a particular "object" type
 */

let p2: { firstName: string, lastName: string, age: number }; // More verbose

// Interfaces are how you create custom "types" for your variables
// particularly for objects that should have certain properties
interface Organism {
    age: number
}

interface Person extends Organism {
    firstName: string,
    lastName: string,
}

let p3: Person;

p3 = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30
}

/**
 * Arrays
 * 
 * We can specify arrays that can only contain a certain type of data
 */
let myPeople: Person[] = [];

myPeople.push(p3);
myPeople.push({ firstName: 'testing', lastName: 'test', age: 30 });

let myStrings: string[] = ['string 1', 'string 2', 'string 3'];

/**
 * TypeScript classes
 */

class Animal {
    age: number;

    constructor(age: number) {
        this.age = age;
    }
}

let animal1: Animal = new Animal(20);

/**
 * TypeScript adds the idea of access modifiers
 * 
 * public: we can access directly outside of the class
 * private: we can only access from within the class
 * protected: within the class or subclasses
 */
class Dog extends Animal {

    private name: string;

    constructor(name: string, age: number) {
        super(age);
        this.name = name;
    }

    // by default, everything is public
    makeNoise() {
        console.log('Bark!');
    }

    getName() {
        return this.name;
    }

}

let d1: Dog = new Dog('Fido', 3);
d1.makeNoise();
console.log(d1.getName());

// This class has 2 properties: width and height
// Notice that we are not declaring these properties explicitly within our class
// body
// We are not even explicitly writing code that will assign values to those properties
// inside the constructor
// This is possible because of shorthand notation as we see below,
// where we have the access modifiers declared directly in the parameter list
// of the constructor
class Rectangle {

    constructor(public width: number, public height: number) {
    }

}

let r: Rectangle = new Rectangle(10, 20);
console.log(r);
console.log(r.width);
console.log(r.height);

/**
 * Generics
 */

// Class generic
class MyWrapper<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }
}

let wrapper1 = new MyWrapper<number>(100);
let wrapper2 = new MyWrapper<string>('a string');

// Function generics
function myFunc<T>(value: T): T[] {
    return [ value ];
} // this function is taking in a single value of type T, placing it into a new array
// of type T and returning that array

let numbers: number[] = myFunc<number>(100);
numbers.push(200342);
console.log(numbers);

/**
 * Decorators are something you see all the time in Angular
 * @Component
 * @NgModule
 * ...
 * 
 * Decorators look similar to Annotations in Java, but they actually work 
 * significantly differently
 * 
 * But, in both cases, decorators are typically used to add additional information
 * to whatever is being annotated
 */

const MyDecorator = (target: any) => {
    console.log(target);
}

// Decorators are technically functions in TypeScript
// But, these functions are "attached" to, or "decorate" something else

// MyDecorator is invoked, and the class itself is passed into the target parameter
// From there, the target is printed out
@MyDecorator
class Reimbursement {

}