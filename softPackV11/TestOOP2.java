class TestOOP2
{
   public static void main(String[] args)
   {
      OOP2 r = new OOP2();
      r.set(10);                     // sets q to 10
      System.out.println(r.get());   // displays 10
   }
}
//================================================
class OOP2
{
   private int q;
   //----------------------------------
   public void set(int qq)
   {
      q = qq;
   }
   //----------------------------------
   public int get()
   {
      return q;
   }
}

