#### Intro
An array is a table. Like this:

| 0 | 1 | 2 | 3 | 4 |
|---|---|---|---|---|

There are two important properties about a table. The size and the maximum index. For the table 
above, the size would be 5 because there are 5 columns in the table. The maximum index would be 4
. This is because arrays start with an index of 0. So the maximum index would be 4.

#### Declaring
Any type in Java can be an array. The syntax for defining an array is as follows:
Syntax:
    
    <type>[]

The type is the type that you want to populate the array with. 
If I wanted an array of ints I would write:

    int[]

This creates its own type that we can use to declare a variable.

    int[] arrayVariable;

#### Initialize
To initialize an array we use the following two methods:

Syntax 1: Create an int array of size n where n is a positive integer

    new int[n];

Example: Create an int  array of size 5

    new int[5];

Syntax 2: Create an int array populated with predefined values where v(i) is the value at index i

    new int[] {v(0), v(1), ..., v(i)};

Example: Create an int array with the values shown in the table below 

| 20 | 80 | 60 | 87 | 19 |
|----|----|----|----|----|

    new int[] {20, 80, 60, 87, 19};
    
#### Accessing elements

To access an element in an array at index i is as follows

    arrayVariable[i];

We can use this to assign to a variable:

    int valueAtI = arrayVariable[i];

We can also overwrite the value at an index using the following syntax:
    
    array[i] = <value>

Example: Set first index in array to 20
    
    array[0] = 20;

#### Arrays with objects

Let the class dog be defined as follows:

    class Dog {
        public void bark() {
        }
    }

Anything in Java can be an array. So lets make an array of dogs

    Dog[] dogArray = new Dog[3];

The default values for the array are null for objects. Null means that the variable is not yet 
initialized. You cannot do anything with null. Null will be further discussed in the next part.

Here is the current array

| Index |   0  |   1  |   2  |
|:-----:|:----:|:----:|:----:|
| **Value** | null | null | null |

Trying to call the method bark on the value at index 1 will produce a NullPointerException (NPE). 
This 
means Java cannot find what object you are trying to call the method bark on because no value has
 been assigned at that index. NullP
 
    dogArray[1].bark();     // throws NPE

To fix this, assign a value to index 1.

    dogArray[1] = new Dog();
    dogArray[1].bark();     // runs


