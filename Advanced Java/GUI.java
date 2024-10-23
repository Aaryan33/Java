import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import java.io.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListner;


public class GUI{

    public static void main(String []args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        //frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null); 

        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

        JTextField Textfield = new JTextField(20);
        Textfield.setBounds(100,20,170,25);
        panel.add(Textfield);

        JLabel Passwordlabel = new JLabel("Password");
        Passwordlabel.setBounds(10,50,90,25);
        panel.add(Passwordlabel);

        JPasswordField pass = new JPasswordField(20);
        pass.setBounds(100,50,170,25);
        panel.add(pass);

        JButton button = new JButton("Login");
        button.setBounds(5,80,70,30);
        //button.addActionListener(new GUI());
        panel.add(button);

        JLabel success = new JLabel("");
        success.setBounds(10,40,50,20);
        panel.add(success);


        frame.setVisible(true);


    }

}