class Generic1
{
   public static void main(String[] args)
   {
      Object[] z = new Object[3];     // create Object array

      z[0] = new P();         // initialize array with
      z[1] = new Q();         // objects of different types
      z[2] = new P();

      for (int i = 0; i < z.length; i++)
      {
         if (z[i] instanceof P)       // P object?
            ((P)z[i]).xDisplay();     // cast to P
         else
         if (z[i] instanceof Q)       // Q object?
               ((Q)z[i]).xDisplay();  // cast to Q
      }
   }
}
//================================================
class P
{
   private int x = 1;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}
//================================================
class Q
{
   private int x = 2;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}

