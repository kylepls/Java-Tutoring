Arrays inside arrays inside arrays inside arrays.
This is going to be confusing.

In Java we can declare a 2d array like this:
Syntax:

    <type>[][] <variable name> = new <type>[<d1>][<d2>];

Example: 2x2 int

    int[][] array2d = new int[2][2];

This array we just created has 4 spaces because 2x2 = 4. It looks like this:

| 0 	| 0 	|
| :---:	| :---:	|
| 0 	| 0 	|

We can then access elements in the array with the following syntax:
    
    <variable name>[<i1>][<i2>]
    
Example:
    
    int value = array2d[0][0];
    // value = 0
 