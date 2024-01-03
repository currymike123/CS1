import java.io.*;
class BinInExample
{
     public static void main(String[] args) throws IOException
     {
        int x;

        DataInputStream binIn =
           new DataInputStream(new FileInputStream(args[0]));

        try
        {
           while (true)
           {
              x = binIn.readInt();
              System.out.println(x);
           }
        }
        catch (EOFException e)
        {
           binIn.close();
        }
     }
}
