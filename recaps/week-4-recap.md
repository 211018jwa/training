# Week 4 Recap

## Day 1
* HTML Introduction
    - Non-self-closing tags
    - Self-closing tags
    - Attributes
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L3-L11)
* HTML page structure
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L17-L96)
    - DOCTYPE declaration
    - html
        - head
            - title
        - body
* Inline v. Block elements
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L68-L94)
* Heading elements (h1 ... h6)
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L23-L28)
* Paragraph tag
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L30-L31)
* Lists
    - unordered
    - ordered
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L33-L59)
* Images (img tag)
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L61-L62)
* Link / Anchor tag (a tag)
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-html/index.html#L64-L66)
* Ways to include styling
    - inline
    - external
    - internal
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/index.html#L9-L12)
    - [internal + external example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/index.html#L32-L40)
    - [inline example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/index.html#L45-L46)
* CSS Specificity
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/index.html#L14-L18)
* Class v. Id
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/style.css#L14-L39)
* Tag name selector
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/style.css#L6)
* Class selector
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/style.css#L41)
* Id selector
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/intro-to-styling/style.css#L49)
* CSS Box Model Demo
    - content
    - padding
    - border
    - margin
    - [demo](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-box-model/index.html)
* Importing external fonts from Google Fonts
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-box-model/index.html#L9-L10)
* CSS Units
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-box-model/index.html#L12-L25)
* Positioning
    - [relative example](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-box-model/index.html#L49-L56)
    - [absolute example](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-box-model/index.html#L72-L80)
* CSS Grid Demo
    - [grid container](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-grid/index.html#L10-L17)
    - [grid items](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-grid/index.html#L19-L57)
    - [demo](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-grid/index.html)
* Semantic elements
    - [notes](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-grid/index.html#L79-L98)
* Descendant Selector
    - [example](https://github.com/211018jwa/training/blob/main/week-4/day-1/css-grid/index.html#L70-L75)
* Maven Build lifecycle
    - validate
    - compile
    - test
    - package
    - integration-test
    - verify
    - install
    - deploy
    - [link to powerpoint](https://github.com/211018jwa/training/blob/main/week-4/day-1/maven-build-lifecycle.pdf)
* pom.xml configuration for .jar file build
    - Run `mvn package` in command line
    - Run program with `java -jar <jar file name>`
    - [link](https://github.com/211018jwa/training/blob/main/week-4/day-1/jdbc-demo-2/pom.xml#L50-L75)
        - Specify location of class with main method

# Questions
* What are self-closing tags v. non-self-closing tags?
* What are HTML attributes? What are some examples?
* What is tags make up the bare-bones structure of any HTML page?
* What are some basic HTML elements that we might use?
* What is the difference between inline and block elements? What are some examples?
* What are the 3 ways we can include CSS styling for our webpage?
* What tag and what 2 attributes for that tag are required to use external CSS?
* What is the difference between class and id?
* Can multiple elements have the same id?
* Can multiple elements have the same class?
* What is the syntax for the class selector in CSS?
* What is the syntax for the id selector in CSS?
* What is the syntax for the tag name selector in CSS?
* What is the descendant selector in CSS? How does the idea of parent and child elements tie into this?
* How is CSS styling propagated? Do nested child elements inherit CSS properties from its parent?
* If we have 2 conflicting styles, what is the order of specificity in which they are resolved?
* What 4 parts make up the CSS box model?
* What are the `px`, `em`, and `rem` units?
* How does relative and absolute positioning in CSS work?
* What are semantic elements and what are some examples?
* What is CSS grid used for? How would you describe how to use it?
* What are the phases in the Maven build lifecycle?