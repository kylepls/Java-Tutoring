Arrays can be used with methods just like any other type.

    public int getInt(int i) {
    }
    
    public int[] getIntArray(int[] i) {
    }

When you pass an array to a method, you are passing the reference to that array. 
This means that changes to the array passed with be visible to the caller method after the 
changes have been applied.

Example:
    
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};
        modifyArray(array);
        // array is now [-1, -1, -1]
        printArray(array);
        // prints
        // -1
        // -1
        // -1
    }

    
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    