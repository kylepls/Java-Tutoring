Null almost always means bad. The less null we use, the better.

Null is defined by the following keyword:
    
    null

Null can be directly translated to "unset". You can always get rid of a null by setting a value.

Example:
    
    String string = null;   // string is unset
    string = "Hello!"       // string is now set

Trying to do anything with a null will often result in a NPE.

    String string = null;
    if (string.equals("Hello!") { // throws NPE because Java does not see a reference
    }

A better way to write the above would be

    String string = null;
    if ("Hello!".equals(string) { // Does not throw NPE
    }

This does not throw a NPE because Java can find the method equals in the String object. 
Passing a null value as a parameter is not usually a bad thing if you check for it.

Checking for a null value:
    
    String s = null;
    if (s == null) {
        System.out.println("Variable s is null!");
    } else {
        System.out.println("Variable s is not null.");
    }

One last thing! Primitive types can never be null.
    
    int i = null; // does not compile, ints cannot be null.

Instead, when a primitive is created it is assigned a default value. 
The default values are the following:


|Data Type  |Default Value (for fields) |
|---|---|
|byte       |0                          |
|short      |0                          |
|int        |0                          |
|long       |0L                         |
|float      |0.0f                       |
|double     |0.0d                       |
|char       |'\u0000'                   |
|boolean    |false                      |
|String     |(or any object)  	null    |
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html