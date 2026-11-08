import java.awt.*;
import java.awt.event.*;

public class AwtContainerDemo extends Frame implements ActionListener {
    TextField nameField;
    TextField idField;
    Label statusLabel;
    Button submitButton;
    Button clearButton;

    public AwtContainerDemo() {
        setTitle("AWT Container and Component Demo");
        setSize(450, 300);
        setLayout(new BorderLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        Label titleLabel = new Label("Student Information", Label.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        Panel inputPanel = new Panel();
        inputPanel.setLayout(new GridLayout(3, 2, 5, 5));

        inputPanel.add(new Label("Student Name:"));
        nameField = new TextField(20);
        inputPanel.add(nameField);

        inputPanel.add(new Label("Student ID:"));
        idField = new TextField(20);
        inputPanel.add(idField);

        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        inputPanel.add(submitButton);
        inputPanel.add(clearButton);

        statusLabel = new Label("Enter student information", Label.CENTER);

        add(inputPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String id = idField.getText();
            statusLabel.setText("Name: " + name + " | ID: " + id);
        } else if (e.getSource() == clearButton) {
            nameField.setText("");
            idField.setText("");
            statusLabel.setText("Fields cleared");
        }
    }

    public static void main(String[] args) {
        new AwtContainerDemo();
    }
}