# Testing Mindset
1. Start testing EARLY
    - Testing isn't necessarily only on the software itself
    - It starts with the requirements
        - Do the requirements have any fallacies or contradictions
        - If the requirements have any errors, those could become defects and show up in the application itself later
    - Proactive collaboration w/ other members of the team during earlier phases of the SDLC
2. Test software to find defects
3. 100% Bug free is impossible
    - A tester should never say that an application is "bug-free", regardless of what others might want to hear
    - A more realistic response to someone asking about the state of an application is to say that "we have conducted testing on X, X, and X, and did not find any defects"
4. Exhaustive testing is impossible
    - Exhaustive testing: testing many different combinations of inputs, sequences of button presses, etc.
        - All possible permutations
    - It is impractical to do so
    - 10 buttons -> 10! 3628800 (possible orderings)
    - "Work smart, not hard"
        - Test the scenarios that most ordinary users would be taking for an application first, then move to the more niche cases later
5. Testing is context based
    - What type of application? What company? 
    - ex. Banking application
        - Government regulations
        - Subject to audits
6. Beware of the pesticide paradox
    - In the long run as the software matures and becomes more stable, if we are executing the same test cases over and over again, these same test cases are less and less likely to discover defects from build to build in the future
    - We need to continuously update and design new test cases to find new defects
    - Analogy to pesticides comes from bugs evolving resistance = new pesticides required
7. Defects tend to cluster
    - "80% of the defects are found in 20% of the modules"
    - Save time by focusing on the most defect prone modules

# Revisiting the SDLC (Software development lifecycle)
The software development lifecycle (SDLC), if you recall is composed of 7 different phases:
1. Planning phase
2. Requirements phase: gather requirements from customer, other stakeholders
3. Analysis phase: analyze the requirements
4. Design phase
5. Development phase
6. Testing phase
    - Testing lifecycle is contained within this SDLC phase
7. Deployment phase
8. Maintenance phase

- Waterfall
- Agile
    - Scrum
    - Kanban
    - Scrumban
    - Extreme programming
    - etc.

# Testing Lifecycle
The testing phase in the SDLC can be broken down into the **testing lifecycle**.

1. Requirements analysis phase
    - Gather and analyze requirements
    - Review project documents, structure, code, etc.
2. Test planning phase
    - Answer the questions
        - What to test?
        - How to test?
        - When to test?
    - Activities
        - Resource identification
        - Cost/time estimation
        - Team structuring
        - Test plan document preparation
    - Inputs
        - User requirements
        - Project documents
    - Outputs
        - Test plan document
3. Test design phase
    - Activities
        - Prepare test scenarios
        - Prepare test cases
        - Review test cases
        - Create traceability matrix
    - Input
        - User requirements
        - Project documents
        - Test plan
    - Output
        - Test case document
        - Traceability matrix
            - Document that links the test cases to a business requirement (user story)
4. Test execution phase
    - Activities
        - Executing the test cases
            - automated or manual
        - Identifying defects
        - Preparation of test report/test log
    - Input
        - User requirements
        - Test plan
        - Test cases
        - Software build to be tested from the dev team
    - Output
        - Test status/reports
            - How many tests succeeded/failed
5. Defect reporting/tracking phase
    - Ties in with the **defect lifecycle**
    - Activities
        - Preparation of defect report
        - Reporting defects to developers
    - Inputs
        - Test cases
        - Test reports/test logs
    - Outputs
        - Defect reports
6. Test cycle closure phase
    - Activities
        - Analyzing test reports
        - Analyzing bug reports
        - Evaluating exit criteria (are we done?)
    - Inputs
        - Test reports
        - Bug reports
    - Output
        - Test summary report

# Types of Testing
Testing, if you recall, is the process whereby we **verify** and **validate** the software that we are building.

# Verification
Processes where we check if we are building the correct product/software
- Focus on documentation to ensure that there are no mistakes or miscommunications
- Catch issues early before they make their way into the software being built
- Known as **static testing**

## Static Testing
Made up of different activities in the following categories:
1. Review: check for correctness and completeness of the documents
    - Requirements reviews
    - Design reviews
    - Code reviews
    - Test plan reviews
    - Test case reviews
2. Walkthrough: Informal review
    - Author reads documents or code and discusses with other team members
    - "Coffee break talk"
    - Not pre-planned and can be done at any time
3. Inspection
    - Formal review
    - 3 - 8 people (usually the whole team if we are working in a Scrum environment)
    - Three roles
        - Reader: reads the document to check for potential defects
        - Writer: logs any defects / questions / clarifications that the reader finds
        - Moderator: organizes the meeting and is the mediator between writer, reader, and the rest of the team
    - Has a proper schedule

