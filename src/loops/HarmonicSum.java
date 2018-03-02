package loops;

/**
 * Created by Kyle on 5/12/2017.
 * 
 * Calculate the value of a Harmonic Sum at n
 * 
 * A Harmonic Sum is defined by
 * h(n) = 1/1 + 1/2 + 1/3 + ... + 1/n
 * 
 * Prints h(6969)
 */
public class HarmonicSum {
    public static void main(String[] args) {
        System.out.println(calculateHarmonic(6969));
    }
    
    public static double calculateHarmonic(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0/i);
        }
        return result;
    }
}
