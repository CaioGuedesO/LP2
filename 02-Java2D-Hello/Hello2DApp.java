import java.awt.*;
import javax.swing.*;

public class Hello2DApp extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        this.setBackground(Color.DARK_GRAY);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.CYAN);
        g2d.fillRect(50, 50, 150, 100);

        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawOval(220, 50, 100, 100);

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Serif", Font.BOLD, 20));
        g2d.drawString(":) :) :) :) :) :)", 60, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Java2D");
        frame.add(new Hello2DApp());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
