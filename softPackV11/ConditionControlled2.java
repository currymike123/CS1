class ConditionControlled2
{
   public static void main(String[] args)
   {
      int x = 1, square;

      while (true)
      {
         square = x*x;               // compute and save x squared
         if (square >= 5000) break;  //  exit test
         System.out.println(x + " squared = " + square);
         x++;
      }
   }
}
