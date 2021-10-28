# Lesson on StringBuilder and StringBuffer

Properties of a String:
- Sequence of characters
    - In particular, it is an array of char values
        - char[] value;
- Immutable
- String literals go in the String pool
    - Strings constructed using the `new` keyword are in the regular part of the heap

## What is an immutable object?
An object that is immutable is one whose internal state / properties remain the same after it has been created. Once the object has been assigned these properties, they cannot be updated.

**Hence, once a String is created, its internal char primitives cannot be changed to anything else**

# Enter StringBuilder and StringBuffer!
StringBuilder and StringBuffer are objects that contain mutable sequences of characters. This means that once the object has been created, characters can be added and removed at will. 

## StringBuilder v. StringBuffer
StringBuffer is the **thread-safe** version of StringBuilder. We are not dealing with multi-threading in training, but know that thread-safety has to do with making sure that only one thread is accessing a block of code at one particular time to prevent an issue known as a **race condition**.

Because of this additional check,
- StringBuffer is slower than StringBuilder
- But, StringBuffer is THREAD-SAFE

So, if you are working on a single threaded application, you should use StringBuilder as it will be faster. 

If you are working on a multi-threaded application where you know multiple threads will be utilizing the same object, StringBuffer is what you should be using since although it is slower, it is thread-safe.

# StringBuilder/StringBuffer methods
- append(String s): used to add a String onto the end of the sequence
- insert(int offset, String s): used to insert a String at a specified position
- reverse(): used to reverse the sequence of characters
- length(): return the current number of characters
- toString() (overridden from the Object class): returns a String object consisting of the characters inside the StringBuilder/StringBuffer object

# Exercise: Reverse a String
Create 3 methods that will take a String as a parameter and return a reversed version of that String
1. Using only String concatenation
2. Using StringBuilder
3. Using StringBuffer