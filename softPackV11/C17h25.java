import javax.swing.*;
import java.awt.Graphics;
public class C17h25 extends JApplet
{
   public void paint(Graphics p)
   {
      p.drawOval(0, 0, 50, 50);
      p.fillOval(100, 0, 50, 50);
      p.drawArc(0, 200, 50, 50, 0, 90);
   }
}   
