class CountControlled2
{
   public static void main(String[] args)
   {
      int count = 1, sum = 0;

      while  (count <= 10)
      {
         sum = sum + count;      // add count to sum
         count++;                // add 1 to count
      }
      System.out.println("sum = " + sum);
   }
}
