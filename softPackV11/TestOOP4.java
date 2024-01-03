class TestOOP4
{
   public static void main(String[] args)
   {
      OOP4.addOne();
      OOP4 p = new OOP4();
      p.display();              // legal
      System.out.println(p.y);  // legal
   }
}
//================================================
class OOP4
{
   private static int x = 1;    // static variable
   public int y = 2;            // instance variable
   //----------------------------------
   public static void addOne()  // static method
   {
      x++;                      // legal
      y++;                      // illegal
      display();                // illegal
   }
   //----------------------------------
   public void display()        // instance method
   {
      System.out.println(x);
      System.out.println(y);
   }
}

