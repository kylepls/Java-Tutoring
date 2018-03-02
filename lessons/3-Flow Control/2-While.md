#### Basics 

Repeats until a condition becomes false

Syntax:

    while (<condition>) {
        // run again
    }

Example:
    
    while (true) {
        // runs forever
    }

Normally you want something to change between each run of the loop.

    while (<condition>) {
        // change something
    }

#### Break
    
Exits a while loop forcefully

Syntax:

    break;

Example:

    while (true) {
        break; // exits the loop
        // never runs
    }

#### EX1

    int i = 0;
    while (true) {
        if (i == 10) {
            break;
        }
        i++;
    }
    System.out.println(i); // prints 10