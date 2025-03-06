package shorehouse.com;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {
    private static final long serialVersionUID = 1L;

	public MainGUI() {
        // Set up the main window
        setTitle("Cape May Shorehouse Reservation");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create a panel to hold the buttons
        JPanel panel = new JPanel();
        add(panel);

        // Create Account Button
        JButton createAccountButton = new JButton("Create Account");
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateAccountWindow().setVisible(true);
            }
        });
        panel.add(createAccountButton);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LogInWindow().setVisible(true);
            }
        });
        panel.add(loginButton);

        // Cancel Button
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(cancelButton);
    
	
        // Load and resize the image
        ImageIcon imageIcon = new ImageIcon("image/CapeMay.jpg");
        Image scaledImage = imageIcon.getImage().getScaledInstance(302, 467, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        // Create a JLabel with the resized image
        JLabel imageLabel = new JLabel(resizedIcon);

        //Add image label to the center of the frame
    	add(imageLabel, BorderLayout.CENTER);
    	
    	//Add button panel to the bottom 
    	add(panel, BorderLayout.SOUTH); ;
    }
	

    public static void main(String[] args) {
        // Run the main GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
}
