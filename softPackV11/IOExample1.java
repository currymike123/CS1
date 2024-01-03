import java.util.Scanner;
import java.io.*;   // for IOException, File, and PrintWriter
class IOExample1
{
   public static void main(String[] args)
   {
      Scanner inFile = null;
      PrintWriter outFile = null;

      try
      {
         inFile = new Scanner(new File("t1.txt"));
         outFile = new PrintWriter("t1copy.txt");
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage()); // display error
         System.exit(1);                     // terminate program
      }

      int x;
      while (inFile.hasNextInt())
      {
         x = inFile.nextInt();     // read next number, ignore whitespace
         outFile.println(x);       // write number
      }

      inFile.close();              // close files
      outFile.close();
   }
}
