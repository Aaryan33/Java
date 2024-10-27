// Write a program to demonstrate different mouse handling events like 
// mouseClicked(), mouseEntered(), mouseExited(), mousePressed, mouseReleased() and mouseDragged().



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent;

public class problem2 extends MouseAdapter {
    JFrame myframe;
    JLabel l1;

public problem2(){
initGUI(); }
void initGUI(){
myframe=new JFrame();
Container c=myframe.getContentPane(); 
c.setLayout(new FlowLayout());
l1=new JLabel("Moved at");
c.add(l1);
myframe.setSize(500,500 );
myframe.setVisible(true); 
myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
myframe.addMouseListener(this);
}
public void mouseDragged(MouseEvent e) {
System.out.println("You have dragged mouse"); }
public void mouseClicked(MouseEvent e) { 
    System.out.println("You have Clicked mouse");
 int i=e.getButton();
System.out.println(i);
if(i==1){
System.out.println("You have clicked lec bubon of mouse"); }
else {
System.out.println("You have clicked Right bubon of mouse");
} }
public void mouseEntered(MouseEvent e) { System.out.println("Your mouse have entered the frame mouse");
}
public void mouseExited(MouseEvent e) { System.out.println("Your mouse have exited the frame mouse");
}
public void mousePressed(MouseEvent e) { System.out.println("You have pressed mouse");
}
public void mouseReleased(MouseEvent e) { System.out.println("You have released mouse");
}
public static void main(String[] args) { 
    problem2 a=new problem2();
} }