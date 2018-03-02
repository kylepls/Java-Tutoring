package arrays;

public class MDArray {
    
    public static void main(String[] args) {
        int[][] array2d = new int[10][10];
        
        array2d[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        array2d[2] = new int[]{1};
        
        array2d[2][0] = 20;
        
        printArray(array2d);
    }
    
    public static void printArray(int[][] array2d) {
        for (int y = 0; y < array2d.length; y++) {
            int[] row = array2d[y];
            for (int x = 0; x < row.length; x++) {
                System.out.print(row[x] + " ");
            }
            System.out.println();
        }
    }
}
