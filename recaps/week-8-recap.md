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
---

