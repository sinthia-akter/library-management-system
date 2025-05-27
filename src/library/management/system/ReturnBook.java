package library.management.system;

import javax.swing.*;
import java.awt.*;

public class ReturnBook extends JFrame {
    
    private final JTextField studentIdField;
    private final JTextField studentNameField;
    private final JTextField bookIdField;
    private final JTextField bookNameField;
    private final JTextField authorField;
    private final JTextField issueDateField;
    private final JTextField returnDateField;
    private final Dashboard dashboardWindow;
    
    public ReturnBook(Dashboard dashboardWindow){
        this.dashboardWindow = dashboardWindow;
        
        setTitle("Library Management System");
        setSize(800, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("RETURN BOOK", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 20, 300, 30);
        add(titleLabel);
        
        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setBounds(245, 72, 100, 25);
        add(studentIdLabel);

        studentIdField = new JTextField();
        studentIdField.setBounds(355, 72, 200, 25);
        add(studentIdField);
        
        JLabel bookIdLabel = new JLabel("Book ID:");
        bookIdLabel.setBounds(245, 124, 100, 25);
        add(bookIdLabel);

        bookIdField = new JTextField();
        bookIdField.setBounds(355, 124, 200, 25);
        add(bookIdField);
        
        JLabel studentNameLabel = new JLabel("Student Name:");
        studentNameLabel.setBounds(245, 176, 100, 25);
        add(studentNameLabel);

        studentNameField = new JTextField();
        studentNameField.setBounds(355, 176, 200, 25);
        add(studentNameField);
        
        JLabel bookNameLabel = new JLabel("Book Name:");
        bookNameLabel.setBounds(245, 228, 100, 25);
        add(bookNameLabel);

        bookNameField = new JTextField();
        bookNameField.setBounds(355, 228, 200, 25);
        add(bookNameField);
        
        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(245, 280, 100, 25);
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(355, 280, 200, 25);
        add(authorField);
        
        JLabel issueDateLabel = new JLabel("Issued Date:");
        issueDateLabel.setBounds(245, 332, 100, 25);
        add(issueDateLabel);
        
        issueDateField = new JTextField();
        issueDateField.setBounds(355, 332, 200, 25);
        add(issueDateField);  
        
        JLabel returnDateLabel = new JLabel("Return Date:");
        returnDateLabel.setBounds(245, 384, 100, 25);
        add(returnDateLabel);
        
        returnDateField = new JTextField();
        returnDateField.setBounds(355, 384, 200, 25);
        add(returnDateField);
        
        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 445, 100, 30);
        add(backButton);

        JButton removeButton = new JButton("RETURN");
        removeButton.setBounds(350, 445, 100, 30);
        add(removeButton);
        
        JButton clearButton = new JButton("CLEAR");
        clearButton.setBounds(500, 445, 100, 30);
        add(clearButton);
        
        clearButton.addActionListener(e -> {
        studentIdField.setText("");
        studentNameField.setText("");
        bookIdField.setText("");
        bookNameField.setText("");
        authorField.setText("");
        issueDateField.setText("");
        returnDateField.setText("");
    });
        
        backButton.addActionListener(e -> {
        this.dispose();
        dashboardWindow.setVisible(true);
        });
        
    }
    
}
