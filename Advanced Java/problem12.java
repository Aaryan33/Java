// Write a program that demonstrates the life cycle of an applet.

import java.applet.*; 
 import java.awt.Graphics; 
 import java.awt.*; 
 /*<applet code="AppletLifeCycle.class" width="350" height="150"> </applet>*/ 
 
 public class problem12 extends Applet { 
      public void init()//no main method used,execution starts from this method
      { 
        setBackground(Color.RED); 
        System.out.println("init() called"); 
      } 
      public void start(){//executed when browser is maximized
          System.out.println("Start() called"); 
          
      } 
      public void paint(Graphics g){//displays content on applet
          System.out.println("Paint() called"); 
          
      } 
      public void stop() {//executed when browser is minimized
          System.out.println("Stop() Called");
          } 
      public void destroy() {//used to completely close applet
          System.out.println("Destroy() Called");
          } 
 }
