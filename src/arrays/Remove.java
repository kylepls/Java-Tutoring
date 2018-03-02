package arrays;

/**
 * Created by Kyle on 6/1/2017.
 * Remove an element from an array
 */
public class Remove {
    
    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 9, 11};
        int index = 1;
        int[] result = remove(array, index);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
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
