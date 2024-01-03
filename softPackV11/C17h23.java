import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class C17h23 extends JFrame   // copy of GUI5 in Fig. 17.7     
{
   private Container contentPane;
   private JPanel panel1, panel2;
   private JButton button1;
   private JTextField text1;
   private JRadioButton radio1;
   private JRadioButton radio2;
   private ButtonGroup group;
   private ActionListener listener;
   private int count;
   //----------------------------------
   public C17h23()
   {
      setTitle("C17h23");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      panel1 = new JPanel();           // create panel
      panel1.setBackground(Color.GREEN);
      panel1.setPreferredSize(new Dimension(300, 100));
      listener = new Listener();
      button1 = new JButton("Click to count");
      button1.addActionListener(listener);
      panel1.add(button1);

      radio1 = new JRadioButton("Up", true);  // create button
      radio2 = new JRadioButton("Down");      // create button
      group = new ButtonGroup(); // create button group
      group.add(radio1);         // add radio buttons to group
      group.add(radio2);
      panel1.add(radio1);        // add radio button to panel
      panel1.add(radio2);        // add radio button to panel

      panel2 = new JPanel();          // create panel
      panel2.setBackground(Color.YELLOW);
      panel2.setPreferredSize(new Dimension(200, 100));
      text1 = new JTextField(10);
      count = 0;
      text1.setText("" + count);
      text1.addActionListener(listener);
      panel2.add(text1);

      // get content pane of frame
      contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());
      contentPane.add(panel1);    // add panels to content pane
      contentPane.add(panel2);

      pack();
      setVisible(true);
   }
   //----------------------------------
   public static void main(String[] args)
   {
      C17h23 window = new C17h23();
   }
   //----------------------------------
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == text1)
            count = Integer.parseInt(text1.getText());
         else
         if (e.getSource() == button1)
            if (radio1.isSelected())  // radio button 1 selected?
               text1.setText("" + ++count);  // increment count
            else
            if (radio2.isSelected())  // radio button 2 selected?
               text1.setText("" + --count);  // decrement count
      }
   }
}
