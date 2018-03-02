package loops;

/**
 * Created by Kyle on 5/12/2017.
 * 
 * Print all the prime numbers between 2 and 100
 * A prime number is a number that's factors are ONLY 1 and itself.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
