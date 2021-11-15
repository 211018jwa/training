
let pokemonIdInputElement = document.querySelector('#pokemon-id-input');
let getPokemonButtonElement = document.querySelector('#get-pokemon');

function onGetPokemonButtonClick_traditionalPromiseHandling() {
    // We will use a String "template literals" `` (backticks)
    // the fetch function allows us to send an HTTP request to an endpoint
    // By default, it will send a GET request unless we specify otherwise
    // Fetch is part of the WEB APIs, which will place a callback function into the callback queue
    // whenever the HTTP response from the server is received
    let fetchPromise = fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonIdInputElement.value}`);

    // the fetch function will return a "Promise"

    // Promises were introduced in ES6, just like Arrow functions, let and const, and many other important
    // features

    // Definition: a promise is something that is promised to happen in the future
    //  Two states that could happen when a promise is RESOLVED:
    //      1. The promise is "resolved" (everything went well)
    //      2. The promise is "rejected" (something went wrong)
    //
    //  When a promise is "resolved", the data is passed into the callback function specified
    //      inside the .then() function
    // 
    //  When a promise is "rejected", the data is passed into the callback function specified 
    //      inside the .catch() function

    fetchPromise.then((res) => {
        if (res.status === 404) {

            // Here is a custom promise I created, so
            // that when we get a 404 not found, it will reject this promise
            // and then the message will be passed to the catch callback function
            return new Promise((resolve, reject) => {

                // Whatever you put into the resolve or reject function inside of a promise
                // is what gets passed into the callback function for .then or .catch
                reject(`Pokemon with the provided id ${pokemonIdInputElement.value} was not found`);
            });

        } else {
            return res.json();
        }
    }).then((data) => { // res.json() returns yet another promise, so this .then here deals with that new promise
        displayPokemonImage(data);
    }).catch((err) => {
        console.log(err);
    });
}

// You MUST declare the function as async to use the await keyword
// await is what retrieves the resolved promise's value
// so, you "await promises" for the success value
// if the promise is rejected, then the code will enter the catch block
async function onGetPokemonButtonClick_asyncAwait() {
    

    /*
        Using "await" (modern)
    */

    try {
        let res = await fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonIdInputElement.value}`);

        if (res.status === 404) {
            throw `Pokemon with the provided id ${pokemonIdInputElement.value} was not found`;
        }

        let data = await res.json();
        displayPokemonImage(data);
    } catch(err) {
        console.log(err);
    }

}



getPokemonButtonElement.addEventListener('click', onGetPokemonButtonClick_asyncAwait);

function displayPokemonImage(pokemon) {
    let containerElement = document.querySelector('#container');
    let imgElement = document.createElement('img');

    let imgUrl = pokemon.sprites.front_default;
    imgElement.setAttribute('src', imgUrl);

    containerElement.appendChild(imgElement);
}
