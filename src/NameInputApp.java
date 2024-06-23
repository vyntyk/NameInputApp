import javax.swing.*;

public class NameInputApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Name Input Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setVisible(true);

            String name = JOptionPane.showInputDialog(frame, "Enter your name:");
            if (name != null && !name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Your Name: " + name);
            } else {
                JOptionPane.showMessageDialog(frame, "No name entered.");
            }
        });
    }
}
