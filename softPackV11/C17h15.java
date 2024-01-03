import javax.swing.*;
import java.awt.*;              // needed for Color class
class C17h15 extends JFrame     // copy of GUI1 in Fig. 17.1
{
   private Container contentPane;
   private JButton button1;
   private JLabel label1;
   //----------------------------------
   public C17h15()
   {
      setTitle("C17h15");              // sets title on frame
      setSize(400, 100);               // sets frame width, height
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // get content pane of frame
      contentPane = getContentPane();

      // configure content pane
      contentPane.setLayout(new FlowLayout());
      contentPane.setBackground(Color.GREEN);

      // add button and label to the content pane of the frame
      button1 = new JButton("This is a button");
      contentPane.add(button1);
      label1 = new JLabel("This is a label");
      contentPane.add(label1);

      setVisible(true);                   // make frame visible
   }
   //----------------------------------
   public static void main(String[] args)
   {
      C17h15 window = new C17h15();       // create window
   }
}
