class See
{
   public static int x = 10;
   //----------------------------------
   public See()
   {
      x++;
   }
}
//================================================
class TestSee
{
   public static void main(String[] args)
   {
      See z = new See();
      for (int i = 1; i <= 100; i++)
         z = new See();
      System.out.println(z.x);
   }
}