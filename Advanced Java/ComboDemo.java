import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class ComboDemo extends JFrame implements ActionListener {
    JComboBox<String> combo;
    JLabel msg;
    ComboDemo() {
        super("JComboBox Demo");
        String[] countries = {"India", "USA", "UK", "Japan", "Germany"};
        combo = new JComboBox<>(countries);
        combo.addActionListener(this);
        msg = new JLabel("Select a country");
        JPanel p = new JPanel();
        p.add(new JLabel("Country:")); p.add(combo); p.add(msg);
        getContentPane().add(p);
        setSize(400, 150); setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        msg.setText("Selected: " + combo.getSelectedItem());
    }
    public static void main(String[] args) { new ComboDemo(); }
}
