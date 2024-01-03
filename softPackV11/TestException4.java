import java.util.Scanner;
class TestException4
{
   public static void main(String[] args)
   {
      int grade = getGrade();
      System.out.println("grade = " + grade);
   }
   //----------------------------------
   public static int getGrade()
   {
      Scanner kb = new Scanner(System.in);

      System.out.println("Enter grade");
      int grade = kb.nextInt();

      // the throw statement throws the exception that the new
      // operator creates
      if (grade < 0)
         throw new RuntimeException("Invalid grade");

      return grade;
   }
}
