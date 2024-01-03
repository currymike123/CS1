class C16h7   // copy of Generic3
{
   public static void main(String[] args)
   {
      Picasso[] z = new Picasso[3]; // create Picasso array

      z[0] = new P();               // init array with objects
      z[1] = new Q();               // of different types
      z[2] = new P();

      for (int i = 0; i < z.length; i++)
           z[i].xDisplay();
   }
}
//================================================
abstract class Picasso            // Picasso is abstract class
{                                 // because xDisplay is abstract
   abstract public void xDisplay();
}
//================================================
class P extends Picasso
{
   private int x = 1;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}
//================================================
class Q extends Picasso
{
   private int x = 2;
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}

