
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class SwingMenu extends JFrame implements ActionListener {
    JPanel panel;
    SwingMenu() {
        super("Swing Menu Demo");
        panel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        // File Menu
        JMenu file = new JMenu("File");
        file.setMnemonic('F');
        JMenuItem newItem  = new JMenuItem("New",  'N');
        JMenuItem openItem = new JMenuItem("Open", 'O');
        JMenuItem saveItem = new JMenuItem("Save", 'S');
        JMenuItem exitItem = new JMenuItem("Exit", 'E');
        exitItem.addActionListener(this);
        file.add(newItem); file.add(openItem); file.addSeparator();
        file.add(saveItem); file.add(exitItem);
        // Color Menu
        JMenu colorMenu = new JMenu("Color");
        JMenuItem c1 = new JMenuItem("Red");
        JMenuItem c2 = new JMenuItem("Green");
        JMenuItem c3 = new JMenuItem("Blue");
        c1.addActionListener(this); c2.addActionListener(this); 
c3.addActionListener(this);
        colorMenu.add(c1); colorMenu.add(c2); colorMenu.add(c3);
        menuBar.add(file); menuBar.add(colorMenu);
        setJMenuBar(menuBar);
        getContentPane().add(panel);
        setSize(400, 300); setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        switch(cmd) {
            case "Exit":  System.exit(0); break;
            case "Red":   panel.setBackground(Color.red);   break;
            case "Green": panel.setBackground(Color.green); break;
            case "Blue":  panel.setBackground(Color.blue);  break;
        }
    }
    public static void main(String[] args) { new SwingMenu(); }
}
