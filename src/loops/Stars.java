package loops;

/**
 * Created by Kyle on 5/14/2017.
 */
public class Stars {
    public static void main(String[] args) {
        printStars(7);
    }
    
    private static void printStars(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
