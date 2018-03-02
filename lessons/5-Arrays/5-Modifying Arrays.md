Arrays can be modified in all sorts of ways.

How about we try to set every other value in an array to -1

    public void setEverOther(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            array[i] = -1;
        }
    }

Or how about we reverse the values in an array. So [1,2,3,4] becomes [4,3,2,1].
First I need to devise a strategy to accomplish this.

I can start by swapping 1 and 4 and then swap 2, 3. Once thtose are complete, my array should be 
backwards.

How do I get the index corresponding to the index that I currently trying to flip? 
I need a formula. To make my formula I will start with a list of things I can work with.

    Iteration index (i) = 0
    Array length    (L) = 4
    Desired index   (x) = 3

Using this I came up with:
    
    x = L - 1

Now I have to make sure it works with the second flip operation:

    Iteration index (i) = 1
    Array length    (L) = 4
    Desired index   (x) = 2
    
    x = 3 = 4 - 1

I am missing one thing. I am not factoring in the current iteration index.

    x = L - 1 - i

Now lets check again:
    
    x = 2 = 4 - 1 - 1

That will work! Now lets construct the flipping operation.
    
    int oppIndex = array.length - 1 - i;
    array[i] = array[oppIndex];
    array[oppIndex] = array[i];

This takes the value at the other end of the array and puts it at the first end. 
And moves that new value to the end of the array.
But wait... We lose a value through this. array[i] is overwritten so when we do 
array[oppIndex] = array[i]; this is just setting array[oppIndex] = array[oppIndex].

We need to preserve the value of array[i]. A variable is a good way to do this.

    int oppIndex = array.length - 1 - i;
    int temp = array[i];
    array[i] = array[oppIndex];
    array[oppIndex] = temp;

Now we never forget the value at array[i].

Putting it together yields:

    int[] array ...;
    for (int i = 0; i < array.length; i++) {
        int oppIndex = array.length - 1 - i;
        int temp = array[i];
        array[i] = array[oppIndex];
        array[oppIndex] = temp;
    }

If we run this code we get the output of [1,2,3,4]. I thought that is what we passed into the 
method? Did our loop not do anything? Did it run?

Well the loop did run. It just ran a bit too much. 
Here is the output of printing the array after each iteration of the loop:

    (i=0) [4,2,3,1]
    (i=1) [4,3,2,1]
    (i=2) [4,2,3,1]
    (i=3) [1,2,3,4]

We can see that we successfully flipped our array at i=1 but then we flipped it back.
Lets run our loop array.length/2 times.

    int[] array ...;
    for (int i = 0; i < array.length / 2; i++) {
        int oppIndex = array.length - 1 - i;
        int temp = array[i];
        array[i] = array[oppIndex];
        array[oppIndex] = temp;
    }

Perfect!