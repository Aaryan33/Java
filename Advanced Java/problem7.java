// Write a program to create a Frame that display the student information.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class menu1 extends MouseAdapter {
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
        b1.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        JFrame output = new JFrame();
        Container c1 = output.getContentPane();
        c1.setLayout(new FlowLayout());
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        c1.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Hello " + s1);
        JLabel l2 = new JLabel("Your Roll No is " + s2);
        JLabel l3 = new JLabel("Your Branch is " + s3);
        c1.add(l1);
        c1.add(l2);
        c1.add(l3);
        output.setSize(300, 300);
        output.setVisible(true);
        output.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

public class problem7 {
    public static void main(String[] args) {
        menu1 a = new menu1();
        a.showMenu();
    }
}
