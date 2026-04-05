import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class SwingPopup extends JFrame implements ActionListener {
    JPanel panel;
    JPopupMenu popup;
    SwingPopup() {
        super("Right-Click Popup Menu");
        panel = new JPanel();
        popup = new JPopupMenu();
        JMenuItem r = new JMenuItem("Red");
        JMenuItem g = new JMenuItem("Green");
        JMenuItem b = new JMenuItem("Blue");
        r.addActionListener(this); g.addActionListener(this); 
b.addActionListener(this);
        popup.add(r); popup.add(g); popup.addSeparator(); popup.add(b);
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) popup.show(e.getComponent(), e.getX(), 
e.getY());
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) popup.show(e.getComponent(), e.getX(), 
e.getY());
            }
        });
        getContentPane().add(panel);
        setSize(350, 250); setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()) {
            case "Red":   panel.setBackground(Color.red);   break;
            case "Green": panel.setBackground(Color.green); break;
            case "Blue":  panel.setBackground(Color.blue);  break;
        }
    }
    public static void main(String[] args) { new SwingPopup(); }
}