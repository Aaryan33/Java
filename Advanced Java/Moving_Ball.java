
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Moving_Ball {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JFrame app = new JFrame();
        MyPanel mp = new MyPanel();
        app.add(mp);
        app.setSize(300, 300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        Thread t = new Thread(mp);
        t.start();
    }
}
class MyPanel extends JPanel implements Runnable{
    int x = 0;
    int y = 0;
    boolean flagx = true;
    boolean flagy = true;
 public void paintComponent(Graphics g) {
      super.paintComponent(g);
      if(flagx==true && flagy==true)
        g.setColor(Color.YELLOW);
      else if(flagx==true && flagy==false)
        g.setColor(Color.GREEN);
      else if(flagx==false && flagy==true)
        g.setColor(Color.RED);
      else
        g.setColor(Color.black);
      g.fillOval(x, y, 100, 100);
      
   }

   @Override
   public void run() {
       while(true)
       {   if(flagx == true)
                 { 
                     x = x+20;
                     if(x>=(this.getWidth()-100))flagx =false;
                 }
           else
                 { 
                     x = x-20;
                     if(x<=0)flagx =true;
                 }
       if(flagy == true)
                 { 
                     y = y+20;
                     if(y>=(this.getHeight()-100))flagy =false;
                 }
           else
                 { 
                     y = y-20;
                     if(y<=20)flagy =true;
                 }
           try { Thread.sleep(50);}
           catch (InterruptedException ex) {}
           
           this.repaint();
       }
   }
}