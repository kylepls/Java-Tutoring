package loops;

/**
 * Created by Kyle on 5/28/2017.
 * 
 * [sum(i/(i+1) i=0 to 4] = 163/30
 */
public class PrintE {
    
    public static void main(String[] args) {
        System.out.println("Our approximation " + calculateE(4));
        System.out.println("Real E: " + Math.E);
    }
    
    private static double calculateE(double bound) {
        double result = 0;
        for (int i = 0; i <= bound; i++) {
            result += i / (1.0 + i);
        }
        return result;
    }
}
