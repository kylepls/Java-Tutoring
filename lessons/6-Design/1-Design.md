When and how to we use certain design features?

### Access

  1. Private - Use private when no other classes need to be able to access an element. This can 
  be a class, method, or field.
  
  2. None - Use when only the current package needs access to an element.
  
  3. Protected - Use when only classes inside the package and also subclasses need to access
  an element.
  
  4. Public - Use when all other classes need to be able to access an element.

  5. Static - Use when an element does not act upon the instance of an object of the current type. 
  Eg: Math methods do not act upon an instance of a Math object. All fields in a math class are static math constants. (E, PI, etc...)
  Do not use static in replacement of an Object.

### Final

  1. Use final as much as possible. The less moving parts there are; the better. Use when a 
  variable should not change after the object has been initialized.
  * Final classes you do not want a class to be extended.
  * Final methods when subclasses should not alter functionality of a feature. Final method means that the method cannot be overriden.
  * Final fields / variables when the field / variable should never change their value.

### Abstraction

Use abstraction as much as possible in order to avoid duplicate code.

  1. Interface - 
  Use an interface when defining the functionality of a class (what it should do). An interface is used for requiring certain methods.
  If a class implements an interface, it must implement the methods defined in the interface. If the class does not implement all
  methods defined in the interface, that class must be labeled as abstract. 
  
  2. Abstract Class & Methods - 
  * Use an abstract class when defining the definition of the properties of a class (what it should be). Methods and fields. Abstract 
  classes cannot be instantiated. Any class that extends an abstract class automatically inherits all fields and methods of the abstract
  class 
  * Use an abstract method (only in an abstract class) when you want to create a method that must be overriden in it's subclass. These
  methods don't have any functionality defined in the superclass.

### Inheritance

  1. Method overriding - Override a method when there is a need to change the functionality of a 
  method or to add more detail to a method. You can call the original method by invoking super.x();

### Imports

Used to tell Java that we are working with other classes from a different package.

  1. Avoid using static imports - Static imports all classes inside a package. If two different 
  packages are statically imported and both have a class named "Dog" you will get confused and 
  frustrated very quickly.

### Other design

  1. Method overloading - Use overloading to add detail to a method. An example might be:
  
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return add(a, add(b, c));
    }
  
  2. Use constants when multiple objects reference the same thing.
  
    void printPi() {
        System.out.println(3.14);
    }
    
    // Can become:
    
    static double PI = 3.14;
    void printPi() {
        System.out.println(PI);
    }
    
