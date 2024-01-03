class Call1
{
   public static void main(String[] args)
   {
      System.out.println("before call");
      f();                                    // call f
      System.out.println("after call");
   }
   //----------------------------------
   public static void f()
   {
      System.out.println("in f");
   }
}
