package AWT;

import javax.swing.*;
import java.awt.*;

public class FontDemoSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // clears background before drawing

        // First font: Bold Arial 20pt
        Font f1 = new Font("Arial", Font.BOLD, 20);
        g.setFont(f1);
        g.setColor(Color.blue);
        g.drawString("Bold Arial 20pt", 50, 60);

        // Second font: Italic Times New Roman 24pt
        Font f2 = new Font("Times New Roman", Font.ITALIC, 24);
        g.setFont(f2);
        g.setColor(new Color(150, 0, 150)); // custom purple color
        g.drawString("Italic Times 24pt", 50, 100);

        // Third font: Bold + Italic Courier New 18pt
        Font f3 = new Font("Courier New", Font.BOLD + Font.ITALIC, 18);
        g.setFont(f3);
        g.setColor(Color.red);
        g.drawString("Bold Italic Courier 18pt", 50, 140);
    }

    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("Font Demo in Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);

        // Add our custom JPanel that does the drawing
        frame.add(new FontDemoSwing());

        // Show the window
        frame.setVisible(true);
    }
}
