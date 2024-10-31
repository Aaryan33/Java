// Write a program to implement the GridLayout and CardLayout.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cardlayout extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    public cardlayout() {
        this.c = getContentPane();
        card = new CardLayout(30, 40);
        c.setLayout(card);
        b1 = new JButton("Apple");
        b2 = new JButton("Google");
        b3 = new JButton("Microsoft");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }

    public void acWonPerformed(ActionEvent e) {
        card.next(c);
    }
}

public class problem10 {

    public void showGrid(){

        JFrame f1=new JFrame();
        Container c=f1.getContentPane(); 
        c.setLayout(new GridLayout(2,5,10,10)); 
        JButton b[]=new JButton[10]; 
        
        for(int i=0;i<10;i++){
            String s = Integer.toString(i);
            b[i] = new JButton(s);
            b[i].setPreferredSize(new Dimension(100, 50));
            c.add(b[i]);
            f1.setVisible(true);
            f1.setSize(700, 700); 
            f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        } 
    }
}
