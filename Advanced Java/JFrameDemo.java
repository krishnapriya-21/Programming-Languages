import javax.swing.*;
import java.awt.*;
class MyJFrame extends JFrame {
    MyJFrame() {
        super("My JFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen
        setBackground(Color.lightGray);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);
        g.drawString("Hello Swing JFrame!", 100, 150);
    }
}
public class JFrameDemo {
    public static void main(String[] args) {
        new MyJFrame();
    }
}