/*
Write a program that displays the color of a circle as red when the 
mouse button is pressed and as blue when the mouse button is 
released.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CircleColorChanger extends JPanel {

    private static final long serialVersionUID = 1L;
    private boolean mousePressed = false;
    private Color circleColor = Color.BLUE;

    public CircleColorChanger() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mousePressed = true;
                circleColor = Color.RED;
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
                circleColor = Color.BLUE;
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int circleSize = Math.min(getWidth(), getHeight()) - 20;
        int circleX = (getWidth() - circleSize) / 2;
        int circleY = (getHeight() - circleSize) / 2;
        g.setColor(circleColor);
        g.fillOval(circleX, circleY, circleSize, circleSize);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        CircleColorChanger circle = new CircleColorChanger();
        frame.add(circle);
        frame.setVisible(true);
    }
}
