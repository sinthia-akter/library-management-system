package library.management.system;

import javax.swing.*;
import java.awt.*;

public class RemoveBooks extends JFrame {
    
    private final JTextField bookIdField;
    private final JTextField bookNameField;
    private final JTextField authorField;
    private final JTextField publisherField;
    private final JTextField copyCountField;
    private final JTextField departmentField;
    private final JTextField removeCopyField;
    private final Dashboard dashboardWindow;
    
    public RemoveBooks(Dashboard dashboardWindow){
        this.dashboardWindow = dashboardWindow;
        
        setTitle("Library Management System");
        setSize(800, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("REMOVE BOOKS", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 20, 300, 30);
        add(titleLabel);
        
        JLabel bookIdLabel = new JLabel("Book ID:");
        bookIdLabel.setBounds(245, 70, 100, 25);
        add(bookIdLabel);

        bookIdField = new JTextField();
        bookIdField.setBounds(355, 70, 200, 25);
        add(bookIdField);
        
        JLabel bookNameLabel = new JLabel("Book Name:");
        bookNameLabel.setBounds(245, 118, 100, 25);
        add(bookNameLabel);

        bookNameField = new JTextField();
        bookNameField.setBounds(355, 118, 200, 25);
        add(bookNameField);
        
        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(245, 168, 100, 25);
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(355, 168, 200, 25);
        add(authorField);
        
        JLabel publisherLabel = new JLabel("Publisher:");
        publisherLabel.setBounds(245, 218, 100, 25);
        add(publisherLabel);

        publisherField = new JTextField();
        publisherField.setBounds(355, 218, 200, 25);
        add(publisherField);
        
        JLabel copyCountLabel = new JLabel("Total Copies:");
        copyCountLabel.setBounds(245, 268, 100, 25);
        add(copyCountLabel);

        copyCountField = new JTextField();
        copyCountField.setBounds(355, 268, 200, 25);
        add(copyCountField);
        
        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(245, 318, 100, 25);
        add(departmentLabel);
        
        departmentField = new JTextField();
        departmentField.setBounds(355, 318, 200, 25);
        add(departmentField);  
        
        JLabel removeCopyLabel = new JLabel("Remove Copies:");
        removeCopyLabel.setBounds(245, 368, 100, 25);
        add(removeCopyLabel);
        
        removeCopyField = new JTextField();
        removeCopyField.setBounds(355, 368, 200, 25);
        add(removeCopyField);
        
        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 418, 100, 30);
        add(backButton);

        JButton removeButton = new JButton("REMOVE");
        removeButton.setBounds(350, 418, 100, 30);
        add(removeButton);
        
        JButton clearButton = new JButton("CLEAR");
        clearButton.setBounds(500, 418, 100, 30);
        add(clearButton);
        
        clearButton.addActionListener(e -> {
        bookIdField.setText("");
        bookNameField.setText("");
        authorField.setText("");
        publisherField.setText("");
        copyCountField.setText("");
        departmentField.setText("");
        removeCopyField.setText("");
    });
        
        backButton.addActionListener(e -> {
        this.dispose();
        dashboardWindow.setVisible(true);
        });
        
    }
    
}
