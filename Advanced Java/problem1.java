// Write a program to demonstrate different Window handling events.

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent; import java.awt.event.WindowListener;

public class problem1 implements WindowListener{ 
    
    JFrame myframe;
    JLabel l1;
    
    public problem1(){
        initGUI(); 
    }
    public void initGUI(){

        myframe=new JFrame();
        Container c=myframe.getContentPane();
        c.setLayout(new FlowLayout());
        l1=new JLabel("Moved at");
        c.add(l1);
        myframe.setSize(500,500 );
        myframe.setVisible(true); 
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        myframe.addWindowListener(this);
    }
    public void windowClosed(WindowEvent we){ 
        System.out.println("Good Bye");
    }
    
    public void windowDeacWvated(WindowEvent we){ }

    public void windowIconified(WindowEvent we){ 
        System.out.println("The window is minimized");
    }

    public void windowDeiconified(WindowEvent we){ 
        System.out.println("The window is maximized");
    }

    public void windowAcWvated(WindowEvent e) { }

    public void windowOpened(WindowEvent we){ 
        System.out.println("Welcome");
    }

    public void windowClosing(WindowEvent e) { 
        System.out.println("Good Bye");
    }
    
    public static void main(String[] args) { 
        problem1 a = new problem1();
    } 
}
