import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingBasics extends JFrame implements ActionListener {
    JPanel panel;
    JLabel label;
    JButton btnRed, btnBlue, btnGreen;
    SwingBasics() {
        super("Swing Basics");
        panel = new JPanel();
        label = new JLabel("Click a button to change background!");
        label.setFont(new Font("Arial", Font.BOLD, 14));
        btnRed   = new JButton("Red");
        btnBlue  = new JButton("Blue");
        btnGreen = new JButton("Green");
        // Tooltips
        btnRed.setToolTipText("Sets background to Red");
        btnBlue.setToolTipText("Sets background to Blue");
        btnGreen.setToolTipText("Sets background to Green");
        // Keyboard shortcuts (Alt+R, Alt+B, Alt+G)
        btnRed.setMnemonic('R');
        btnBlue.setMnemonic('B');
        btnGreen.setMnemonic('G');
        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);
        btnGreen.addActionListener(this);
        panel.add(label);
        panel.add(btnRed); panel.add(btnBlue); panel.add(btnGreen);
        getContentPane().add(panel);
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (cmd.equals("Red"))   panel.setBackground(Color.red);
        else if (cmd.equals("Blue"))  panel.setBackground(Color.blue);
        else panel.setBackground(Color.green);
    }
    public static void main(String[] args) { new SwingBasics(); }
}
