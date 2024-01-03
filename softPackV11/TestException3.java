class TestException3
{
   public static void main (String[] args)
   {
      System.out.println("Start of main");
      try
      {
         f();
      }
      catch (ArithmeticException e)
      {
         System.out.println(e.getMessage());
      }
      System.out.println("End of main");  // Executed
   }
   //----------------------------------
   public static void f()
   {
      System.out.println("Start of f");
      g();
      System.out.println("End of f");     // Not executed
   }
   //----------------------------------
   public static void g()
   {
      System.out.println("Start of g");
      int x;
      x = 5/0;                            // Exception thrown
      System.out.println("End of g");     // Not executed
   }
}
