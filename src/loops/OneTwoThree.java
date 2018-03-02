package loops;

/**
 * Created by Kyle on 5/14/2017.
 * 
 * Prints:
 * 123123123
 * 123123123
 * 123123123
 */
public class OneTwoThree {
    public static void main(String[] args) {
        for (int y = 0; y < 3; y++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("123");
            }
            System.out.println();
        }
    }
}
