// Write a program to demonstrate the use of push buttons.

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class pushButton extends MouseAdapter {
    JFrame myframe;
    JButton b1;
    JLabel l1;

    public pushButton() {
        myframe = new JFrame();
        Container c = myframe.getContentPane();
        c.setLayout(new FlowLayout());
        b1 = new JButton("Hello");
        l1 = new JLabel("");
        c.add(b1);
        c.add(l1);
        myframe.setVisible(true);
        myframe.setSize(300, 300);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b1.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        int i = me.getClickCount();
        if (i >= 0) {
            l1.setText("You have clicked on Hello");
        }
    }
}

public class problem5 {
    public static void main(String[] args){ 
        pushButton a = new pushButton();
    }
}