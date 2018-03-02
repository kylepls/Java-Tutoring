package loops;

/**
 * Created by Kyle on 5/12/2017.
 *
 * Gets the factorial of a number
 *
 * f(n) = 1 * 2 * 3 * 4 * ... * n
 *
 * Prints f(69)
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(69));
    }
    
    private static double factorial(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
