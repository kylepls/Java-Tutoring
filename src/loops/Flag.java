package loops;

/**
 * Prints a flag
 * http://p.kyle.in/l4lbe
 */
class Flag {
    // 6 * 5
    // 5 * 4
    // == 50
    
    public static void main(String[] args) {
        for (int r = 0; r < 15; r++) {
            int c = 60;
            
            if (r < 9) {
                int m;
                if (r % 2 == 0) {
                    m = 6;
                } else {
                    m = 5;
                    System.out.print(" ");
                    c--;
                }
                
                for (int i = 0; i < m; i++) {
                    System.out.print("* ");
                    c -= 2;
                }
                
                if (m == 5) {
                    System.out.print(" ");
                    c--;
                }
            }
            
            while (c > 0) {
                System.out.print("=");
                c--;
            }
            System.out.println();
        }
    }
}