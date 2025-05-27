package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    private final JButton bookDetailsButton;
    private final JButton addBooksButton;
    private final JButton removeBookButton;
    private final JButton removeStudentButton;
    private final JButton studentRegButton;
    private final JButton issueBookButton;
    private final JButton returnBookButton;
    private final JButton logoutButton;
    private final LibraryManagementSystem loginWindow;

    public Dashboard(LibraryManagementSystem loginWindow) {
        this.loginWindow = loginWindow;

        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("DASHBOARD");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(220, 30, 200, 35);
        add(titleLabel);

        bookDetailsButton = new JButton("BOOK DETAILS");
        bookDetailsButton.setBounds(60, 90, 200, 35);
        add(bookDetailsButton);

        addBooksButton = new JButton("ADD NEW BOOKS");
        addBooksButton.setBounds(60, 150, 200, 35);
        add(addBooksButton);

        removeBookButton = new JButton("REMOVE BOOK");
        removeBookButton.setBounds(60, 210, 200, 35);
        add(removeBookButton);

        removeStudentButton = new JButton("REMOVE STUDENTS");
        removeStudentButton.setBounds(60, 270, 200, 35);
        add(removeStudentButton);

        studentRegButton = new JButton("STUDENT REGISTRATION");
        studentRegButton.setBounds(330, 90, 200, 35);
        add(studentRegButton);

        issueBookButton = new JButton("ISSUE BOOK");
        issueBookButton.setBounds(330, 150, 200, 35);
        add(issueBookButton);

        returnBookButton = new JButton("RETURN BOOK");
        returnBookButton.setBounds(330, 210, 200, 35);
        add(returnBookButton);

        logoutButton = new JButton("LOG OUT");
        logoutButton.setBounds(330, 270, 200, 35);
        logoutButton.addActionListener(this);
        add(logoutButton);

        
        bookDetailsButton.addActionListener(e -> {
            new BookDetails(this).setVisible(true);
            this.dispose();
        });

        addBooksButton.addActionListener(e -> {
            new AddNewBook(this).setVisible(true); 
            this.dispose();
        });

        removeBookButton.addActionListener(e -> {
            new RemoveBooks(this).setVisible(true); 
            this.dispose();
        });

        removeStudentButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Remove Students functionality will be added later.");
        });

        studentRegButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Student Registration functionality will be added later.");
        });

        issueBookButton.addActionListener(e -> {
            new IssueBook(this).setVisible(true); 
            this.dispose();
        });

        returnBookButton.addActionListener(e -> {
            new ReturnBook(this).setVisible(true); 
            this.dispose();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            loginWindow.setVisible(true);
            this.dispose();
        }
    }
}
