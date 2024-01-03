import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Applet1 extends JApplet // public, extend JApplet
{
   private Container contentPane;
   private JPanel panel1, panel2;
   private JButton button1;
   private JLabel label1;
   private int count;
   //----------------------------------
   public void init() // use init method in place of constructor
   {
      panel1 = new JPanel();              // create panel
      panel1.setLayout(new FlowLayout());
      panel1.setBackground(Color.GREEN);
      panel1.setPreferredSize(new Dimension(300, 50));
      button1 = new JButton("Click to count");
      button1.addActionListener(new Listener());
      panel1.add(button1);

      panel2 = new JPanel();              // create panel
      panel2.setLayout(new FlowLayout());
      panel2.setBackground(Color.YELLOW);
      panel2.setPreferredSize(new Dimension(300, 50));
      count = 0;
      label1 = new JLabel("Count = " + count);
      panel2.add(label1);

      // get content pane of frame
      contentPane = getContentPane();

      contentPane.setLayout(new FlowLayout());
      contentPane.add(panel1);      // add panels to content pane
      contentPane.add(panel2);
   }
   //----------------------------------
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label1.setText("Count = " +  ++count);
         System.out.println("Orange = " + Color.ORANGE);
      }
   }
}
