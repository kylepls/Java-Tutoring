package swing;

import java.awt.*;

import javax.swing.*;

public class House {
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("House");
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new GraphicsPanel());
        frame.setSize(700, 500);
        frame.setVisible(true);
    }
    
    
    public static class GraphicsPanel extends JPanel {
        
        static final double ROOF_HEIGHT_SCALE = 0.3;
        static final double BUILDING_HEIGHT_SCALE = 0.5;
        static final double TOTAL_HEIGHT_SCALE = ROOF_HEIGHT_SCALE + BUILDING_HEIGHT_SCALE;
        static final double BUILDING_WIDTH_SCALE = 0.5;
        static final double DOOR_WIDTH_SCALE = 0.1;
        static final double DOOR_HEIGHT_SCALE = 0.3;
        static final double WINDOW_SIZE_SCALE = 0.1;
        static final double WINDOW_X_OFFSET_SCALE = 0.05;
        static final double WINDOW_Y_OFFSET_SCALE = 0.07;
        
        private int totalHeight;
        private int buildingWidth;
        private int roofHeight;
        private int xOffset;
        private int yOffset;
        private int doorHeight;
        private int doorStart;
        private int doorWidth;
        
        @Override
        public void paintComponent(Graphics g) {
            calculateFields();
            drawOutline(g);
            drawDoor(g);
            drawWindows(g);
        }
        
        private void calculateFields() {
            buildingWidth = (int) (getWidth() * BUILDING_WIDTH_SCALE);
            totalHeight = (int) (getHeight() * TOTAL_HEIGHT_SCALE);
            roofHeight = (int) (getHeight() * ROOF_HEIGHT_SCALE);
            
            xOffset = getWidth() / 2 - buildingWidth / 2;
            yOffset = getHeight() / 2 - totalHeight / 2;
            
            doorWidth = (int) (getWidth() * DOOR_WIDTH_SCALE);
            doorHeight = (int) (getHeight() * DOOR_HEIGHT_SCALE);
            doorStart = xOffset + buildingWidth / 2 - doorWidth / 2;
        }
        
        private void drawDoor(Graphics g) {
            g.drawRect(doorStart, totalHeight - doorHeight + yOffset, doorWidth, doorHeight);
        }
        
        private void drawOutline(Graphics g) {
            int[] xPoints = {0, 0, buildingWidth / 2, buildingWidth, buildingWidth};
            addToArray(xPoints, xOffset);
            
            int[] yPoints = {totalHeight, roofHeight, 0, roofHeight, totalHeight};
            addToArray(yPoints, yOffset);
            
            g.drawPolygon(xPoints, yPoints, 5);
        }
        
        private void drawWindows(Graphics g) {
            // do not need to expose window vars
            int windowSizeX = (int) (getWidth() * WINDOW_SIZE_SCALE);
            int windowSizeY = (int) (getHeight() * WINDOW_SIZE_SCALE);
            int windowXOffset = (int) (getWidth() * WINDOW_X_OFFSET_SCALE);
            int windowYOffset = (int) (getHeight() * WINDOW_Y_OFFSET_SCALE);
            
            int firstWindowX = doorStart - windowSizeX - windowXOffset;
            int windowY = totalHeight - doorHeight - windowYOffset - windowSizeY + yOffset;
            drawWindow(g, firstWindowX, windowY, windowSizeX, windowSizeY);
            
            int secondWindowX = doorStart + windowSizeX + windowXOffset;
            drawWindow(g, secondWindowX, windowY, windowSizeX, windowSizeY);
        }
        
        private void drawWindow(Graphics g, int x, int y, int sizex, int sizey) {
            g.drawRect(x, y, sizex, sizey);
            g.drawLine(x, y + sizey / 2, x + sizex, y + sizey / 2);
            g.drawLine(x + sizex / 2, y, x + sizex / 2, y + sizey);
        }
        
        private void addToArray(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] + value;
            }
        }
    }
}
