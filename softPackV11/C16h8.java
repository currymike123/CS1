class C16h8   // copy of Generic4
{
   public static void main(String[] args)
   {
      I[] z = new I[3];             // create I array

      z[0] = new P();               // init array with objects
      z[1] = new Q();               // of different types
      z[2] = new P();

      for (int i = 0; i < z.length; i++)
           z[i].xDisplay();
   }
}
//================================================
interface I
{
   public void xDisplay();
}
//================================================
class P implements I       // include the phrase "implements I"
{
   private int x = 1;
   public void xDisplay()  // overrides abstract method
   {
      System.out.println("x = " + x);
   }
}
//================================================
class Q implements I
{
   private int x = 2;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}

