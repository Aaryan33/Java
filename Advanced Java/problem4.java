// Write a program to generate a window without an applet window using main() function.

import javax.swing.*;
import java.awt.*;

class withoutusingApplet extends Thread {
    JFrame myframe;

    withoutusingApplet() throws InterruptedException {
        initGUI();
    }

    void initGUI() throws InterruptedException {
        myframe = new JFrame();
        Container c = myframe.getContentPane();
        c.setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            myframe.setSize(i * 30, i * 30);
            Thread.sleep(200);
            myframe.setVisible(true);
        }
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

public class problem4 {
    public static void main(String[] args) throws InterruptedException {
        withoutusingApplet a = new withoutusingApplet(); 
    }
}