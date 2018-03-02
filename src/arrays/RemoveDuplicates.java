package arrays;

/**
 * Created by Kyle on 6/3/2017.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 2, 3, 3};
        
        int[] ints = removeDuplicates(array);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    
    
    public static int[] removeDuplicates(int[] array) {
        int[] result = array;
        for (int i = 0; i < result.length; i++) {
            int value = result[i];
            
            for (int j = i + 1; j < result.length; j++) {
                int testValue = result[j];
                if (value == testValue) {
                    result = remove(result, j);
                    j--;
                }
            }
        }
        return result;
    }
    
    public static int[] remove(int[] array, int removeIndex) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < result.length; i++) {
            if (i < removeIndex) {
                result[i] = array[i];
            } else {
                result[i] = array[i + 1];
            }
        }
        return result;
    }
}
