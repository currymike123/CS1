class C6h14
{
   public static void main(String[] args)
   {
      WhichX r = new WhichX(1);
      r.display();
      r.set();
      r.display();
   }
}
//================================================
class WhichX
{
   private int x;
   //----------------------------------
   public WhichX(int a)
   {
      x = a;
   }
   //----------------------------------
   public void set()
   {
      int x;
      x = 5;      // assigns 5 to local x not instance variable x
   }
   //----------------------------------
   public void display()
   {
      System.out.println(x);  // displays instance variable x
   }
}

