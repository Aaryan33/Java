// Write a program to implement the GroupLayout and BoxLayout.

import java.awt.*;
import javax.swing.*;

class GroupExample {
    public GroupExample() {
        
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(groupLayout);
        JLabel clickMe = new JLabel("Click Here");
        JButton button = new JButton("This Button");
        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                .addComponent(clickMe)
                .addGap(10, 20, 100)
                .addComponent(button));
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(clickMe)
                .addComponent(button));
        frame.pack();
        frame.setVisible(true);
    }
}

class boxlayout extends Frame {
    public boxlayout() {
        Button b[] = new Button[5];
        for (int i = 0; i < 5; i++) {
            b[i] = new Button("Button " + (i + 1));
            add(b[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setSize(400, 400);
        setVisible(true);
    }
}

public class problem11 {
    public static void main(String[] args) {
        GroupExample g1 = new GroupExample();
        boxlayout b = new boxlayout();
    }
}
