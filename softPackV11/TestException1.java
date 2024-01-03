class TestException1
{
   public static void main (String[] args)
   {
      System.out.println("Start of main");
      f();
      System.out.println("End of main");  // not executed
   }
   //----------------------------------
   public static void f()
   {
      System.out.println("Start of f");
      g();
      System.out.println("End of f");     // not executed
   }
   //----------------------------------
   public static void g()
   {
      System.out.println("Start of g");
      int x;
      x = 5/0;                            // Exception thrown
      System.out.println("End of g");     // not executed
   }
}
