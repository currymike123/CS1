class Counter5
{
   public static void main(String[] args)
   {
      countUp(10);
   }
   //----------------------------------
   public static void countUp(int n)
   {
      if (n > 0)
      {
         countUp(n - 1);        // not tail recursion
         System.out.println(n);
      }
   }
}
