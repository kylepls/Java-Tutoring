package design;

public class Dog {
    
    private final String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    static {
        System.out.println("Dog class loaded");
    }
}
