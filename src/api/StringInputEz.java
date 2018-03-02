package api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Takes in a variable amount of strings from the user and then displays them on the screen
 */
public class StringInputEz {
    
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                 break;
            } else {
                strings.add(line);
            }
        }
        System.out.println(strings);
    }
}
