package arrays;

import java.util.Scanner;

public class JavaApi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("You entered '" + s + "'");
    
        int i = scanner.nextInt();
        System.out.println("You ented the int : " + i);
    
        boolean b = scanner.nextBoolean();
        System.out.println("You enterd boolean  " + b);
    }
}
