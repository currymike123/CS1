class C11h19
{
   public static void main(String[] args)
   {
      Dude d1 = new Dude();
      Dude d2 = new Dude();
      System.out.println(d1.equals(d2)); // should display true
      d1.set(9, 100);
      System.out.println(d1.equals(d2)); // should display false
   }
}
//================================================
class Dude        
{
   private int[] ia;
   //----------------------------------
   public Dude()
   {
      ia = new int[10];
   }
   //----------------------------------
   public void set(int index, int value)
   {
      ia[index] = value;
   }
}
