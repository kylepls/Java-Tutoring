#### Methods
Methods allow programmers to reuse certain aspects of their code in different places. A method defines an operation that will be performed when the method is called. So when I want to eat food I would call a method called eatFood.

Methods are named using the same camel case notation as before, but they all start with a lowercase letter

Examples:

| Desired Name | Method Name |
| --- | --- |
| Eat cheesecake | eatCheesecake |
| Make a giant pizza | makeGiantPizza |

It’s common to leave out certain words such as ‘a’ to increase simplicity.

Methods are defined in a class using the following syntax:

    <access modifiers> <return type> <name>([parameters]) {}

An example would look like this:

    void doNothing() {
        // does nothing
    }

> Access modifiers: none

> Return type: void

> Name: doNothing

> Parameters: none

---

    public static void doNothing(int parameter1, int parameter2, int parm3) {
    
    }

> Access modifiers: public, static

> Return type: void

> Name: doNothing

> Parameters: parameter1, parameter2, param3

#### Access modifiers
These define how the method will be seen by other classes.


| Access Modifier | Effect |
| :---: | --- |
| public | Can be seen by every other class |
| private | Can only be seen by class method is in
| protected | Can only be seen by package and subclasses
| static | Not bound to an object

Most of this does not make sense yet, we’ll certainly go into more detail about each modifier later.

An examples of a method with an access modifier

    public void doNothing() {
        // does nothing
    }

We can also apply access modifiers to classes

    <access modifier> class <name> {}

***

    public class Main {
        private class Subclass {
    
        }
    }

    public class Cookie {
        
    }

When we apply an access modifier to a class, it controls its visibility to other classes. So if you want a class to be hidden from all other classes:

#### Return types
If we think of a method as me asking someone to do something:
I ask them to wash the dishes and tell me how many dishes they washed when they’re done.
Our method name would be washDishesForMe.
And since I want them to tell me something after they’re done, this would indicate our return type.
For this example we will return an int.

    int multiply(... 2 numbers) {
        // 1*2
    }

So our method would look like:

    int washDishesForMe() {
        // Perform dish washing logic.
        // give the caller of the method back the number of dishes we washed
    }

If we don’t want a method to tell us anything when we are done we use the keyword void as our return type.

    void washDishesForMe() {
        // Perform dish washing logic, but don’t count anything because we don’t care.
    }

#### Parameters
These are arguments that the method will take in. 

Parameters are defined by the following syntax: 
    <type> <name>, <type> <name>, ...

So if I need to tell the method to wash 5 dishes (integer) we could use the following:

    void washDishes(int amount) {
        // wash’em
    }

This should look similar, to a variable declaration (int amount).

Using parameters with variables

How about declaring a variable inside a method?

    void declareVariable() {
        int number = 12;
    }

We can also use a parameter to assign number dynamically.

    void delcareVariable(int value) {
        int number = value;
    }

We used the variable name “value” to assign a value to number. You bet we can do that!
This is doing the following:
Create an integer in memory
Lookup an integer called “value” in memory
Set the integer we just created equal to the one we just looked up.
