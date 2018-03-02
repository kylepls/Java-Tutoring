#### Scope
A code block declares a new scope.

Everything declared inside a scope is bound to that scope.

Child scopes inherit from parent scopes.

##### EX1:

    { // create a new scope
        int i = 0; // i is bound to this scope
        System.out.println(i); // prints 0
    }

##### EX2:

    {
        // no variables
        
        {
            // no variables
            int j;
            // can only see j
            {
                int k;
                // can see k and j
            }
            // can only see j
        }
        
        int c;
        // can only see c
    }