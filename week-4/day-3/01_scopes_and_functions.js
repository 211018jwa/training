/*

    JavaScript is a dynamically typed language

    Variables can have any type they want
    We can have a variable store a string, but later store a number

    Datatypes:
        1. string
        2. boolean
        3. number
        4. undefined
        5. null
        6. object

*/

printVariable('Some String');

// Regular Function declaration: have a name
// Regular functions get hoisted to the top
// This means you can invoke printVariable even before the function has been declared
function printVariable(input) {
    console.log(input);
}

// Anonymous Function: functions that don't have a name
// In JavaScript (unlike in Java), functions are considered first-class citizens
// First class citizens can be
//  1. returned from a function
//  2. assigned to a variable
//  3. passed around as arguments



// Var variables are also hoisted. This means you can use myVariable even before you have declared it
// However, I cannot use this function before it has been declared, because anonymous functions will not be hoisted
// unlike regular functions, which makes sense because this is a value assignment to a variable
var myVariable = function(input) {
    console.log('Hello ' + input);
}

myVariable('John');

/*

    var v. let v. const

    Once upon a time, var was the only way to declare variables. However, with the introduction of ES6, let and const
    were introduced. ES6 stands for ECMAScript 6, which was a major update to the JavaScript programming language.

    ECMAScript is the standard for JavaScript. It contains the specifications for what the language should have.
    ECMA stands for European Computer Manufacturers Association, and is the body responsible for updating the ECMAScript
    standard

    ECMAScript is the standard
    JavaScript is the language

    ES6 Added some new important features:
        1. let keyword
        2. const keyword
        3. arrow functions
        4. promises


    Let and const give us an additional scope known as block scope. 
    
    Before this introduction, JavaScript only had, using the var keyword:
        1. global scope
        2. function scope

    Using let and const, we can have
        1. global scope
        2. function scope
        3. block scope
*/

z = 20;
console.log(z);

// z is global scoped

var z = 10; // var variables are hoisted to the top, meaning it is already available even before it has been declared
// This is just a side effect of regular function hoisting, and is not really in any way useful.

// x = 12; // CANNOT DO THIS, because let and const are not hoisted!
// x is global scoped
let x = 'some string';
x = 12;
console.log(x);


myRegularFunction();
function myRegularFunction() {
    let g = 'my function scoped variable\'s value'; // function scoped
    // This variable only exists within this function

    if (true) {
        let y = 'my block scoped variable\'s value'; // block scoped
        // y only exists within this block
        console.log(y);
        console.log(g);
        console.log(x);

        var myVar = 'abc'; // function scoped
        // var variables, if they are inside a function, will ALWAYS be function scoped
        // it doesn't matter if it's inside a block or not
        // var myVar is being hoisted to the top of the function
    }

}

// Recall that in Java, we have 4 scopes
// 1. static scope / global scope / class scope (variables that belong to a class)
// 2. instance scope (variables that belong to individual objects)
// 3. method scope (same as function scope)
// 4. block scope

// let and const are more in line with what we know about variable behavior in Java
// let and const are preferable to var nowadays as well
// So, always use let and const, but be aware of why we use let and const over var

var i = 100; // global 

// Print out the numbers 0 to 9
// i in the for loop is also global scoped
// meaning it is the SAME variable as the i above
for (var i = 0; i < 10; i++) {
    console.log(i);
}

console.log('i: ' + i); // 10

// Let
let j = 100; // global scoped variable

// j in the for loop is a block scoped variable
for (let j = 0; j < 10; j++) {
    console.log(j);
}

console.log('j: ' + j); // 100

// Const
const h = 10; // Once you assign a value to a const variable, you can't change its value. That's the only difference
// between let and const. Const has the ability to be block scoped just like let

// Recap on 2 types of functions:
//  1. Regular functions
//  2. Anonymous functions

// Introducing... the Arrow function
let myArrowFunction = (input1, input2) => {
    console.log(input1);
    console.log(input2);
};

myArrowFunction('abc', 'def');

/*
    Using objects w/ behaviors
*/
let person1 = {
    'firstName': 'Bach',
    'lastName': 'Tran',
    'greet': function() {
        // The 'this' keyword gets its meaning from whatever object is calling a particular function
        // At least in the case of regular + anonymous functions
        console.log(this.firstName + ' ' + this.lastName + ' says hi!');
    }
}

person1.greet(); // the 'this' keyword inside of the greet method is equal to person1, because we did person1.greet()

let person2 = {
    'firstName': 'Jane',
    'lastName': 'Doe'
}

// We are creating a new property, 'borrowedFunction' for the person2 object
// That property is pointing to the function that belongs to person1
// We are not creating a copy of that function, we are actually 'referencing' that original anonymous function
// Because, functions are objects in JS
person2.borrowedFunction = person1.greet;
person2.borrowedFunction();

/*
    The above behavior is NOT true for arrow functions.

    The 'this' keyword inside of arrow functions do not get its meaning from the object calling the method

    It gets its meaning from the 'lexical scope''s this
*/

// This example does not work the way that we would think that it should work initially, (without knowing how
// arrow functions utilize the 'this' keyword internally)
let person3 = {
    'firstName': 'John',
    'lastName': 'Doe',
    'greet': () => { // Arrow functions use the 'this' keyword from the scope in which the arrow function was defined
        console.log(this.firstName + ' ' + this.lastName + ' says hi!');
        console.log(this);
    }
}

person3.greet();

console.log(this); // The arrow function above will utilize the 'this' in which that arrow function was defined
// So, at the global scope level, the value of 'this' is a special object known as the 'Window' object
// Because firstName and lastName do not exist as properties of the Window object, it will print out
// undefined undefined says hi!

let person4 = {
    'firstName': 'Billy',
    'lastName': 'Joe',
    'greet': function() {
        
        console.log(this);

        // You can nest functions inside other functions in JS (but not in Java)
        // Arrow functions use the 'this' keyword from the scope that the arrow function was defined in
        // Therefore, because the scope the arrow function was defined in's 'this' keyword would be the object
        // invoking the function, the arrow function will also do the same
        let myArrowFunction = () => {
            console.log(`${this.firstName} ${this.lastName} says hi!`);
        }

        myArrowFunction();

    }
}

person4.greet();

/*

    In JavaScript, we can represent strings using:
        1. ' ' single quotes
        2. " " double quotes
        3. ` ` template literals: valuable for defining a string based on expressions

*/

let f = 'abc';
let myString1 = `${f} is the value of f`;
console.log('myString1: ' + myString1);

let myString2 = `${myFunction()} is the value returned from myFunction() and the value of f is ${f}`;
console.log(myString2);

function myFunction() {
    return 'def';
}
