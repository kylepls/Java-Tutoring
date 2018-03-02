package arrays;

public class EnhancedFor {
    
    public static void main(String[] args) {
        int[][] array2d = new int[10][10];
        for (int[] row : array2d) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
