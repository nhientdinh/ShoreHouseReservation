package shorehouse.com;

import javax.swing.*;
import java.awt.*;

public class CreateAccountWindow extends JFrame {
    private static final long serialVersionUID = 1L;

	public CreateAccountWindow() {
        // Set up the account creation window
        setTitle("Create Account");
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        add(panel);

        // Username Field
        panel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        panel.add(usernameField);

        // Password Field
        panel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);

        // Confirm Password Field
        panel.add(new JLabel("Confirm Password:"));
        JPasswordField confirmPasswordField = new JPasswordField();
        panel.add(confirmPasswordField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Placeholder for account creation logic
            JOptionPane.showMessageDialog(this, "Account creation logic will be implemented in Milestone #2.");
        });
        panel.add(submitButton);
    }
}
