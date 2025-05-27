 package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener {
    
    private final JTextField usernameTextField;
    private final JPasswordField passwordField;
    private final JButton loginButton, cancelButton;
    
    public LibraryManagementSystem() {
    
        setTitle("Library Management System");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(180, 30, 300, 30);
        add(titleLabel);
        
        JLabel usernameLabel = new JLabel("USERNAME");
        usernameLabel.setBounds(75, 85, 100, 25);
        add(usernameLabel);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(175, 85, 200, 25);
        add(usernameTextField);
        
        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(75, 135, 100, 25);
        add(passwordLabel);
        
        passwordField = new JPasswordField(); 
        passwordField.setBounds(175, 135, 200, 25);
        add(passwordField);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 190, 80, 30);
        loginButton.addActionListener(this);
        add(loginButton);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(265, 190, 80, 30);
        cancelButton.addActionListener(this);
        add(cancelButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameTextField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                new Dashboard(this).setVisible(true); 
                usernameTextField.setText("");
                passwordField.setText("");
                this.setVisible(false); 
            } 
            
            else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                usernameTextField.setText("");
                passwordField.setText("");
                usernameTextField.requestFocusInWindow();
            }
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LibraryManagementSystem().setVisible(true);
        });
    }
}
