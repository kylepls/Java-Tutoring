package arrays;

import java.util.Scanner;

/**
 * Created by Kyle on 6/8/2017.
 */
public class StringInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] output = new String[0];
        for (int i = 0; ; i++) {
            String line = scanner.nextLine(); // 3
            if (line.equals("end")) {
                break;
            } else {
                // [1,2]
                
                output = resizeAndCopyArray(output, output.length + 1);
                
                // output = [1,2,null]
                
                output[i] = line;
                
                // [1,2,3]
            }
        }
        printArray(output);
    }
    
    // [1,2], 3
    private static String[] resizeAndCopyArray(String[] output, int size) {
        String[] newArray = new String[size]; // [null, null, null]
        for (int i = 0; i < output.length; i++) { // output.length = 2
            newArray[i] = output[i];
        }
        // [1, 2, null]
        
        return newArray;
    }
    
    private static void printArray(String[] input) {
        for (String s : input) {
            System.out.println(s);
        }
    }
}
