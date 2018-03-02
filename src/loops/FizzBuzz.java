package loops;

/**
 * Created by Kyle on 5/12/2017.
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples
 * of both three and five print “FizzBuzz”.
 * 
 * Expected output: http://p.kyle.in/b55qr
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            boolean b3 = i % 3 == 0;
            boolean b5 = i % 5 == 0;
            if (b3 && b5) {
                System.out.println("Fizzbuzz");
            } else if (b3) {
                System.out.println("Fizz");
            } else if (b5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
