class Recursion1
{
   public static void main(String[] args)
   {
      r1(2);
   }
  //----------------------------------
   public static void r1(int x)
   {
      if (x == 0)
         System.out.println("bottom");
      else
      {
         System.out.println("down");
         r1(x - 1);                     // recursive call
         System.out.println("up");
      }
   }
}
