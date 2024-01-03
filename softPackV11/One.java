class One
{
   public static void main(String[] args)
   {
      Two.add();                           // external call
      System.out.println("x = " + Two.x);  // external access
   }

}
//===============================================
class Two
{
   public static int x = 1;     // x is a static variable
   //----------------------------------
   public static void add()
   {
      int y = 2;                // y is a local variable
      x = x + y;                // internal access of x
      display();                // internal call
   }
   //----------------------------------
   private static void display()
   {
      System.out.println("x = " + x); // internal access of x
   }
}
