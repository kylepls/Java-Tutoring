Some of these are too simple to explain.

##### Add
    System.out.println(1+1);

##### Subtract
    System.out.println(1-1);

##### Multiply
    System.out.println(10*10);

##### Divide

    System.out.println(1/2);

Here Java sees 2 whole numbers and tries to make the result a whole number. 
Java will truncate decimal places to preserve the result as to be the same as the 2 input types.

If one of the types is a more precise type (double > int) then Java will make the result that type

So 
> int/int  = int

> double/int = double



##### Modulus
    System.out.println(5%2);

Returns the remainder of a division. So 5/2 is 2 remainder 1. This makes 5%2 return 1.