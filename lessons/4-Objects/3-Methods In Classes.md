#### Creating

INSTANCE METHODS are methods that act on the INSTANCE of a class.
They are NOT the same as STATIC methods. STATIC methods are not bound to anything but the class. NOT THE OBJECT.

Declaring an instance method: Same as a method. Just NO static.

Example:

    class Bob {
       void mute() { // mutes annoying person IRL
          
       }
    }

#### Calling

First create an instance of an object: 

    Bob bob = new Bob();

Then use the DOT operator. The dot operator lets us see inside the class. It can point to fields and methods that are VISIBLE.

Syntax:

    <object>.<field or method name>
    
Now to call our method:
    
    bob.mute(); // just like a normal method call

We can also use fields with the dot operator, see below.

What’s the output?

    class Bob {
       public int age = 10;
      
       void printAge() {
           System.out.println(age);
       }
    }
    
    class Main {
       public static void main(String[] args) {
           Bob bob = new Bob();
           bob.printAge();
           bob.age = 11;
           bob.printAge();
       }
    }

<details> 
  <summary>Click for solution</summary>
    
    10
    11
    
</details>
