class Counter4
{
   public static void main(String[] args)
   {
      countDown(2);
   }
   //----------------------------------
   public static void countDown(int n)
   {
      while (n > 0)
      {
         System.out.println(n);
         n = n - 1;
      }
      System.out.println("bottom");
   }
}