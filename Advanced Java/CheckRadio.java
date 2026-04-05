import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class CheckRadio extends JFrame implements ItemListener {
    JLabel result;
    JCheckBox java, python, cpp;
    JRadioButton male, female;
    CheckRadio() {
        super("JCheckBox & JRadioButton");
        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.add(new JLabel("Select Languages:"));
        java   = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp    = new JCheckBox("C++");
        java.addItemListener(this); python.addItemListener(this); 
cpp.addItemListener(this);
        panel.add(java); panel.add(python); panel.add(cpp);
        panel.add(new JLabel("Gender:"));
        ButtonGroup bg = new ButtonGroup();
        male   = new JRadioButton("Male", true);
        female = new JRadioButton("Female");
        bg.add(male); bg.add(female);
        JPanel gPanel = new JPanel();
        gPanel.add(male); gPanel.add(female);
        panel.add(gPanel);
        result = new JLabel("Selections will appear here");
        panel.add(result);
        getContentPane().add(panel);
        setSize(350, 280); setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        String sel = "";
        if (java.isSelected()) sel += "Java ";
        if (python.isSelected()) sel += "Python ";
        if (cpp.isSelected()) sel += "C++ ";
        result.setText("Selected: " + sel);
    }
    public static void main(String[] args) { new CheckRadio(); }
}
