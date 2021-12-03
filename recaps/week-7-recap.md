# Week 7 Recap

## Day 1
- Mock interviews

## Day 2
- Mock interviews
- SonarCloud setup
    - [Github actions workflow .yml file](https://github.com/211018jwa/student-management-app-sprint1/blob/main/.github/workflows/build.yml)
        - [Modify branch name](https://github.com/211018jwa/student-management-app-sprint1/blob/main/.github/workflows/build.yml#L5)
        - [Modify mvn command](https://github.com/211018jwa/student-management-app-sprint1/blob/main/.github/workflows/build.yml#L36)
    - [pom.xml properties](https://github.com/211018jwa/student-management-app-sprint1/blob/main/gradify/pom.xml#L13-L15)
    - [Maven JaCoCo plugin](https://github.com/211018jwa/student-management-app-sprint1/blob/main/gradify/pom.xml#L74-L92)

## Day 3
- [Testing Mindset](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#testing-mindset)
    1. Start testing EARLY (documents)
    2. Test software to find defects
    3. 100% bug free is impossible
    4. Exhaustive testing is impossible
    5. Testing is context based
    6. Beware of the pesticide paradox
    7. Defects tend to cluster
- [Testing Lifecycle](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#testing-lifecycle)
- [Verification / static testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#verification)
- [Validation testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#validation)
    - [Functional testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#functional-testing)
        - [Whitebox v. blackbox](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#whitebox-v-blackbox-testing)
        - [Positive v. negative](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#positive--negative-testing)
        - [Exploratory testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#exploratory-testing)
        - [Exhaustive testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#exhaustive-testing)
        - [Equivalence partitioning and Boundary testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#equivalence-partitioning--boundary-testing)
        - [Re-testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#re-testing)
        - [Regression testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#regression-testing)
        - [Smoke testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#smoke-testing)
        - [Sanity testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#sanity-testing)
        - [Manual testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#manual-testing)
        - [Test automation](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#test-automation)
    - [Non-functional testing](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#non-functional-testing)
- [Defect Reporting](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#defects-and-defect-reporting)
    - [Defect report](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#defect-report)
    - [Defect categorization](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#defect-categorization)
- [Defect Lifecycle](https://github.com/211018jwa/training/blob/main/week-7/day-3/testing.md#defect-lifecycle)

## Day 4
- [Responsive website design demo](https://github.com/211018jwa/training/tree/main/week-7/day-4/responsive-design)
    - [media query examples](https://github.com/211018jwa/training/blob/main/week-7/day-4/responsive-design/style.css#L95-L142)
- [Singleton design pattern demo](https://github.com/211018jwa/training/blob/main/week-7/day-4/singleton-design-pattern-demo/src/com/revature/demo/Singleton.java#L18-L36)
- [Factory design pattern demo](https://github.com/211018jwa/training/blob/main/week-7/day-4/factory-design-pattern-demo/src/com/revature/demo/AnimalFactory.java#L3-L27)

# QC Study Guide
QC: Monday, December 6th

Topics: Week 4, 5, 7
- Week 4: Client side technologies (HTML, CSS, JavaScript)
    - [questions](https://github.com/211018jwa/training/blob/main/recaps/week-4-recap.md#questions)
- Week 5: AWS, Selenium, Cucumber, and DevOps
    - [questions](https://github.com/211018jwa/training/blob/main/recaps/week-5-recap.md#questions)
- Week 7: Testing concepts, Responsive web design, Java design patterns, Java lambdas, functional interfaces, comparable interfaces, comparable interface, comparator class

## Week 7 Questions
* What is SonarCloud?
* What is the process in setting up SonarCloud code scanning for a repository?
* What is Github Actions?
* What does the build.yml file do in the context of Github Actions?
* What do we set up inside the pom.xml for SonarCloud?
* What is the purpose of the JaCoCo Maven plugin?
* Summarizing the different testing mindset "bullet points", what is the mindset that a tester should have?
* **What are the phases in the testing lifecycle?**
* What is the difference between verification and validation?
* What are some of the activities involved with verification/static testing?
* What two sub-categories of testing is functional testing composed of?
* What are the 4 specific types of tests that make up the testing pyramid?
* What is whitebox testing?
* What is blackbox testing?
* Categorize unit, integration, E2E, and UAT by whether they are whitebox or blackbox for EACH
* What is a positive test?
* What is an example of a positive test?
* What is a negative test?
* What is an example of a negative test?
* What is exploratory testing?
* What is exhaustive testing? Is it feasible? How should a tester approach testing instead?
* Describe the test design strategies of `equivalence partitioning` and `boundary testing`
* What does re-testing mean?
* What is regression testing? Why is regression testing important?
* What is smoke testing? Why should smoke testing be performed before doing regression testing?
* How does regression testing relate with the objectives of DevOps?
* What is sanity testing?
* What is manual testing? Do you typically need a formal structure when doing manual testing or do you just randomly play around with the application?
* What is test automation?
* What is non-functional testing? What two subcategories did we cover?
* What is performance testing and what subcategories does it have?
* What is the purpose of usability testing?
* What is a defect/bug?
* What should a tester do when they find a defect?
* What are some of the fields that should be contained on a defect report?
* What levels of severity can defects have?
* What levels of priority can defects have?
* How is severity and priority different?
* What are the phases of the defect lifecycle?