# Object Class
The object class is a special class that every class inherits from. 

If your class does not explicitly extend another class, then it will directly extend Object
- ex. `public class Animal {}`
    - Animal extends Object IMPLICITLY

If your class explicitly extends another class, then it will still INHERIT from Object, but not directly
- ex. `public class Dog extends Animal {}`
    - The Dog class will inherit the Object class' methods through the Animal class which does implicitly extend Object

# Object Class Methods
- toString(): returns a String representation of the object
    - By default (without overriding the toString() method), it will return something similar to `com.revature.model.Dog@82ba41`
    - If we override it, we will typically implement logic that has this method access our object's properties to print out, such as `Dog [name = Fido, age = 5, favoriteFood = steak]`
- equals(Object o): returns a boolean if another object is "equal" to this object
    - By default (without overriding the equals() method), it will be the same as `==` (do the two variables point to the same object or not?)
        - ex. `x.equals(y)` v. `x == y`
    - If we override, we typically use the equals method **to see if all the properties of the two objects are the same or not**
- hashCode(): returns a hash code value representing the object
    - The purpose of a hash code value is to support Collections such as `HashMap` or `HashSet`

# equals() and hashCode() Contract
Whenever we override the toString(), hashCode(), and equals() methods from the Object class, we usually let the IDE do that for us.

But, why does the IDE require us to override hashCode() and equals() together as a single option?
![generate hashCode() and equals()](https://howtodoinjava.com/wp-content/uploads/2018/08/hashcode-and-equals-in-eclipse.png)

This is due to how hashCode's contract is defined
- If two objects are equal according to the equals(Object o) method, the hashCodes of the two objects must be the same
- However, if two objects are not equal according to the equals(Object o) method, then they DO NOT need to have different hashCodes
    - "However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables"

So, the above contract has to do with how HashMaps, HashSets, and other data structures that utilize hashCode and equals together work.