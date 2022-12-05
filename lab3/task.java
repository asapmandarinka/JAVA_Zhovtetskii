package lab3;

import javax.swing.*;
import java.awt.*;

public class task extends JFrame {

    public static void main(String[] args) {
        new task("lab3", 1200, 600);
    }

    task(String s, int w, int h) {
        super(s);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        JPanel jpanel = new JPanel();
        jpanel.setLayout(null);
        Font textFont = new Font("Serif", Font.ITALIC, 18);
        Color textColor = new Color(150, 75, 0);

        JLabel polygonLabel = new JLabel("Червоний багатокутник");
        polygonLabel.setFont(textFont);
        polygonLabel.setForeground(textColor);
        polygonLabel.setBounds(150, 300, 250 ,100);

        JLabel famLabel = new JLabel("Жовтецький Роман");
        famLabel.setFont(textFont);
        famLabel.setForeground(textColor);
        famLabel.setBounds(1, 1, 250 ,100);

        int xOffset = 0;
        JFrame f = new JFrame("");

        g.setColor(Color.RED);
        g.fillPolygon(
                new int[] {
                        300 + xOffset,
                        400 + xOffset,
                        350 + xOffset,
                        250 + xOffset,
                        200 + xOffset,
                },
                new int[] {100, 200, 300, 300, 200},
                5
        );
        xOffset += 300;

        JLabel triangleLabel = new JLabel("Синій трикутник");
        triangleLabel.setFont(textFont);
        triangleLabel.setForeground(textColor);
        triangleLabel.setBounds(100 + xOffset, 10, 250 ,100);




        g.setColor(Color.BLUE);
        g.fillPolygon(
            new int[] {
                300 + xOffset,
                200 + xOffset,
                400 + xOffset
            },
            new int[] {50, 200, 200},
            3
        );
        xOffset += 300;

        JLabel ovalLabel = new JLabel("Зелений круг");
        ovalLabel.setFont(textFont);
        ovalLabel.setForeground(textColor);
        ovalLabel.setBounds(250 + xOffset, 300, 250 ,100);

        g.setColor(Color.GREEN);
        g.fillOval(250 + xOffset, 100, 200, 200);

        jpanel.add(polygonLabel);
        jpanel.add(triangleLabel);
        jpanel.add(ovalLabel);
        jpanel.add(famLabel);

        add(jpanel);
    }
}