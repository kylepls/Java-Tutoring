package swing;

import java.awt.*;

import javax.swing.*;

public class GraphicsDay1 {
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Program");
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new GraphicsPanel());
        frame.setSize(700, 500);
        frame.setVisible(true);
        
        while (true) {
            Thread.sleep(1_000);
            frame.repaint();
        }
    }
    
    
    public static class GraphicsPanel extends JPanel {
        
        private boolean t;
        
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.BLACK);
            t = !t;
            g.drawRect(0, 0, 100, 100);
            if (t) {
                g.drawLine(0, 0, 100, 100);
            } else {
                g.drawLine(100, 0, 0, 100);
            }
        }
    }
}
