# Week 8 Recap

## Day 1
- [JavaScript execution](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-to-angular.pdf)
    - In the browser
        - V8 engine
    - Standalone runtime environment
        - Node.js
            - V8 engine as well
            - Comes with npm (node package manager)
- [TypeScript Introduction](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-angular.md#typescript)
- [Single Page Application](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-angular.md#single-page-application-spa)
- [Node.js](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-to-angular.pdf)
- Node Package Manager
    - [Markdown notes](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-angular.md#node-package-manager)
    - [Notes in ]
- [Installing Angular CLI](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-to-angular.pdf)
- [Creating a new Angular project](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-to-angular.pdf)
- Important files/directories in Angular project
    - node_modules directory
    - package.json
    - package-lock.json
    - angular.json
    - src directory
    - etc.
- [Angular bootstrapping process](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-to-angular.pdf)
- Angular component files
    - [powerpoint notes](https://github.com/211018jwa/training/blob/main/week-8/day-1/intro-to-angular.pdf)
    - Demo
        - [<>.component.html](https://github.com/211018jwa/training/blob/main/week-8/day-1/my-first-angular-project/src/app/app.component.html)
        - [<>.component.css](https://github.com/211018jwa/training/blob/main/week-8/day-1/my-first-angular-project/src/app/app.component.css)
        - [<>.component.ts](https://github.com/211018jwa/training/blob/main/week-8/day-1/my-first-angular-project/src/app/app.component.ts)
- [@Component decorator example](https://github.com/211018jwa/training/blob/main/week-8/day-1/my-first-angular-project/src/app/app.component.ts#L29-L33)
    - `selector`
    - `templateUrl`
    - `styleUrls`

## Day 2
- TypeScript Crash Course
    - [Declaring a variable with a type](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L34)
    - [Type inferencing](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L39)
    - [Declaring variable without type or assigning value](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L44)
        - type `any`
    - [Explicitly giving a variable type any](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L49)
    - [Function examples](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L80-L94)
        - typed parameters
        - return type
    - [Variable with specific object type](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L127)
    - [Interface example](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L129-L146)
    - [Array examples](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L148-L158)
    - [Class example](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L160-L172)
    - [Access modifiers](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L174-L203)
    - [Class property shorthand](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L213-L223)
    - [Generics](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L225-L249)
    - [Decorators](https://github.com/211018jwa/training/blob/main/week-8/day-2/typescript-crash-course/index.ts#L251-L276)
- One way databinding
    - [types of one-way databinding](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/password-generator/password-generator.component.html#L1-L7)
    - [one-way databinding syntaxes](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/password-generator/password-generator.component.html#L10-L28)
    - [password generator component demo](https://github.com/211018jwa/training/tree/main/week-8/day-2/one-way-databinding-app/src/app/password-generator)
        - [template](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/password-generator/password-generator.component.html#L30-L41)
        - [component class](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/password-generator/password-generator.component.ts#L8-L34)
    - [image viewer component demo](https://github.com/211018jwa/training/tree/main/week-8/day-2/one-way-databinding-app/src/app/password-generator)
    - [poke component demo](https://github.com/211018jwa/training/tree/main/week-8/day-2/one-way-databinding-app/src/app/poke)
        - [Pokemon interface file](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/Pokemon.ts)
        - [importing the Pokemon interface](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/poke/poke.component.ts#L3)
        - [Using variable of `Pokemon` type](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/poke/poke.component.ts#L12-L16)
    - Component lifecycle
        - [notes](https://github.com/211018jwa/training/blob/main/week-8/day-2/component-lifecycle.md)
        - [demo](https://github.com/211018jwa/training/blob/main/week-8/day-2/one-way-databinding-app/src/app/demo/demo.component.ts#L10-L28)

## Day 3
- Review of one-way databinding
    - [Component demo](https://github.com/211018jwa/training/tree/main/week-8/day-3/two-way-databinding/src/app/one-way-db-demo)
- Two-way databinding
    - Setup process
        1. [Import FormsModule into module .ts file](https://github.com/211018jwa/training/blob/main/week-8/day-3/two-way-databinding/src/app/app.module.ts#L3)
        2. [Add FormsModule to the imports property of @NgModule decorator](https://github.com/211018jwa/training/blob/main/week-8/day-3/two-way-databinding/src/app/app.module.ts#L19)
    - [Component demo](https://github.com/211018jwa/training/tree/main/week-8/day-3/two-way-databinding/src/app/two-way-db-demo)
        - [`[(ngModel)]` syntax](https://github.com/211018jwa/training/blob/main/week-8/day-3/two-way-databinding/src/app/two-way-db-demo/two-way-db-demo.component.html#L4)
        - [linked to variable in component class](https://github.com/211018jwa/training/blob/main/week-8/day-3/two-way-databinding/src/app/two-way-db-demo/two-way-db-demo.component.ts#L10)
- Directives
    - [General notes](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/structural-directives-demo/structural-directives-demo.component.html#L2-L4)
    - Structural directives
        - [3 types (notes)](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/structural-directives-demo/structural-directives-demo.component.html#L9-L13)
        - [*ngIf demo](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/structural-directives-demo/structural-directives-demo.component.html#L15-L18)
        - [*ngFor demo](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/structural-directives-demo/structural-directives-demo.component.html#L22-L39)
        - [*ngSwitch demo](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/structural-directives-demo/structural-directives-demo.component.html#L43-L145)
    - Attribute Directives
        - [2 types (notes)](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/attribute-directives-demo/attribute-directives-demo.component.html#L1-L16)
        - [`[ngClass]` demo](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/attribute-directives-demo/attribute-directives-demo.component.html#L19-L32)
        - [`[ngStyle]` demo](https://github.com/211018jwa/training/blob/main/week-8/day-3/directives/src/app/attribute-directives-demo/attribute-directives-demo.component.html#L36-L43)

## Day 4
- [Pipe demo angular project](https://github.com/211018jwa/training/tree/main/week-8/day-4/pipe-demo)
    - [Built in currency pipe example](https://github.com/211018jwa/training/blob/main/week-8/day-4/pipe-demo/src/app/app.component.html#L2)
    - [MphToKphPipe pipe example](https://github.com/211018jwa/training/blob/main/week-8/day-4/pipe-demo/src/app/mph-to-kph.pipe.ts)
        - [Using the pipe in the HTML template](https://github.com/211018jwa/training/blob/main/week-8/day-4/pipe-demo/src/app/app.component.html#L10)
- Component to Component Communication
    - 3 components
        - App component
        - Addition component
        - Addition history component
    - `@Output` decorator in Addition component
        - [link](https://github.com/211018jwa/training/blob/main/week-8/day-4/component-to-component/src/app/addition/addition.component.ts#L14-L15)
        - [emitting the custom `add` event](https://github.com/211018jwa/training/blob/main/week-8/day-4/component-to-component/src/app/addition/addition.component.ts#L27)
    - Utilizing event binding from parent component on `add` custom event created using `@Output` decorator in Addition component
        - [link](https://github.com/211018jwa/training/blob/main/week-8/day-4/component-to-component/src/app/app.component.html#L8)
    - `@Input` decorator in Addition History Component
        - [link](https://github.com/211018jwa/training/blob/main/week-8/day-4/component-to-component/src/app/addition-history/addition-history.component.ts#L10-L11)
        - Utilizing property binding to pass information into the Addition History Component using the custom `h` property created using `@Input`
            - [link](https://github.com/211018jwa/training/blob/main/week-8/day-4/component-to-component/src/app/app.component.html#L3)
- [Poke Service example](https://github.com/211018jwa/training/blob/main/week-8/day-4/service-demo/src/app/poke.service.ts)
    - [HttpClient being injected into PokeService](https://github.com/211018jwa/training/blob/main/week-8/day-4/service-demo/src/app/poke.service.ts#L13-L15)
    - [PokeService being injected into AppComponent](https://github.com/211018jwa/training/blob/main/week-8/day-4/service-demo/src/app/app.component.ts#L18-L20)
- [Creating a routing module](https://github.com/211018jwa/training/blob/main/week-8/day-4/routing-demo/src/app/app-routing.module.ts)
    - [Specifying routes and guards](https://github.com/211018jwa/training/blob/main/week-8/day-4/routing-demo/src/app/app-routing.module.ts#L10-L12)
    - [Trainer Auth guard example](https://github.com/211018jwa/training/blob/main/week-8/day-4/routing-demo/src/app/trainer-auth.guard.ts)
    - [Associate Auth guard example](https://github.com/211018jwa/training/blob/main/week-8/day-4/routing-demo/src/app/associate-auth.guard.ts)
- [Subject Demo project](https://github.com/211018jwa/training/tree/main/week-8/day-4/subject-demo)
    - [Poke Service](https://github.com/211018jwa/training/blob/main/week-8/day-4/subject-demo/src/app/poke.service.ts)
    - [Publishing data to subject when received](https://github.com/211018jwa/training/blob/main/week-8/day-4/subject-demo/src/app/poke.service.ts#L23)
    - 3 Components subscribing to the subject
        - [PokemonViewerComponent](https://github.com/211018jwa/training/blob/main/week-8/day-4/subject-demo/src/app/pokemon-viewer/pokemon-viewer.component.ts#L21-L23)
        - [PokemonHistoryComponent](https://github.com/211018jwa/training/blob/main/week-8/day-4/subject-demo/src/app/pokemon-history/pokemon-history.component.ts#L21-L23)
        - [JsonViewerComponent](https://github.com/211018jwa/training/blob/main/week-8/day-4/subject-demo/src/app/json-viewer/json-viewer.component.ts#L17-L19)


# Questions
* What JavaScript engine does Chrome use for executing JS in the browser?
* How can we run JS outside of the browser?
* What is Node.js? What is the primary reason we need Node.js when developing Angualar applications?
* What is npm?
* What is the importance of the `package.json` file?
* What is the `scripts` property in the package.json file?
* What command do we use to run an individual script?
* What is the difference between `dependencies` and `devDependencies`?
* What is Angular CLI used for?
* What does CLI stand for?
* How do we install Angular CLI?
* How do we create a new Angular project using Angular CLI?
* What is the purpose of the node_modules folder inside an Angular project or any node project?
* Should the node_modules folder be pushed to Github? Why or why not?
* If another developer wants to collaborate, they need to clone the repository with the project. What command do they need to run to ensure that all necessary dependencies are installed to their local copy of the project?
* Describe the startup/bootstrap process for an Angular application whenever it is first ran on the computer
* What files make up a component? Describe the purpose of these 3 files
* What file is the @Component decorator located inside of and what 3 important properties does it have?
* Which of the 3 @Component properties is useful for helping us figure out what tag we need to use to display a component within another component?
* What is the parent-most component in an Angular app?
---
* What is the syntax for declaring a variable of a particular type in TypeScript?
* If we declare and assign some value to the variable on the same line without specifying the type explicitly of the variable, what type will that variable be? (Type inferencing)
* If we declare a variable with the `any` type, what does any mean?
* What would a function in TypeScript look like in terms of the parameters?
* How do you specify a return type for a TypeScript function?
* What return type should you specify if you create a function that doesn't return anything?
* What is the syntax declare a variable with the type being a string array?
* What is the purpose of an interface in TypeScript?
* What is the shorthand syntax for a TypeScript class where we can define properties and have the constructor be able to assign values to those properties without needing to type everything out explicitly?
* What access modifiers does TypeScript have?
* If we need to declare a variable with a type being an object with a massive number of properties or complicated nested structures, especially if other variables will be using that same type, what is the best practice in creating a "type" for it?
---
* What types of one-way databinding are there?
* What is the purpose of string interpolation, and what is the syntax?
* What is the purpose of property binding, and what is the syntax?
* What is the purpose of event binding, and what is the syntax?
* What lifecycle hooks are part of the component lifecycle?
* What is the component lifecycle?
* What type of HTML element is two-way databinding used with?
* How does two-way databinding help to simplify the process of coupling the value of input elements with a variable in the component class?
* What is the syntax for two-way databinding?
* What is the process to set up two way databinding?
* What two types of directives are there?
* What are the 3 structural directives?
* What is the purpose of *ngIf?
* What goes in the quotation marks for `*ngIf=""`?
* What is the purpose of *ngFor? What does the syntax look like?
* What is the purpose of *ngSwitch and what is its syntax?
* What are the 2 attribute directives?
* What is the purpose of each of the 2 attribute directives?