package library.management.system;

import javax.swing.*;
import java.awt.*;

public class AddNewBook extends JFrame {
    
    private final JTextField bookIdField;
    private final JTextField bookNameField;
    private final JTextField authorField;
    private final JTextField publisherField;
    private final JTextField copyCountField;
    private final JComboBox<String> deptComboBox;
    private final Dashboard dashboardWindow;
    
    public AddNewBook(Dashboard dashboardWindow) {
        this.dashboardWindow = dashboardWindow;
        
        setTitle("Library Management System");
        setSize(800, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("ADD NEW BOOK", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 20, 300, 30);
        add(titleLabel);
        
        JLabel bookIdLabel = new JLabel("Book ID:");
        bookIdLabel.setBounds(250, 80, 100, 25);
        add(bookIdLabel);

        bookIdField = new JTextField();
        bookIdField.setBounds(350, 80, 200, 25);
        add(bookIdField);
        
        JLabel bookNameLabel = new JLabel("Book Name:");
        bookNameLabel.setBounds(250, 130, 100, 25);
        add(bookNameLabel);

        bookNameField = new JTextField();
        bookNameField.setBounds(350, 130, 200, 25);
        add(bookNameField);
        
        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(250, 180, 100, 25);
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(350, 180, 200, 25);
        add(authorField);
        
        JLabel publisherLabel = new JLabel("Publisher:");
        publisherLabel.setBounds(250, 230, 100, 25);
        add(publisherLabel);

        publisherField = new JTextField();
        publisherField.setBounds(350, 230, 200, 25);
        add(publisherField);
        
        JLabel copyCountLabel = new JLabel("Total Copies:");
        copyCountLabel.setBounds(250, 280, 100, 25);
        add(copyCountLabel);

        copyCountField = new JTextField();
        copyCountField.setBounds(350, 280, 200, 25);
        add(copyCountField);
        
        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(250, 330, 100, 25);
        add(departmentLabel);
        
        deptComboBox = new JComboBox<>(new String[]{"CSE", "IT", "CE", "EEE", "ME", "ECE", "SE"});
        deptComboBox.setBounds(350, 330, 200, 25);
        add(deptComboBox);   
        
        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 398, 100, 30);
        add(backButton);

        JButton addButton = new JButton("ADD");
        addButton.setBounds(350, 398, 100, 30);
        add(addButton);
        
        JButton clearButton = new JButton("CLEAR");
        clearButton.setBounds(500, 398, 100, 30);
        add(clearButton);
        
        clearButton.addActionListener(e -> {
        bookIdField.setText("");
        bookNameField.setText("");
        authorField.setText("");
        publisherField.setText("");
        copyCountField.setText("");
        deptComboBox.setSelectedIndex(0); 
    });
        
        backButton.addActionListener(e -> {
        this.dispose();
        dashboardWindow.setVisible(true);
        });
    }   
}
