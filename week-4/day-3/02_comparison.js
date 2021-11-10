
// When we are doing comparisons in JavaScript
// we have the same operators as in Java >, <, >=, <=, !, == 
// 
// But, we also have ===
// == does what is known as type coercion

// Type coercion
let someBoolean = '20' == 20; // the String is being "coerced" into a number, "20" == 20 -> 20 == 20 -> true
console.log(someBoolean);

// The above behavior may not be preferable, in which case we can use the === operator
// === is known as "strict comparison"
// it will not coerce one type into another
// If the types are different, it will evaluate to false

someBoolean = '20' === 20;
console.log(someBoolean);

/*
    Truthy and falsy

    JavaScript has the concept of truthy and falsy values. Java does not
*/

// Numbers: all numbers are true except for 0
if (1) {
    console.log('1 is treated as a truthy value');
}

if (-10) {
    console.log('-10 is treated as truthy');
}

if (0) {
    console.log('this will never print out, because 0 is falsy');
}

// Undefined is falsy
if (undefined) {
    console.log('this will never print out');
}

// null is falsy
if (null) {
    console.log('this will never print out');
}

// strings: an empty string is falsey ''
if ('') {
    console.log('this will never print out');
}

if ('asdfsdf') {
    console.log('This string is truthy');
}

let blankObject = {}
if (blankObject) {
    console.log('All objects are going to be truthy');
}