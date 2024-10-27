// Write a program to demonstrate different keyboard handling events.

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class keyDetecWon extends KeyAdapter {
    JFrame myframe;
    JTextArea ta;
    JLabel l1;
    String s1 = "";

    public keyDetecWon() {
        initGUI();
    }

    public void initGUI() {
        myframe = new JFrame();
        Container c = myframe.getContentPane();
        c.setLayout(new FlowLayout());
        ta = new JTextArea("Your Current key status");
        l1 = new JLabel("");
        c.add(ta);
        c.add(l1);
        myframe.setSize(500, 500);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ta.addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        String s = String.valueOf(ke.getKeyChar());
        s1 = s1 + s;
        ta.setText("You entered '" + s + "' key ");
        l1.setText("You have entered this characters: " + s1);
    }
}

public class problem3 {
    public static void main(String[] args) {
        keyDetecWon k = new keyDetecWon(); 
    }
}