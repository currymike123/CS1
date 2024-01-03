import java.util.Scanner;
import java.io.*;                  // java.io has IOException
class IOExample2
{
   public static void main(String[] args) throws IOException
   {
      Scanner inFile = new Scanner(new File("t1.txt"));
      PrintWriter outFile = new PrintWriter("t1copy.txt");

      int x;
      while (inFile.hasNextInt())
      {
         x = inFile.nextInt ();    // read next number, ignore whitespace
         outFile.println(x);       // write this line
      }

      inFile.close();              // close files
      outFile.close();
   }
}
