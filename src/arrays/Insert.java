package arrays;

/**
 * Inserts a value into an array at a given index
 */
public class Insert {
    
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int index = 0;
        int value = 29;
        int[] results = insertElement(array, value, index);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
    
    public static int[] insertElement(int[] array, int value, int index) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i == index) {
                result[i] = value;
            } else if (i < index) {     // less than
                result[i] = array[i];
            } else {                    // greater than
                result[i] = array[i - 1];
            }
        }
        return result;
    }
}
