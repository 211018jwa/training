/*

    JavaScript is a programming language that often has similar syntax to Java.
    However, they are totally different programming languages with many important differences.
    They are not related.

    So, if they are different, why do they both have the name 'Java' in them? 
        At that time, Java was a really popular programming language, so the creator of JavaScript decided to put Java
        in its name. It was a marketing gimmick to get more people to start using JavaScript.

    One of those differences is the fact that JavaScript is dynamically typed instead of statically typed (not to be confused with the static keyword in Java)

    There are several datatypes in JS:
    1. boolean: primitive
    2. string: primitive
    3. number: primitive
    4. undefined
    5. null (technically an object)
    6. object

*/

// Undefined: means that you have not yet assigned a value to a variable that was declared
var y;
console.log('y: ' + y);

// null: absence of an object for a variable intended to be used for objects

console.log('Hello world!');

/*

    Dynamic Typing in Action

*/
var x = 'Hello world'; // string
x = 10; // number
x = true; // boolean
x = null; // null
x = undefined; // undefined
x = { 
        'firstName': 'Bach',
        'lastName': 'Tran'
    } // object

/*

    Control flow:
    1. if statements (else if, else)
    2. switch statements
    3. for loops
    4. while loops
    5. do-while loops

*/
var someBoolean = true;

// if statements
if (someBoolean) {
    console.log('someBoolean is true');
} else {
    console.log('someBoolean is false');
}

var someNumber = 10;

// switch
switch(someNumber) {
    case 1:
        console.log('It is January');
        break;
    case 2:
        console.log('It is February');
        break;
    default:
        console.log('It is not January or February');
}

// for loops
for (var i = 0; i < 100; i++) {
    console.log(i);
}

// while loops
var counter = 0;
while (counter < 99) {
    console.log(counter);
    counter = counter + 1;
}


// do-while loops
// guaranteed to execute at least once
var y = 123123;
do {
    console.log('inside do-while block')
} while (y < 100);


/*

    Simple object example

    Whenever a variable is pointing to an object, it behaves similarly to in Java
    The variable does not contain the object itself, it "points" to the location of the object
    in the heap

    Unlike in Java, we don't need to use "blueprints" to create objects. There is no need to create a class
    But, you are still instantiating an object when you use object literal syntax '{ }'

*/

var person1 = {
    'firstName': 'John',
    'lastName': 'Doe',
    'age': 18
} // We are instantiating an object, and we are providing this object with 3 initial properties and values

// 2 ways of accessing the properties from an object
console.log(person1.firstName);
var myString = 'lastName';
console.log(person1[myString]); // dynamic accessing of a particular property from the object

var p = person1; // p and person1 are pointing to the same object
p.firstName = 'Jane';

console.log(person1.firstName); // Jane

var person2 = {
    'firstName': 'Bach',
    'lastName': 'Tran',
    'age': 23
};

console.log(person2.firstName);

// Unlike in Java, where we require classes and need to define a blueprint, here in JavaScript, you can actually add 
// properties at Runtime (while the program is running)

person2.newProperty = 'some value';
person2.yetAnotherNewProperty = 'asdfasdflkdjslk';
person2['dfdsfdfkjlkj'] = 453;

// for (var i = 0; i < 5; i++) {
//     var newProperty = prompt('Choose a property name to add to this object: ');
//     var stringValue = prompt('Choose a value you want for that property: ');
//     person2[newProperty] = stringValue;
// }

console.log(person2);


var person3 = {
    'firstName': 'Michael',
    'lastName': 'Liu',
    'greet': function() { // anonymous function (a function with no name)

        console.log(this.firstName + ' ' + this.lastName + ' says hi!');

    }
}

person3.greet();