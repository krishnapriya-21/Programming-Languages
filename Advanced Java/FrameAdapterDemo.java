

import java.awt.*;
import java.awt.event.*;
class AppFrame extends Frame {
    AppFrame() {
        super("Frame with Adapter");
        setSize(400, 300);
        setBackground(Color.lightGray);
        // WindowAdapter – only override what you need
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 18));
        g.drawString("Click X to close this frame", 80, 150);
    }
}
public class FrameAdapterDemo {
    public static void main(String[] args) { new AppFrame(); }
}
