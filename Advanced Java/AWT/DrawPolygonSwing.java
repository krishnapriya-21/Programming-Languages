package AWT;

import javax.swing.*;
import java.awt.*;

public class DrawPolygonSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ensures background is cleared

        // Set color to red
        g.setColor(Color.red);

        // Define polygon coordinates
        int[] x = {200, 300, 100, 300, 100, 200};
        int[] y = {50, 300, 100, 100, 300, 50};

        // Draw filled polygon (star-like shape)
        g.fillPolygon(x, y, 6);
    }

    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("Polygon Drawing in Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Add our custom JPanel
        frame.add(new DrawPolygonSwing());

        // Show the window
        frame.setVisible(true);
    }
}