# Validation
Processes where we check if we are building the product/software correctly according to the documentation
- What we usually think of as "software testing"
- Focus on software
- 2 broad categories beneath this
    - Functional testing
    - Non-functional testing

# Functional Testing
Functional testing is a category of **validation testing** whereby we validate that the functionality of the software is working in accordance with the requirements/user stories.

A diagram known as a testing pyramid provides a mental model on how different types of functional tests fit together.
![testing pyramid](https://automationpanda.files.wordpress.com/2017/10/the-testing-pyramid.png)

In the above diagram, there are three types of tests:
1. Unit
    - Most efficient (fastest)
    - Least comprehensive (testing a single method)
    - Interact directly with the code
        - Will invoke actual methods being tested
    - JUnit + Mockito typically used
        - Mockito allows units to be tested independently from any of their dependencies by mocking those dependencies
            - ex. Mocking a DAO object when testing a service layer method which might invoke a method in the DAO layer
    - Automated
    - **Contribute to code coverage**
2. Integration
    - Medium efficiency (fast)
    - Fairly comprehensive (testing multiple units working together)
        - ex. Controller -> Service -> DAO -> H2 in-memory database
    - Also often known as **API testing**
    - Interacts directly with the code
    - Tools such as Spring test can be used
        - Whenever we talk about Spring, this is where we may introduce integration testing
    - Automated
    - **Contribute to code coverage**
3. End-to-end
    - Cover a path through the entire system from "end to end"
        - ex. Frontend to Backend to Database
        - "From the frontend all the way to the database"
    - E2E testing refers to tests interacting with the product/software like a real user
    - Manual OR automated
        - Manual: doing it "by hand"
        - Automated: using automation tools to execute the tests
            - Selenium typically used with a testing framework such as JUnit 5 or TestNG
                - Cucumber can also be included for teams that utilize behavior driven development methodology
    - DOES NOT interact directly with the code
    - **Therefore, DOES NOT contribute to code coverage**

There is also a fourth type, called user acceptance testing (UAT), that is also very important. This category should go above end-to-end testing, if it were to be included in the pyramid.

4. User acceptance testing (UAT)
    - Actual users test the software to see if the software is acceptable for real world situations
    - Software might be good in theory, but is it good in practice?
        - Alpha testing
            - In house testing
        - Beta testing
            - Open beta
                - Released to the entire public
            - Closed beta
                - Limited sign-ups/invitations

# Functional Testing Concepts
## Whitebox v. Blackbox testing
**Whitebox** tests refer to tests that interact directly with the code (actual invocation of the code directly). These types of tests require actual knowledge of the written code.

**Blackbox** tests refer to tests that do not interact directly with the code. These types of tests do not require knowledge of written code.

1. Unit = whitebox
2. Integration = whitebox
3. End-to-end (E2E) = blackbox
4. User acceptance testing (UAT) = blackbox

## Positive & Negative testing
- Positive test: testing that the feature behaves correctly when utilized correctly
    - ex. Logging in with valid credentials, which should take us to the user homepage
- Negative test: testing that the feature behaves correctly when utilized incorrectly
    - ex. Logging in with invalid credentials, which should result in an "invalid login" message

## Exploratory testing
- Exploring an application's functionality to learn more about the application and design formal test cases for future testing
- Using best judgement to determine behavior that appears to be a defect v. not a defect
- Typically done for projects involving existing software with a lack of extensive testing, documentation, etc.
    - ex. A business might neglect testing initially, but as they grow larger and the software becomes harder to maintain, they may require formal test cases to be developed to ensure software quality by following proper testing processes.

## Exhaustive testing
- Testing where every single possible combination is tested
- Not feasible from a cost OR time perspective
- Should instead focus on the most likely situations and scenarios that may be encountered or utilize test case design strategies such as **equivalence partitioning** or **boundary testing**

## Equivalence partitioning & Boundary testing
- Equivalence partitioning: divide test values into smaller intervals
    - ex. every 25 numbers
    - negative, zero, positive numbers
- Boundary testing: test extreme values
    - ex. Large number of characters, 0 characters
    - Minimum number possible, maximum number possible, min - 1, max + 1

## Re-testing
Part of the defect lifecycle where tests that previously failed are run again to see if the defect has been fixed by the developer.

## Regression testing
**This concept here is really why we create entire suites of test cases to begin with**. 

Running previously developed test suites (collections of test cases) to ensure that newly developed functionality did not break old functionality.

Regression testing is a very important concept that deals with the maintainability of the software project. As you add new features, you will be changing code, and you might inadvertently break older functionality.

We want to perform regression testing to ensure that these problems are fixed and that the build continues to be stable.

Regression testing, especially if we have many test cases that need to be executed manually, can be time consuming and expensive. So, this is an endeavour that should be done last compared to other testing activities such as Smoke testing / Sanity testing

## Smoke testing
Smoke testing is a technique whereby we validate the most critical functionalities of the application to see if they are working as expected. 

Smoke testing should be performed BEFORE any detailed regression testing.

For example, testing login functionality might be categorized as a smoke test, because there's probably not much you can do if you can't log in.

## Sanity testing
Sanity testing is a technique where we validate the most recent functionality that has been added to ensure that the newly developed features are actually working.

The objective is not to thoroughly test the new functionality. It is more of a quick "sanity check" on the new features.

## Manual testing
Test functionality "by hand".

Follows a formal process dictated by the testing lifecycle, with carefully planned test cases and defect reporting processes.

## Test automation
Utilizing automated scripts to execute, track, and generate test results to save time.

# Non-functional Testing
Validating that the performance, usability, and reliability of an application is up to par with certain metics.

- Performance testing
    - Load testing: Examine how the application performs under certain loads
        - Usually anticipated/expected load
        - Number of users using the application at once
    - Stress testing: test how the application behaves under high loads
        - Sometimes even overload the application to see how it breaks
    - Spike testing: Test how the application behaves when there is a sudden increase in user count
    - Ramp up/ramp down testing: gradually increasing/decreasing load
- Usability testing
    - Is the application realistically usable?
    - Also known as UX (user experience) testing
    - Ex. white background w/ white text
        - A human cannot read the text
        - But Selenium still can (it can grab the text from the paragraph element, for example)

# Defects and Defect Reporting
Defects are behaviors that do not match with what is specified in the requirements. Mismatches found during testing are reported as defects.

Error -> Defect/bug -> Failure
- Error: a mistake that somebody made
- Defect/bug: a mistake that is embedded into the software as actual code
- Failure: a manifestation of the defect while we are testing or when a user is using the application
    - It is better to uncover the defect while testing rather than while a customer is using the application

When we find a defect, we need to report the defect. Defects can be reported and tracked through tools such as
- Jira
- BugZilla
- etc.

## Defect Report
A defect report is a record of the mismatch found during testing (failed test).

It consists of
- Defect ID: unique identification for a defect
- Defect Description: detailed description of the defect and information of where it was found
- Application version: version of the software
- Steps: steps on how to replicate the defect
- Date Raised: date when the defect was submitted
- Reference: documents / screenshots of the problem
- Detected By: name of the tester who raised the defect
- Status: current status of the defect
- Fixed By: name of the developer who fixed the defect
- Date Closed: Date when the defect was closed
- Severity: impact of the defect on the application
- Priority: urgency of fixing the defect

## Defect Categorization
- Severity
    - Blocker
        - Testing cannot proceed further because other test cases are blocked by this defect
        - ex. Login functionality not working, so cannot execute test cases that require user to be logged in
    - Critical
        - Main functionality is not working
            - ex. Submitting assignments not working
    - Major
        - Undesirable behavior, but main functionality is still working
            - ex. When assignment is graded, notification email is not sent
    - Minor: Will not cause major issues
        - ex. Spelling issues, alignment issues
- Priority
    - High: Must be resolved ASAP
    - Medium: Can be fixed in the next build/version
    - Low: Can be fixed in later releases

Examples
- Blocker, high priority: Clicking the login button does nothing
- Major, low priority: Clicking on about us link takes you to a blank page
- Minor, high priority: homepage of the website has an incorrect company logo / company name

# Defect Lifecycle
The defect lifecycle is one of the phases that is part of the **testing lifecycle**, which in turn is part of the **software development lifecycle**.

1. Tester finds a bug
    - Status: New
    - Move to step 2
2. Dev project manager reviews bug report
    - Manager chooses to approve or reject bug report
    - Status: Rejected
        - If bug is not valid
        - Reasons:
            - Need more information
            - Not reproducible
            - As designed
            - Enhancement
    - Status: Duplicate
        - If bug was already reported
    - Status: Approved
        - Move to step 3 if status is approved
3. Developer is assigned the bug
    - Status: Assigned
4. Developer begins fixing the bug
    - Status: Open
5. Developer fixes bug
    - Status: Fixed
6. Tester retests defect
    - If bug still exists
        - Status: Open
    - If bug is fixed
        - Status: Closed
7. Tester performs regression testing (to make sure that the bug fix the developer made did not break old functionality)
