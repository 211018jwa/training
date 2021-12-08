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

