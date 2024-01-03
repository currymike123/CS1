class C9h14
{
   public static void main(String[] args)
   {
      System.out.println("Start of main");
      Initializer r = new Initializer();
      System.out.println("End of main");
   }
}
//================================================
class Initializer
{
   private int[] nsia = new int[100];
   private static int[] sia = new int[100];
   //----------------------------------
   static               // static initializer
   {
      System.out.println("In static initializer");
      for (int i = 0; i < sia.length; i++)
         sia[i] = i;
   }
   //----------------------------------
   public Initializer() // constructor
   {
      System.out.println("In constructor");
      for (int i = 0; i < nsia.length; i++)
         nsia[i] = i;
   }
}
