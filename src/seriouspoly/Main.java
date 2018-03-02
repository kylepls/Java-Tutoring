package seriouspoly;

import java.util.ArrayList;
import java.util.List;

import seriouspoly.things.Lamp;
import seriouspoly.things.Phone;

/**
 * Created by Kyle on 6/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.setOn(false);
    
        Phone phone = new Phone();
        phone.call("");
    
        List<Thing> objects = new ArrayList<>();
        objects.add(phone);
        objects.add(lamp);
    }
    
    public static void process(Thing thing) {
        
    }
}
