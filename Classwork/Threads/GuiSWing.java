// Swing java GUI for the GUI class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

// gui
class GuiSWing {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
 
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.setBounds(50, 50, 100, 50);
        button2.setBounds(150, 100, 100, 30);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int r = rand.nextInt(256);
                int g = rand.nextInt(256);
                int b = rand.nextInt(256);
                frame.getContentPane().setBackground(new Color(r, g, b)); // Change frame background color to random color
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.WHITE); // Change frame background color to white
                
            }
        });

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        //frame.getContentPane().add(button2);

        frame.setVisible(true);
    }
}