It's very common that when working with arrays we need to loop over all the values.
Java makes this very easy. Each array has a field called length. This is equivalent to the size 
of the array. This is an integer.

    arrayVariable.length

So we can use this to print all the values in an array
    
    for (int i = 0; i< arrayVariable.length; i++) {
        System.out.println(arrayVariable[i]);
    }

If we tried to print out an array directly the memory address of the array would be printed.
We always need to print arrays manually.

    System.out.println(arrayVariable); // prints nonsense

