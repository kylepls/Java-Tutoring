package exceptions;

import java.util.Scanner;

/**
 * Created by Kyle on 7/1/2017.
 */
public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows  = nextInt(false);
        System.out.println("Enter cols:");
        int cols = nextInt(false);
        int[][] array = new int[rows][cols];
        
        for (int r = 0; r < rows; r++) {
            int[] row = array[r];
            for (int c = 0; c < cols; c++) {
                System.out.println("Enter value for (" + r + ":" + c + "):");
                row[c] = nextInt(true);
            }
        }
    
        printArray(array);
    }
    
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static int nextInt(boolean allowNegative) {
        while (true) {
            String s = scanner.nextLine();
            try {
                int i = Integer.parseInt(s);
                if (!allowNegative && i < 0) {
                    System.err.println("Please enter a positive number");
                } else {
                    return i;
                }
            } catch (NumberFormatException ignored) {
                System.err.println("Invalid number " + s);
            }
        }
    }
}