import javax.swing.*;
public class OptionPaneDemo {
    public static void main(String[] args) {
        // Input dialog
        String name = JOptionPane.showInputDialog("Enter your name:");
        // Different message dialog types
        JOptionPane.showMessageDialog(null,
            "Hello, " + name + "!",
            "Welcome",
            JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
            "Something went wrong!",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        // Confirm dialog
        int choice = JOptionPane.showConfirmDialog(null,
            "Do you want to exit?",
            "Confirm",
            JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) System.exit(0);
    }
}