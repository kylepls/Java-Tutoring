Immediately exits a method if the return type is void.

Syntax:
    
    return;
    
Example:
    
    void doSomething() {
        int i = 0;
        while (true) {
            if (i == 10) {
                System.out.println(i):
                return;
            }
        }
        // does not loop forever
    }
    
If the return type is not void then you must pass a value to return.

Syntax:
    
    return <value>

Example:

    return 1;

This value gets passed back to where the method was called from.
EX1:
    
    static int getNumber2() {
        return 2;
    }
    
    public static void main(String[] args) {
        System.out.println(getNumber2());
        // prints 2
    }

EX2:
    
    public static int howManyPizzaHaveUEaten(name) {
        if (name == “zach”) { 
        // testing string equality like this is super bad, we'll discuss this later
            return 1;
        } else if (name == “kyle) {
            return 400;
        } else if (name == “joey”) {
            return 6000;
        }
        return 0;
    }
    
    int p = howManyPizzaHaveUEaten(“zach”);
    System.out.println(p); // 1
    
    int p = howManyPizzaHaveUEaten(“kyle”);
    System.out.println(p); // 400
    
    int p  = howManyPizzaHaveUEaten(“joey”);
    System.out.println(p); // 6000