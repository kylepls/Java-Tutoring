package game;

/**
 * Created by Kyle on 6/13/2017.
 */
public class Point {
    
    private final int x;
    private final int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getY() {
        return y;
    }
    
    public int getX() {
        return x;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Point point = (Point) o;
        
        if (x != point.x) {
            return false;
        }
        return y == point.y;
    }
    
    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
    
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
