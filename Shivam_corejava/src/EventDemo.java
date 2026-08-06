import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame implements KeyListener, MouseListener, MouseMotionListener 
{
    private JLabel label;

    public EventDemo() {
        label = new JLabel("Move mouse or press keys to see events");
        add(label, BorderLayout.CENTER);

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        label.setText("Key pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key released: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key typed: " + e.getKeyChar());
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}

