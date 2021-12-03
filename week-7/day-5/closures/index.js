/*

    Recap: 3 different ways to declare functions
    1. Named function
    2. Anonymous function
    3. Arrow function

*/

function myFunction() {
}

let anonFunction = function() {
}

let arrowFunction = () => {
}

// Closures: closures will work will all types of functions

// Here we will use an anonymous function
let functions = (function() {
    let x = 50;

    function getX() {
        return x;
    }

    function setX(param) {
        x = param;
    }

    return [getX, setX]; // Return an array that contains 
    // the getX and setX functions
})(); // IIFE (Immediately invoked function expression)

// the functions variable is referring to an array that contains
// our two functions, getX and setX from inside the anonymous function

functions[1]('my string 1'); // invoking setX w/ 'my string 1' 
// as the argument

console.log(functions[0]()); // printing out the return value
// of getX (after invoking getX)

/*
    MDN web docs

    "A closure is the combination of a function bundled together
    with references to its surrounding state (the lexical environment)"

    "A closure is a function that captures variables from where it is defined"
*/

// Once upon a time, developers would have made extensive use of IIFE in order to
// create "modules" of code
// The state of the variables inside of these IIFEs would then only be able to be changed
// whenever you provided return values from that IIFE in the form of getter/setter functions
