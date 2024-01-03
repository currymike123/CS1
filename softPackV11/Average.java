import java.util.Scanner;
class Average
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int sum = 0.0;
      int numberOfGrades, i = 1;

      System.out.println("Enter number of grades");
      numberOfGrades = kb.nextInt();
      System.out.println("Enter grades");

      while (i <= numberOfGrades)
      {
         sum = sum + kb.nextInt();
         i++;
      }

      System.out.println("Average = " + (double)sum/numberOfGrades);
   }
}
