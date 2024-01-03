import java.io.*;
import java.util.Scanner;
class C13h14   // copy of TextandBinOutExample in Fig. 13.5
{
     public static void main(String[] args) throws IOException
     {
        PrintWriter textOut = new PrintWriter("t3.txt");
        int x = 123456789;
        textOut.println(x);       // output text
        textOut.close();

        DataOutputStream binOut = new DataOutputStream( // add 2nd arg true to append
                                  new FileOutputStream("b1.bin")); 
        binOut.writeInt(x);       // output binary
        binOut.close();
     }
}
