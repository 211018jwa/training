// let button = document.querySelector('#btn');

let button = document.getElementById('btn');

// Utilize the WebAPIs that the browser provides
// addEventListener allows us to instruct the browser to listen for a click event
// AT any time (on a different thread than this thread that is executing
// the JS), and when that event occurs, place the callback function
// into the callback queue
function thisIsACallbackFunctionThatWillBeInvoked() {
    console.log('button clicked!');
}

button.addEventListener('click', thisIsACallbackFunctionThatWillBeInvoked);

// Whenever we click the button, the stack first needs to be empty so that
// the event loop will be able to place the callback function from the
// callback queue into the stack