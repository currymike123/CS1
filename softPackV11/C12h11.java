class C12h11    // copy of TestException2 in Fig. 12.2
{
   public static void main (String[] args)
   {
      System.out.println("Start of main");
      f();
      System.out.println("End of main");  // Executed
   }
   //----------------------------------
   public static void f()
   {
      System.out.println("Start of f");
      g();
      System.out.println("End of f");     // Executed
   }
   //----------------------------------
   public static void g()
   {
      System.out.println("Start of g");
      int x;
      try
      {
         x = 5/0;                         // Exception thrown
      }
      catch (ArithmeticException e)
      {
         System.out.println("In catch block");
         System.out.println(e.getMessage());
      }
      System.out.println("End of g");     // Executed
   }
}
