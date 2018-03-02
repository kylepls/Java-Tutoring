package formatting;

public class Main {
    public static void main(String[] args) {
        
        int i = 0;
        int j = -1;
        int c = 2;
        
        
        // i is x, j is x, c is x
        
        String string = String.format("i is %d, j is %d, c is %d", i, j, c);
    
        System.out.println(string);
        
    }
}
