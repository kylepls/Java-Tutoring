#### If

Check if a condition is true.
Condition is something that evaluates to true or false (boolean)

Syntax: 

    if (<condition>) {
    
    }

Example:
    
    if (true) {
        // always runs
    }

The code block is optional. 
If no code block is provided the next line of code is implied as the code block.

Example
    
    if (false) 
        // never runs
        System.out.println("Can't see this");
        
The comment does not count as a line of code

#### Else

Happens if the if statement did not evaluate to true.

Syntax:
    
    if (<condition>) {
        // stuff    
    } else { 
        // stuff
    }

Example:
    
    if (true) {
        // always runs
    } else {
        // never runs
    }

#### Branching

 Combine the two for some pretty complicated flow.
    
    // 90+ = A
    // 80+ = B
    // <80 = F
    int grade = <0 - 100>
    if (grade >= 90) {
        System.out.println("A");
    } else if (grade >= 80) {
        System.out.println("B");
    } else {
        System.out.println("F");
    }
    