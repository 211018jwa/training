# Common Misconceptions

- "The JVM compiles our source code into bytecode"
    - The compiler takes our source code and compiles it into bytecode
    - The JVM runs the bytecode
- "JRE runs the program"
    - JRE contains the runtime libraries + JVM
    - The JVM is what actually runs the program
- JDK: contains the JRE + compiler
- "The static keyword means not changing"
    - Static fields and methods belong to the class itself
    - This is why we have the concept of global scope / static scope / class scope (they all mean the same thing)
    - Non-static fields belong to objects that are instantiated from that class
        - Ex. Person class, creates Person objects
        - Every person has a first name and last name
    - non-static fields = instance scoped variables
    - static fields = class scoped variables