import java.awt.*;
import java.awt.event.*;

public class AwtMouseKeyEventDemo extends Frame implements KeyListener, MouseListener {
    Label headingLabel;
    Label keyStatusLabel;
    Label mouseStatusLabel;
    TextField textField;
    Panel mousePanel;

    public AwtMouseKeyEventDemo() {
        setTitle("AWT Mouse and Keyboard Event Demo");
        setSize(500, 350);
        setLayout(new GridLayout(5, 1));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        headingLabel = new Label("Mouse and Keyboard Event Handling", Label.CENTER);
        textField = new TextField("Type here");
        keyStatusLabel = new Label("Keyboard event will appear here", Label.CENTER);
        mouseStatusLabel = new Label("Mouse event will appear here", Label.CENTER);

        mousePanel = new Panel();
        mousePanel.setBackground(Color.LIGHT_GRAY);
        mousePanel.add(new Label("Click or move mouse here"));

        textField.addKeyListener(this);
        mousePanel.addMouseListener(this);

        add(headingLabel);
        add(textField);
        add(keyStatusLabel);
        add(mousePanel);
        add(mouseStatusLabel);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        keyStatusLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public void keyReleased(KeyEvent e) {
        keyStatusLabel.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public void keyTyped(KeyEvent e) {
        keyStatusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public void mouseClicked(MouseEvent e) {
        mouseStatusLabel.setText("Mouse Clicked at X: " + e.getX() + " Y: " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        mouseStatusLabel.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        mouseStatusLabel.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        mouseStatusLabel.setText("Mouse Entered the Panel");
    }

    public void mouseExited(MouseEvent e) {
        mouseStatusLabel.setText("Mouse Exited the Panel");
    }

    public static void main(String[] args) {
        new AwtMouseKeyEventDemo();
    }
}
