import java.util.Scanner;
class KeyboardInput
{
   public static void main(String[] args)
   {
      int count = 1, sum = 0, n;

      // create scanner object that represents keyboard
      Scanner kb = new Scanner(System.in);

      // prompt user of program for an integer greater than 0
      System.out.println("Enter integer greater than 0");

      // read in an integer from the keyboard, assign to n
      n = kb.nextInt();

      //now sum the integers from 1 to n
      while (count <= n)
      {
         sum = sum + count;    // add count to sum
         count++;              // add 1 to count
      }

      // display the sum
      System.out.println("Sum of 1 to " + n + " = " + sum);
   }
}			
