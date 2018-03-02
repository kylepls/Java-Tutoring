package loops;

/**
 * Created by Kyle on 5/12/2017.
 * 
 * Get the result of b^n
 */
public class ExponentN {
    public static void main(String[] args) {
        System.out.println(exponent(2, 3));
    }
    
    public static int exponent(int base, int power) {
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
