public static void rp2(int x)
{
   if (x == -1)
   {
      System.out.println("A");
      rp2(6);
   }
   else
   if (x == 3)
      System.out.println("E");
   else
   {
      System.out.println("B");
      rp2(x - 3);
      System.out.println("C");
   }
   System.out.println("D");
}
