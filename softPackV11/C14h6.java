class C14h6   // same as Recursion3 in Fig. 14.5
{
   public static void main(String[] args)
   {
      countDown(10);
   }
   //----------------------------------
   public static void countDown(int n)
   {
      if (n > 0)
      {
         System.out.println(n);
         countDown(n - 1);
      }
   }
}
