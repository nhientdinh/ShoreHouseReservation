package shorehouse.com;

import javax.swing.*;
import java.awt.*;

public class LogInWindow extends JFrame {
    private static final long serialVersionUID = 1L;

	public LogInWindow() {
        // Set up the login window
        setTitle("Login");
        setSize(400, 200);
        setLocationRelativeTo(null);

        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        add(panel);

        // Username Field
        panel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        panel.add(usernameField);

        // Password Field
        panel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            // Placeholder for login logic
            JOptionPane.showMessageDialog(this, "Login logic will be implemented in Milestone #2.");
        });
        panel.add(loginButton);
    }
}