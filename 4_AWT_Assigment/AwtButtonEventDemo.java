import java.awt.*;
import java.awt.event.*;

public class AwtButtonEventDemo extends Frame implements ActionListener {

    Label headingLabel;
    Label statusLabel;
    Button okButton, submitButton, cancelButton;

    public AwtButtonEventDemo() {
        setTitle("AWT Button Event Demo");
        setSize(400, 250);
        setLayout(new BorderLayout(10, 10));

        headingLabel = new Label("Event Handling Using Buttons in Java AWT", Label.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 16));

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        okButton = new Button("OK");
        submitButton = new Button("Submit");
        cancelButton = new Button("Cancel");

        okButton.addActionListener(this);
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);

        buttonPanel.add(okButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);

        statusLabel = new Label("Click a button to see the message.", Label.CENTER);

        add(headingLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "OK" -> statusLabel.setText("You clicked OK button.");
            case "Submit" -> statusLabel.setText("You clicked Submit button.");
            case "Cancel" -> statusLabel.setText("You clicked Cancel button.");
        }
    }

    public static void main(String[] args) {
        new AwtButtonEventDemo();
    }
}
