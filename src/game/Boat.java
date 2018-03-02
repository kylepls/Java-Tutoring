package game;

import java.util.ArrayList;

/**
 * Created by Kyle on 6/13/2017.
 */
public class Boat {
    
    private final ArrayList<Point> locations; // 2:1, 3:1
    
    public Boat(ArrayList<Point> locations) {
        this.locations = locations;
    }
    
    public boolean isAtPoint(Point point) {
        return locations.contains(point);
    }
    
    public boolean hit(Point point) {
        return locations.remove(point);
    }
    
    public boolean isAlive() {
        return locations.size() != 0;
    }
}
