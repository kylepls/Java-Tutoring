package loops;

/**
 * Created by Kyle on 5/13/2017.
 *
 * Calculates PI using the following formula
 * PI = 4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 + ...)
 *
 * Goes to 1/6969
 */
public class PI {
    
    public static void main(String[] args) {
        System.out.println(calculatePI(6969));
    }
    
    private static double calculatePI(int limit) {
        double result = 0;
        boolean add = true;
        for (int i = 1; i <= limit; i += 2) {
            if (add) {
                result += 1.0 / i;
            } else {
                result -= 1.0 / i;
            }
            add = !add;
        }
        return 4 * result;
    }
}
