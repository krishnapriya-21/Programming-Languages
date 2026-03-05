import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame implements WindowListener {
    MyFrame() {
        super("My Java Frame");
        setSize(400, 300);
        setVisible(true);
        addWindowListener(this);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Hello from AWT Frame!", 80, 150);
    }
    // WindowListener methods
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public static void main(String[] args) {
        new MyFrame();
    }
}
