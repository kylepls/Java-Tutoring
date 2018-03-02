package seriouspoly.things;

import seriouspoly.Thing;

/**
 * Created by Kyle on 6/20/2017.
 */
public class Lamp implements Thing {
    
    private boolean isOn;
    
    public boolean isOn() {
        return isOn;
    }
    
    public void toggleOn() {
        isOn = !isOn;
    }
    
    public void setOn(boolean on) {
        isOn = on;
    }
    
    @Override
    public String getName() {
        return "lamp";
    }
}
