package seriouspoly.brain;

/**
 * Created by Kyle on 6/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        KylesBrain kylesBrain = new KylesBrain();
        ZachsBrain zachsBrain = new ZachsBrain();
        
        think(kylesBrain);
        think(zachsBrain);
        
    }
    
    public static void think(Brain brain) {
        brain.think();
    }
    
    interface Swag {
        boolean hasSwag();
    }
}
