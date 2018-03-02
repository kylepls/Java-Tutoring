package arrays;

/**
 * Created by Kyle on 6/5/2017.
 */
public class SumAround {
    public static void main(String[] args) {
        int[][] array = makeRandomArray(2, 2);
        int sum = sumAround(array, 0, 0);
        System.out.println("Sum is " + sum);
        printArray(array);
    }
    
    private static int[][] makeRandomArray(int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int[] ints : result) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int) (Math.random() * 10);
            }
        }
        return result;
    }
    
    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    private static int sumAround(int[][] array, int row, int col) {
        return valueAt(array, row + 1, col) + valueAt(array, row - 1, col) +
               valueAt(array, row, col + 1) + valueAt(array, row, col - 1);
    }
    
    private static int valueAt(int[][] array, int row, int col) {
        if (row >= array.length || row < 0 || array[row].length <= col || col < 0) {
            return 0;
        } else {
            return array[row][col];
        }
    }
}
