import javax.swing.*; import javax.swing.event.*; import java.awt.*;
public class ListDemo extends JFrame implements ListSelectionListener {
    JList<String> list;
    JLabel msg;
    ListDemo() {
        super("JList Demo");
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Pink", "Cyan"};
        list = new JList<>(colors);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);
        msg = new JLabel("Select a color");
        JPanel p = new JPanel();
        p.add(new JScrollPane(list));
        p.add(msg);
        getContentPane().add(p);
        setSize(300, 250); setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true);
    }
    public void valueChanged(ListSelectionEvent e) {
        String sel = list.getSelectedValue();
        msg.setText("Selected: " + sel);
    }
    public static void main(String[] args) { new ListDemo(); }
}