package design;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static final List<String> STRINGS = new ArrayList<String>() {
        {
            add("a");
            add("b");
            add("c");
        }
    };
    
    public static void main(String[] args) {
        System.out.println(STRINGS);
    }
}
