package seriouspoly.things;

import seriouspoly.SpecificThing;

/**
 * Created by Kyle on 6/20/2017.
 */
public class Phone implements SpecificThing {
    
    private String name;
    
    public void call(String number) {
        System.out.println("Calling " + number);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
