// Write a program to implement the FlowLayout and BorderLayout.

import javax.swing.*;
import java.awt.*;

public class problem9 {
    public void showFlow() {
        JFrame f1 = new JFrame();
        Container c = f1.getContentPane();
        c.setLayout(new FlowLayout());
        JButton b[] = new JButton[10];
        for (int i = 0; i < 10; i++) {
            String s = Integer.toString(i);
            b[i] = new JButton(s);
            b[i].setPreferredSize(new Dimension(100, 30));
            c.add(b[i]);
            f1.setVisible(true);
            f1.setSize(700, 700);
            f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

    public void showBoarder() {
        JFrame f1 = new JFrame();
        Container c = f1.getContentPane();
        c.setLayout(new BorderLayout());
        JButton b[] = new JButton[10];
        JButton b1 = new JButton("Hello");
        JButton b2 = new JButton("Hello");
        JButton b3 = new JButton("Hello");
        JButton b4 = new JButton("Hello");
        JButton b5 = new JButton("Hello");
        c.add(b1, BorderLayout.CENTER);
        c.add(b2, BorderLayout.WEST);
        c.add(b3, BorderLayout.NORTH);
        c.add(b4, BorderLayout.SOUTH);
        c.add(b5, BorderLayout.EAST);
        f1.setVisible(true);
        f1.setSize(700, 700);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        problem9 a = new problem9();
        a.showFlow();
        a.showBoarder();
    }
}
