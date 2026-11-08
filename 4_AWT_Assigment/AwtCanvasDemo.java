import java.awt.*;
import java.awt.event.*;

public class AwtCanvasDemo extends Frame implements ActionListener {
    DrawingCanvas canvas;
    Label statusLabel;
    Button drawButton;
    Button clearButton;

    public AwtCanvasDemo() {
        setTitle("AWT Canvas Drawing Demo");
        setSize(500, 400);
        setLayout(new BorderLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        canvas = new DrawingCanvas();
        statusLabel = new Label("Click Draw to show shapes", Label.CENTER);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        drawButton = new Button("Draw");
        clearButton = new Button("Clear");

        drawButton.addActionListener(this);
        clearButton.addActionListener(this);

        buttonPanel.add(drawButton);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            canvas.setDrawShapes(true);
            statusLabel.setText("Shapes are drawn on canvas");
        } else if (e.getSource() == clearButton) {
            canvas.setDrawShapes(false);
            statusLabel.setText("Canvas cleared");
        }
    }

    class DrawingCanvas extends Canvas {
        boolean drawShapes = false;

        public DrawingCanvas() {
            setBackground(Color.WHITE);
        }

        public void setDrawShapes(boolean value) {
            drawShapes = value;
            repaint();
        }

        public void paint(Graphics g) {
            if (drawShapes) {
                g.drawLine(50, 50, 200, 50);
                g.drawRect(50, 80, 120, 70);
                g.drawOval(220, 80, 120, 70);
                g.drawOval(80, 180, 80, 80);
                g.drawString("Java AWT Canvas Drawing", 150, 290);
            }
        }
    }

    public static void main(String[] args) {
        new AwtCanvasDemo();
    }
}