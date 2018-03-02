package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Day1 {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("xxx");
        
        // setup
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new FlowLayout());
        
        // Name 
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField(25);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        panel.add(namePanel);
        // End Name
        
        // Age
        JPanel agePanel = new JPanel();
        JLabel ageLabel = new JLabel("Age: ");
        JTextField ageField = new JTextField(25);
        agePanel.add(ageLabel);
        agePanel.add(ageField);
        panel.add(agePanel);
        // End Age
        
        // Submit
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                System.out.println("Submitted " + name + ":" + age);
            }
        });
        panel.add(submit);
        // End Submit
        
        frame.add(panel);
        // end setup
        frame.setVisible(true);
    }
}
