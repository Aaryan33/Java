// Write a Program to demonstrate Painting in applet.

import java.awt.*;
import java.awt.Component;
import java.awt.event.*;
import java.applet.Applet;

public class Paint extends Applet implements ActionListener,ItemListener,MouseMotionListener,MouseListener {

    Point startPoint, endPoint;
    String s,command;
    Choice color, shapes; //Generates a combobox
    int shapeChoice,currshapes; 
    Point[] starts;
    Point[] ends;
    Color[] C = {Color.black,Color.blue,Color.red}; //Array for colors

    public void init(){

      addMouseListener(this);
      this.addMouseMotionListener(this);
      
      starts = new Point[100];
      ends = new Point[100];
      
      Panel bottom = new Panel(); //Container class used for grouping a set of components
      Button b1 = new Button("Clear");
      bottom.add(b1);
      b1.addActionListener(this);
      Button b2 = new Button("Undo");
      bottom.add(b2);
      b2.addActionListener(this);
      Button b3 = new Button("Redo");
      bottom.add(b3);
      b3.addActionListener(this);

      color = new Choice(); //adding color choices
      color.add("Black");
      color.add("Blue");
      color.add("Red");
      color.addItemListener(this);  //notified against ItemEvent
      bottom.add(color);

      shapes = new Choice(); //adding shape choices
      shapes.add("Line");
      shapes.add("Rectangle");
      shapes.add("Oval");
      shapes.addItemListener(this);
      bottom.add(shapes);

      setBackground(Color.white); 

      setLayout(new BorderLayout());
      add(bottom,BorderLayout.SOUTH);
    }
    
    @Override
    public void paint(Graphics g) { //Overriden from  java.awt.Component;
      
      g.setColor(C[color.getSelectedIndex()]); //setting new color for drawing

      if (startPoint != null && endPoint != null) {
         
         if(shapeChoice == 0){
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
         }
         else if(shapeChoice == 1){
            g.drawRect(startPoint.x, startPoint.y, endPoint.x-startPoint.x, endPoint.y-startPoint.y);
         }
         else if(shapeChoice == 2){
            g.drawOval(startPoint.x, startPoint.y, endPoint.x-startPoint.x, endPoint.y-startPoint.y);
         }
      }
    }
    public void actionPerformed(ActionEvent evt) {
      
      command = evt.getActionCommand();
      if (command.equals("Clear")){
         
        Graphics g = getGraphics();  //defined in the Component class
        g.clearRect(0,0,600,500);        
      }
      else if (command.equals("Undo"))
         Undo();
      else if (command.equals("Redo"))
         Redo();
    }    

    public void update(Graphics g){ //Overriding update method for component class

      paint(g);
    }

   public void itemStateChanged(ItemEvent evt) {
      
      shapeChoice = shapes.getSelectedIndex(); //Returns the inded of the currently selected item
      Graphics g = getGraphics();
      startPoint = null; endPoint = null;
      paint(g);
   }    
public void Undo(){

      if(currshapes > 0){
        
        Graphics g = getGraphics();  //getGraphics returns a graphics context that can be used for drawing to a particular component. 
        g.setXORMode(getBackground()); //logical pixel operations are performed in the XOR mode. If the same figure is drawn twice, then all pixels are restored to their original values.
        startPoint = starts[currshapes-1];
        endPoint = ends[currshapes-1];
        currshapes--;
        paint(g);      
      }
    } 
    
    public void Redo(){      
        
        Graphics g = getGraphics();      
        currshapes++;
        startPoint = starts[currshapes-1];
        endPoint = ends[currshapes-1];        
        paint(g);      
      
    } 

    @Override //MouseListener
    public void mousePressed(MouseEvent e) { //Invoked when a mouse button has been pressed on a component.
        startPoint = e.getPoint(); //Returns the x,y position of the event relative to the source component.
        starts[currshapes] = e.getPoint();
    }
   @Override //MouseMotionListener
    public void mouseDragged(MouseEvent e){ //Invoked when a mouse button is pressed on a component and then        dragged until it is released.
        endPoint = e.getPoint(); //provides the coordinates where the cursor is located currently
        Graphics g = getGraphics();
        paint(g);
        g.setXORMode(getBackground());

        try{Thread.sleep(50);}
        catch(InterruptedException E){}
        paint(g);        
    }

    @Override //MouseListener
    public void mouseReleased(MouseEvent e) {
      Graphics g = getGraphics();
      endPoint = e.getPoint();
      ends[currshapes] = e.getPoint();
      currshapes++;
      repaint();
    }

    @Override //MouseListener
    public void mouseEntered(MouseEvent e) {}
    @Override //MouseListener
    public void mouseExited(MouseEvent e) {} 
    @Override //MouseMotionListener
    public void mouseMoved(MouseEvent arg0) {} 
    @Override //MouseListener
    public void mouseClicked(MouseEvent e) {}
}

/*<applet code="Paint" width=600 height=500></applet> */
