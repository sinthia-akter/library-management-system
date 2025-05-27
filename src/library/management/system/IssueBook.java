package library.management.system;

import javax.swing.*;
import java.awt.*;

public class IssueBook extends JFrame {
    private final JTextField studentIdField;
    private final JTextField studentNameField;
    private final JTextField libraryCardField;
    private final JTextField bookIdField;
    private final JTextField bookNameField;
    private final JTextField authorField;
    private final JTextField availableField;
    private final JTextField issueDateField;
    private final JTextField returnDateField;
    private final Dashboard dashboardWindow;
    
    public IssueBook(Dashboard dashboardWindow){
        this.dashboardWindow = dashboardWindow;
        
        setTitle("Library Management System");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("ISSUE BOOK", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 20, 300, 30);
        add(titleLabel);
        
        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setBounds(245, 70, 100, 25);
        add(studentIdLabel);

        studentIdField = new JTextField();
        studentIdField.setBounds(355, 70, 200, 25);
        add(studentIdField);
        
        JLabel bookIdLabel = new JLabel("Book ID:");
        bookIdLabel.setBounds(245, 118, 100, 25);
        add(bookIdLabel);

        bookIdField = new JTextField();
        bookIdField.setBounds(355, 118, 200, 25);
        add(bookIdField);
        
        JLabel studentNameLabel = new JLabel("Student Name:");
        studentNameLabel.setBounds(245, 166, 100, 25);
        add(studentNameLabel);

        studentNameField = new JTextField();
        studentNameField.setBounds(355, 166, 200, 25);
        add(studentNameField);
        
        JLabel libraryCardLabel = new JLabel("Library Card:");
        libraryCardLabel.setBounds(245, 214, 100, 25);
        add(libraryCardLabel);

        libraryCardField = new JTextField();
        libraryCardField.setBounds(355, 214, 200, 25);
        add(libraryCardField);
        
        JLabel bookNameLabel = new JLabel("Book Name:");
        bookNameLabel.setBounds(245, 262, 100, 25);
        add(bookNameLabel);

        bookNameField = new JTextField();
        bookNameField.setBounds(355, 262, 200, 25);
        add(bookNameField);
        
        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(245, 310, 100, 25);
        add(authorLabel);
        
        authorField = new JTextField();
        authorField.setBounds(355, 310, 200, 25);
        add(authorField);  
        
        JLabel availableLabel = new JLabel("Available Copy:");
        availableLabel.setBounds(245, 358, 100, 25);
        add(availableLabel);
        
        availableField = new JTextField();
        availableField.setBounds(355, 358, 200, 25);
        add(availableField);
        
        JLabel issueDateLabel = new JLabel("Issued On:");
        issueDateLabel.setBounds(245, 406, 100, 25);
        add(issueDateLabel);
        
        issueDateField = new JTextField();
        issueDateField.setBounds(355, 406, 200, 25);
        add(issueDateField);
        
        JLabel returnDateLabel = new JLabel("Return Date:");
        returnDateLabel.setBounds(245, 454, 100, 25);
        add(returnDateLabel);
        
        returnDateField = new JTextField();
        returnDateField.setBounds(355, 454, 200, 25);
        add(returnDateField);
        
        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 511, 100, 30);
        add(backButton);

        JButton removeButton = new JButton("ISSUE");
        removeButton.setBounds(350, 511, 100, 30);
        add(removeButton);
        
        JButton clearButton = new JButton("CLEAR");
        clearButton.setBounds(500, 511, 100, 30);
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
