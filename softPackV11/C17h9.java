import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class C17h9 extends JFrame   // copy GUI3 in Fig. 17.5
{
   private Container contentPane;
   private JPanel panel1, panel2;
   private JButton button1;
   private JLabel label1;
   private int count;
   //----------------------------------
   public C17h9()
   {
      setTitle("C18h9");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      panel1 = new JPanel();     // create panel
      panel1.setLayout(new FlowLayout());
      panel1.setBackground(Color.GREEN);
      panel1.setPreferredSize(new Dimension(200, 100));
      button1 = new JButton("Click to count");
      button1.addActionListener(new Listener());  // add listener
      panel1.add(button1);

      panel2 = new JPanel();     // create panel
      panel2.setLayout(new FlowLayout());
      panel2.setBackground(Color.YELLOW);
      panel2.setPreferredSize(new Dimension(200, 100));
      count = 0;
      label1 = new JLabel("Count = " + count);
      panel2.add(label1);

      // get content pane of frame
      contentPane = getContentPane();

      contentPane.setLayout(new FlowLayout());
      contentPane.add(panel1);    // add panels to content pane
      contentPane.add(panel2);

      pack();
      setVisible(true);                    // make window visible
   }
   //----------------------------------
   public static void main(String[] args)
   {
      C17h9 window = new C17h9();          // create window

   }
   //----------------------------------
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label1.setText("Count = " +  ++count);  // set label
      }
   }
}
