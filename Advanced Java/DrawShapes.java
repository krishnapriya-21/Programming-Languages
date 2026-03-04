import java.applet.*;
import java.awt.*;

public class DrawShapes extends Applet {
    public void paint(Graphics g) {
        // Draw line
        g.setColor(Color.black);
        g.drawLine(50, 50, 200, 50);
        // Draw rectangle (outline)
        g.setColor(Color.blue);
        g.drawRect(50, 80, 150, 80);
        // Filled rectangle
        g.setColor(Color.red);
        g.fillRect(50, 180, 150, 80);
        // Draw oval/ellipse (outline)
        g.setColor(Color.green);
        g.drawOval(250, 80, 150, 100);
        // Filled oval
        g.setColor(Color.yellow);
        g.fillOval(250, 200, 150, 100);
        // Rounded rectangle
        g.setColor(Color.magenta);
        g.fillRoundRect(450, 80, 150, 100, 30, 30);
        // Draw arc
        g.setColor(Color.cyan);
        g.fillArc(450, 200, 150, 100, 0, 180);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Applet in Frame");
        DrawShapes applet = new DrawShapes();
        frame.add(applet);
        frame.setSize(700, 400);
        frame.setVisible(true);

        // Call applet lifecycle methods manually
        applet.init();
        applet.start();
    }
}
