import javax.swing.JOptionPane;
class C17h24
{
   public static void main(String[] args)
   {
      String s = JOptionPane.showInputDialog("Enter non-neg number");
      double d = Double.parseDouble(s);
      JOptionPane.showMessageDialog(null, "Root = " + Math.sqrt(d));
      System.exit(0);
   }
}
