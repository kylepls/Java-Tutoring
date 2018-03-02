package poly.first;

/**
 * Created by Kyle on 6/17/2017.
 */
public class Main {
    
    public static void main(String[] args) {
        Thing thing = new Zebra("Bill Cosby");
        process(thing);
    }
    
    public static void process(Thing thing) {
        // call add if thing is a computer
        // call dance if thing is a zebra
        // call live if thing is an animal
        
        if (thing instanceof Computer) {
            int add = ((Computer) thing).add(1, 2);
            System.out.println("Result is " + add);
        }
        
        
        if (thing instanceof Animal) {
            ((Animal) thing).live();
        }
        
        
        if (thing instanceof Zebra) {
            ((Zebra) thing).dance();
        }
    }
}
