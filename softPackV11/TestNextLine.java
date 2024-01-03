import java.util.Scanner;
class TestNextLine
{
   public static void main(String[] args)
   {
      int x;
      String s;
      Scanner kb = new Scanner(System.in);

      System.out.println("Enter int");
      x = kb.nextInt();			// pause until user enters int
      System.out.println("x = " + x);	// displays int just entered
      System.out.println("Enter line");	// displays prompt message
      s = kb.nextLine();		// no pause because satisfied by leftover \n
      System.out.println("s = " + s);	// displays s =
      System.out.println(s.length());	// s contains 0 characters 
   }
}       
