class Recursion2
{
   public static void main(String[] args)
   {
      r2(5);
      System.out.println();      // go to next line
   }
   //----------------------------------
   public static void r2(int x)
   {
      if (x == 0)
         System.out.print("E");
      else
      if (x == 1)
      {
         System.out.print("A");
         r2(6);                // parameter value jumps up to 6
         System.out.print("B");
      }
      else
      {

         System.out.print("C");
         r2(x - 2);
         System.out.print("D");

      }
   }
}
