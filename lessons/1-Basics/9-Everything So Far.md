#### Intro
Now how about we put everything together. How about we make a variable inside a method inside a class?

    class Something {
        void declareVariable(int value) {
            int number = value;
        }
    }

![](http://memeshappen.com/media/created/-its-gonna-be-huge-meme-43199.jpg)

#### Making a legit program
This is now valid Java code. We can compile this and run it. Sadly nothing happens :(
Why?
Well Java had no idea what to do with what we just gave it. We just threw a bunch of code its way and said figure it out. Java didn’t know what to do and was very sad.

We gotta be more specific about what we want to be done.
When a Java class is run Java looks for a method called “main”. If it finds that method, it runs it. If not, nothing happens.

The “main method” must be public, static, return void, and take a special parameter. If you don’t meet all of these conditions, nothing happens and you will be very angry.

#### Defining a main method
Here’s how a main method should look. This will never change. EVER.

public static void main(String[] args) {
	// this will be run
}

public void onEnable() {}


For now, try to ignore the “String[] args” portion of the code, we will cover that in more detail later.

#### Console Output
I want you to see that the program actually does stuff now. We’ll have to play the “ignore this part” game again.

To send a message to the console in Java we use the following statement:

    System.out.println(<stuff>);

Example:

    int i = 0;
    System.out.println(i (0));

We can send the number 1 to console with the following code:

    System.out.println(1);
    // prints: “1”

Or we can reference a variable:

    int value = 12;
    System.out.println(value);
    // prints “12”

Putting it all together:

    // RUN THIS
    public class Main {
        public static void main(String[] args) {
            int value = 12;
            System.out.println(value);
            // prints “12”
        }
    }
