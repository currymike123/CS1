class C5h5
{
   public static void main(String[] args)
   {
      if (f() || g())                 // short circuited OR
         System.out.println("first if");
      if (f() | g())                  // not short circuited
         System.out.println("second if");
   }
   public static boolean f()
   {
      System.out.println("in f");
      return true;
   }
   public static boolean g()
   {
      System.out.println("in g");
      return true;
   }
}
