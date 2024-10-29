// Write a program to create a Menu using the frame.

import javax.swing.*;
import java.awt.*;

class menu {
    JFrame myframe;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    public void showMenu() {
        myframe = new JFrame();
        Container c = myframe.getContentPane();
        c.setLayout(new FlowLayout());
        l1 = new JLabel("Name");
        l2 = new JLabel("Roll No");
        l3 = new JLabel("Branch");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b1 = new JButton("SUBMIT");
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(l3);
        c.add(t3);
        c.add(b1);
        myframe.setSize(500, 500);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

public class problem6 {
    public static void main(String[] args) {
    menu m1=new menu();
    m1.showMenu(); }
}
