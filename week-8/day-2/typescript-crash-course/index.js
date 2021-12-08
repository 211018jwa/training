var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
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
var a;
a = "2 + 2 is: ".concat(2 + 2);
console.log(a);
// Type inferencing
var b = 'Another string'; // What type does b have here?
// b is a string type
// b = 123; // this does not work, because b can only store strings
var c; // c is of type 'any'
// Because we're just declaring the variable and not assigning an immediate value
c = 'string';
c = 123;
var d = 100;
console.log(d);
d = 'string12312312';
console.log(d);
d = { firstName: 'Billy' };
console.log(d);
var sentence = 'this is a sentence';
// sentence is of type string
// so VSCode is smart enough to help provide function recommendations for strings
console.log(sentence.charAt(2));
var notGuaranteedToBeStoringAStringValue = 'This is another sentence';
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
function namedFunction(a, b) {
    console.log("value of a is ".concat(a, ", and value of b is ").concat(b));
}
// 2 parameters:
// a: string
// b: number
// return type of void
var sub = function (a, b) {
    return a - b;
};
var add = function (a, b) {
    return a + b;
};
/**
 * Objects
 */
var person = {
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
};
/**
 * Interfaces in TS
 * - The idea of interfaces does not exist in JS, it was added with TS
 *
 * If we have a lot of properties to deal with, we can create an Interface that defines
 * a particular "object" type
 */
var p2; // More verbose
var p3;
p3 = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30
};
/**
 * Arrays
 *
 * We can specify arrays that can only contain a certain type of data
 */
var myPeople = [];
myPeople.push(p3);
myPeople.push({ firstName: 'testing', lastName: 'test', age: 30 });
var myStrings = ['string 1', 'string 2', 'string 3'];
/**
 * TypeScript classes
 */
var Animal = /** @class */ (function () {
    function Animal(age) {
        this.age = age;
    }
    return Animal;
}());
var animal1 = new Animal(20);
/**
 * TypeScript adds the idea of access modifiers
 *
 * public: we can access directly outside of the class
 * private: we can only access from within the class
 * protected: within the class or subclasses
 */
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog(name, age) {
        var _this = _super.call(this, age) || this;
        _this.name = name;
        return _this;
    }
    // by default, everything is public
    Dog.prototype.makeNoise = function () {
        console.log('Bark!');
    };
    Dog.prototype.getName = function () {
        return this.name;
    };
    return Dog;
}(Animal));
var d1 = new Dog('Fido', 3);
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
var Rectangle = /** @class */ (function () {
    function Rectangle(width, height) {
        this.width = width;
        this.height = height;
    }
    return Rectangle;
}());
var r = new Rectangle(10, 20);
console.log(r);
console.log(r.width);
console.log(r.height);
/**
 * Generics
 */
// Class generic
var MyWrapper = /** @class */ (function () {
    function MyWrapper(value) {
        this.value = value;
    }
    return MyWrapper;
}());
var wrapper1 = new MyWrapper(100);
var wrapper2 = new MyWrapper('a string');
// Function generics
function myFunc(value) {
    return [value];
} // this function is taking in a single value of type T, placing it into a new array
// of type T and returning that array
var numbers = myFunc(100);
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
var MyDecorator = function (target) {
    console.log(target);
};
// Decorators are technically functions in TypeScript
// But, these functions are "attached" to, or "decorate" something else
var Reimbursement = /** @class */ (function () {
    function Reimbursement() {
    }
    Reimbursement = __decorate([
        MyDecorator
    ], Reimbursement);
    return Reimbursement;
}());
