class Counter2
{
   public static void main(String[] args)
   {
      countDown(10);
   }
   //----------------------------------
   public static void countDown(int n)
   {
      while (n > 0)             // while in place of if
      {
         System.out.println(n);
         n = n - 1;             // decrement parameter in place of recursive call
      }
   }
}
