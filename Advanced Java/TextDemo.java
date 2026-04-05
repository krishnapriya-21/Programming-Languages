import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class TextDemo extends JFrame implements ActionListener {
    JTextField tfName, tfAge;
    JTextArea tArea;
    JButton submit;
    TextDemo() {
        super("JTextField & JTextArea Demo");
        JPanel p = new JPanel(new GridLayout(4, 2, 5, 5));
        p.add(new JLabel("Name:")); tfName = new JTextField(15); p.add(tfName);
        p.add(new JLabel("Age:"));  tfAge  = new JTextField(15); p.add(tfAge);
        submit = new JButton("Submit"); submit.addActionListener(this);
        p.add(submit);
        tArea = new JTextArea(5, 30);
        tArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(tArea);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(p, "North");
        getContentPane().add(scroll, "Center");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        tArea.append("Name: " + tfName.getText() + "\n");
        tArea.append("Age: "  + tfAge.getText()  + "\n\n");
        tfName.setText(""); tfAge.setText("");
    }
    public static void main(String[] args) { new TextDemo(); }
}
