package game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kyle on 6/13/2017.
 */
public class Game {
    
    private static final int SIZE_X = 10;
    private static final int SIZE_Y = 10;
    private static final int MAX_LENGTH = 5;
    private static final int TOTAL_NUM_OF_BOATS = 5;
    
    private final ArrayList<Boat> boats;
    private final Scanner scanner;
    
    private int turns;
    
    public Game() {
        this.boats = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.turns = 0;
    }
    
    public void start() {
        generateBoats();
        printGame();
        listenForInput();
        end();
    }
    
    private void end() {
        System.out.println("You sunk all the boats in " + turns + " turns");
    }
    
    private void listenForInput() {
        while (isABoatAlive()) {
            String input = scanner.nextLine();
            Point point = parseInputString(input);
            
            String result;
            Boat boat = getBoat(point);
            if (boat != null) {
                boat.hit(point);
                if (boat.isAlive()) {
                    result = "Hit";
                } else {
                    result = "Sunk";
                }
            } else {
                result = "Miss";
            }
    
            System.out.println(result);
            turns++;
        }
    }
    
    private Point parseInputString(String string) { // 1:1
        String xString = string.substring(0, string.indexOf(":"));
        String yString = string.substring(string.indexOf(":") + 1);
    
        int x = Integer.parseInt(xString);
        int y = Integer.parseInt(yString);
    
        return new Point(x, y);
    }
    
    private void generateBoats() {
        for (int i = 0; i < TOTAL_NUM_OF_BOATS; i++) {
            ArrayList<Point> points = generateNewPoints();
            Boat boat = new Boat(points);
            boats.add(boat);
        }
    }
    
    private boolean isABoatAlive() {
        for (Boat boat : boats) {
            if (boat.isAlive()) {
                return true;
            }
        }
        return false;
    }
    
    private Boat getBoat(Point point) {
        for (Boat boat : boats) {
            if (boat.isAtPoint(point)) {
                return boat;
            }
        }
        return null;
    }
    
    private ArrayList<Point> generateNewPoints() {
        int length = (int) (Math.random() * (MAX_LENGTH - 1)) + 1;
        boolean isX = Math.random() > 0.5;
        
        Point start = null;
        while (start == null || getBoat(start) != null) {
            start = new Point((int) (Math.random() * SIZE_X), (int) (Math.random() * SIZE_Y));
            
            int bound;
            if (isX) {
                bound = 10 - start.getX();
            } else {
                bound = 10 - start.getY();
            }
            
            if (bound > length) {
                start = null;
            }
        }
        
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            Point newPoint;
            if (isX) {
                newPoint = new Point(start.getX() + i, start.getY());
            } else {
                newPoint = new Point(start.getX(), start.getY() + i);
            }
            points.add(newPoint);
        }
        return points;
    }
    
    public void printGame() {
        StringBuilder sb = new StringBuilder();
        for (int y = 1; y <= SIZE_Y; y++) {
            sb.append(twoChars(y)).append("|");
            for (int x = 1; x <= SIZE_X; x++) {
                Point point = new Point(x, y);
                if (getBoat(point) != null) {
                    sb.append(" X ");
                } else {
                    sb.append("   ");
                }
                sb.append("|");
            }
            sb.append("\n");
        }
        sb.append("   |");
        for (int x = 1; x <= SIZE_X; x++) {
            sb.append(twoChars(x)).append("|");
        }
        System.out.println(sb);
    }
    
    private String twoChars(int number) {
        return String.format("%3d", number);
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
