class C16h6  // copy of Generic2
{
   public static void main(String[] args)
   {
      R[] z = new R[3];             // create R array

      z[0] = new P();               // init array with objects
      z[1] = new Q();               // of different types
      z[2] = new P();

      for (int i = 0; i < z.length; i++)
           z[i].xDisplay();
   }
}
//================================================
class R
{
   public void xDisplay()
   {
      // dummy method
   }
}
//================================================
class P extends R            // P subclass of R
{
   private int x = 1;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}
//================================================
class Q extends R           // Q subclass of R
{
   private int x = 2;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}

