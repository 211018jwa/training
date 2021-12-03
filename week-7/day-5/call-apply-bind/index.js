// Objects
// Properties and behaviors
// JavaScript will represent these as key-value pairs

let person1 = {
    firstName: 'Bach', // firstName (key), 'Bach' (value)
    lastName: 'Tran', // lastName (key), 'Tran' (value)
    greet: function(punctuation) { // greet (key), function() { ... } (value)
        console.log(`${this.firstName} ${this.lastName} says hi${punctuation}`);
    },
    printThis: function() {
        console.log(this);
    }
}

person1.greet();
person1.printThis();

let person2 = {
    firstName: 'Jane',
    lastName: 'Doe'
}

/* Call and Apply */

// Call allows us to borrow a method from another object without
// specifying a new property in our object
person1.greet.call(person2, '!!!!!'); // Jane Doe says hi!
person1.printThis.call(person2); // prints out person2 object
// In other words, the call function is replacing the this keyword
// with person2 inside of the person1 object functions

// Apply is the same as call, but instead of varargs for the parameters
// being passed in, it is a single array of parameters instead
person1.greet.apply(person2, ['!!!!#$#']);

/* Bind */
// Bind allows you to "bind" function's this keyword to a particular
// object permanently

let greetBindedToPerson2 = person1.greet.bind(person2);
// new function called greetBindedToPerson2

greetBindedToPerson2('!!!!!!!!!');

function myFunc() {
    console.log(this);
}

let myBindedFunc = myFunc.bind(person2);

myFunc();
myBindedFunc();

/*

    Arrow functions treat the this keyword differently
    than named or anonymous functions

    It uses the this from the lexical scope

*/
let person3 = {
    firstName: 'Test',
    lastName: 'Test123',
    greet: function() {
        console.log(this);

        // The lexical scope of the arrow function is
        // the anonymous function
        // So it will use the this keyword from the anonymous function
        // Which gets it meaning from the object calling it
        let myArrowFunc = () => {
            console.log(`${this.firstName} ${this.lastName} says hi`);
        }

        myArrowFunc();
    }
}

person3.greet(); // undefined undefined says hi
