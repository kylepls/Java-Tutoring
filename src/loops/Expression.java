package loops;

/**
 * Created by Kyle on 5/28/2017.
 * 
 * Prints useful data about a line
 * 
 * Line: f(x) = (x^3)/3 + 2^x
 * 
 * Required things: 
 * - Value at x=3
 * 
 * Answer:
 * f(3) = 17
 */
public class Expression {
    
    public static void main(String[] args) {
        System.out.println("f(3) = " + getValue(3));
    }
    
    private static double getValue(double x) {
        return getExponent(x, 3) / 3 + getExponent(2, x);
    }
    
    private static double getExponent(double base, double power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result*=base;
        }
        return result;
    }
}
