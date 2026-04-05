import javax.swing.*; import javax.swing.event.*; import java.awt.*;
public class SliderDemo extends JFrame implements ChangeListener {
    JSlider red, green, blue;
    JPanel colorBox;
    SliderDemo() {
        super("RGB Slider Demo");
        red   = new JSlider(0, 255, 0);
        green = new JSlider(0, 255, 0);
        blue  = new JSlider(0, 255, 128);
        red.setMajorTickSpacing(50); red.setPaintTicks(true); 
red.setPaintLabels(true);
        red.addChangeListener(this);
        green.addChangeListener(this);
        blue.addChangeListener(this);
        colorBox = new JPanel();
        colorBox.setPreferredSize(new Dimension(200, 100));
        JPanel controls = new JPanel(new GridLayout(4, 1));
        controls.add(new JLabel("Red:")); controls.add(red);
        controls.add(new JLabel("Green:")); controls.add(green);
        controls.add(new JLabel("Blue:")); controls.add(blue);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(controls, "North");
        getContentPane().add(colorBox, "Center");
        setSize(400, 350); setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true);
        updateColor();
    }
    void updateColor() {
        colorBox.setBackground(new Color(red.getValue(), green.getValue(), 
blue.getValue()));
    }
    public void stateChanged(ChangeEvent e) { updateColor(); }
    public static void main(String[] args) { new SliderDemo(); }
}

