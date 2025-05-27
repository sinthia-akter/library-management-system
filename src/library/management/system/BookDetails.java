package library.management.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BookDetails extends JFrame {

    private final JTextField bookNameField;
    private final JTextField authorField;
    private final JComboBox<String> departmentComboBox;
    private final JTable bookTable;
    private DefaultTableModel tableModel;
    private final Dashboard dashboardWindow;

    private final List<Book> bookData = new ArrayList<>();

    private final JRadioButton searchByBookButton;
    private final JRadioButton searchByDepartmentButton;
    private final ButtonGroup searchOptionGroup;

    public BookDetails(Dashboard dashboardWindow) {
        this.dashboardWindow = dashboardWindow;

        setTitle("Library Management System");
        setSize(800, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("BOOK DETAILS", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 20, 300, 30);
        add(titleLabel);

        searchByBookButton = new JRadioButton("Search by Book");
        searchByBookButton.setBounds(50, 60, 200, 25);
        searchByBookButton.setSelected(true);
        add(searchByBookButton);

        searchByDepartmentButton = new JRadioButton("Search by Department");
        searchByDepartmentButton.setBounds(250, 60, 200, 25);
        add(searchByDepartmentButton);

        searchOptionGroup = new ButtonGroup();
        searchOptionGroup.add(searchByBookButton);
        searchOptionGroup.add(searchByDepartmentButton);

        JLabel bookLabel = new JLabel("Book Name:");
        bookLabel.setBounds(50, 100, 100, 25);
        bookLabel.setVisible(false);
        add(bookLabel);

        bookNameField = new JTextField();
        bookNameField.setBounds(150, 100, 200, 25);
        bookNameField.setVisible(false);
        add(bookNameField);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(400, 100, 60, 25);
        authorLabel.setVisible(false);
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(470, 100, 200, 25);
        authorField.setVisible(false);
        add(authorField);

        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(50, 100, 100, 25);
        departmentLabel.setVisible(false);
        add(departmentLabel);

        departmentComboBox = new JComboBox<>(new String[]{"-- Select --", "CSE", "IT", "CE", "EEE", "ME", "ECE", "SE"});
        departmentComboBox.setBounds(150, 100, 200, 25);
        departmentComboBox.setVisible(false);
        add(departmentComboBox);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(670, 60, 80, 25);
        add(searchButton);

        String[] columns = {"Book ID", "Book Name", "Author", "Publisher", "Department", "Copy", "Issued", "Available"};
        tableModel = new DefaultTableModel(columns, 0);
        bookTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        scrollPane.setBounds(50, 148, 700, 250);
        add(scrollPane);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(200, 418, 100, 30);
        add(backButton);

        JButton issueButton = new JButton("ISSUE");
        issueButton.setBounds(500, 418, 100, 30);
        add(issueButton);

        searchByBookButton.addActionListener(e -> {
            bookLabel.setVisible(true);
            bookNameField.setVisible(true);
            authorLabel.setVisible(true);
            authorField.setVisible(true);
            departmentLabel.setVisible(false);
            departmentComboBox.setVisible(false);
        });

        searchByDepartmentButton.addActionListener(e -> {
            bookLabel.setVisible(false);
            bookNameField.setVisible(false);
            authorLabel.setVisible(false);
            authorField.setVisible(false);
            departmentLabel.setVisible(true);
            departmentComboBox.setVisible(true);
        });

        bookData.add(new Book("CSE0001", "Book A", "Author A", "Publisher D", "CSE", 10, 2, 8));
        bookData.add(new Book("IT0001", "Book B", "Author B", "Publisher B", "IT", 12, 4, 8));
        bookData.add(new Book("CSE0002", "Book C", "Author C", "Publisher C", "CSE", 8, 1, 7));
        bookData.add(new Book("CE0001", "Book D", "Author D", "Publisher D", "CE", 15, 5, 10));
        bookData.add(new Book("IT0002", "Book C", "Author B", "Publisher B", "IT", 5, 4, 1));
        bookData.add(new Book("IT0003", "Book B", "Author D", "Publisher C", "IT", 3, 3, 0));
        bookData.add(new Book("CSE0001", "Book A", "Author A", "Publisher A", "CSE", 10, 2, 8));
        bookData.add(new Book("IT0001", "Book B", "Author B", "Publisher B", "IT", 12, 4, 8));
        bookData.add(new Book("CSE0002", "Book C", "Author C", "Publisher C", "CSE", 8, 1, 7));
        bookData.add(new Book("CE0001", "Book D", "Author D", "Publisher D", "CE", 15, 5, 10));
        bookData.add(new Book("IT0002", "Book C", "Author B", "Publisher B", "IT", 5, 4, 1));
        bookData.add(new Book("IT0003", "Book B", "Author D", "Publisher C", "IT", 3, 3, 0));
        bookData.add(new Book("CSE0001", "Book A", "Author A", "Publisher A", "CSE", 10, 2, 8));
        bookData.add(new Book("IT0001", "Book B", "Author B", "Publisher B", "IT", 12, 4, 8));
        bookData.add(new Book("CSE0002", "Book C", "Author C", "Publisher C", "CSE", 8, 1, 7));
        bookData.add(new Book("CE0001", "Book D", "Author D", "Publisher D", "CE", 15, 5, 10));
        bookData.add(new Book("IT0002", "Book C", "Author B", "Publisher B", "IT", 5, 4, 1));
        bookData.add(new Book("IT0003", "Book B", "Author D", "Publisher C", "IT", 3, 3, 0));
        bookData.add(new Book("CSE0001", "Book A", "Author A", "Publisher A", "CSE", 10, 2, 8));
        bookData.add(new Book("IT0001", "Book B", "Author B", "Publisher B", "IT", 12, 4, 8));
        bookData.add(new Book("CSE0002", "Book C", "Author C", "Publisher C", "CSE", 8, 1, 7));
        bookData.add(new Book("CE0001", "Book D", "Author D", "Publisher D", "CE", 15, 5, 10));
        bookData.add(new Book("IT0002", "Book C", "Author B", "Publisher B", "IT", 5, 4, 1));
        bookData.add(new Book("IT0003", "Book B", "Author D", "Publisher C", "IT", 3, 3, 0));

        searchButton.addActionListener(e -> {
            String bookName = bookNameField.getText().trim().toLowerCase();
            String authorName = authorField.getText().trim().toLowerCase();
            String departmentName = null;

            if (searchByBookButton.isSelected()) {
                departmentName = null;
            } else if (searchByDepartmentButton.isSelected()) {
                departmentName = (String) departmentComboBox.getSelectedItem();
                if (departmentComboBox.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select a department.");
                    return;
                }
                bookName = "";
                authorName = "";
            }

            tableModel.setRowCount(0);
            boolean matchFound = false;

            for (Book book : bookData) {
                boolean matches = true;

                if (!bookName.isEmpty() && !book.getBookName().toLowerCase().contains(bookName)) {
                    matches = false;
                }
                if (!authorName.isEmpty() && !book.getAuthor().toLowerCase().contains(authorName)) {
                    matches = false;
                }

                if (departmentName != null && !departmentName.isEmpty() && !book.getDepartment().equalsIgnoreCase(departmentName)) {
                    matches = false;
                }

                if (matches) {
                    tableModel.addRow(new Object[]{
                            book.getBookId(), book.getBookName(), book.getAuthor(),
                            book.getPublisher(), book.getDepartment(), book.getCopyCount(),
                            book.getIssuedCount(), book.getAvailableCount()
                    });
                    matchFound = true;
                }
            }

            if (!matchFound) {
                JOptionPane.showMessageDialog(this, "No books found matching the search criteria.", "No Results", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        backButton.addActionListener(e -> {
            this.dispose();
            dashboardWindow.setVisible(true);
        });

        issueButton.addActionListener(e -> {
            this.dispose();
            new IssueBook(dashboardWindow).setVisible(true);
        });
    }

    static class Book {
        private final String bookId;
        private final String bookName;
        private final String author;
        private final String publisher;
        private final String department;
        private final int copyCount;
        private final int issuedCount;
        private final int availableCount;

        public Book(String bookId, String bookName, String author, String publisher, String department, int copyCount, int issuedCount, int availableCount) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.author = author;
            this.publisher = publisher;
            this.department = department;
            this.copyCount = copyCount;
            this.issuedCount = issuedCount;
            this.availableCount = availableCount;
        }

        public String getBookId() {
            return bookId;
        }

        public String getBookName() {
            return bookName;
        }

        public String getAuthor() {
            return author;
        }

        public String getPublisher() {
            return publisher;
        }

        public String getDepartment() {
            return department;
        }

        public int getCopyCount() {
            return copyCount;
        }

        public int getIssuedCount() {
            return issuedCount;
        }

        public int getAvailableCount() {
            return availableCount;
        }
    }
}
