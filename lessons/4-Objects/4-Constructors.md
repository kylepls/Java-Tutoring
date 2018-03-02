Used to pass initial values to an object when we create it.

Syntax:

    <class name>(<parameters>) {
        // do stuff
    }

Example:

    class Bob {
      
       public int age; // handled in constructor
      
       public Bob(int q) {
           this.age = q;
       }
      
       void printAge() {
           System.out.println(age);
       }
    }

    Bob bob  = new Bob(10);

Is the same as doing:

    Bob bob = new Bob();
    bob.age = <integer>;
