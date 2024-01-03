class Counter3
{
   public static void main(String[] args)
   {
      countDown(2);
   }
   //----------------------------------
   public static void countDown(int n)
   {
      if (n > 0)
      {
         System.out.println(n);
         countDown(n - 1);      // tail recursion
      }
      else
         System.out.println("bottom");
   }
}
