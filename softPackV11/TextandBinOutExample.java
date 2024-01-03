import java.io.*;
class TextandBinOutExample
{
     public static void main(String[] args) throws IOException
     {
        PrintWriter textOut = new PrintWriter("t3.txt");
        int x = 123456789;
        textOut.println(x);       // output text
        textOut.close();

        DataOutputStream binOut = new DataOutputStream(
                          new FileOutputStream("b1.bin"));
        binOut.writeInt(x);       // output binary
        binOut.close();
     }
}
