class C16h39
{
   public static void main(String[] args)
   {
      f(5);
   }
   public static void f(int x)
   {
      if(x >= 0)
      {
         System.out.println(x);
         f(x-1);
      }
      else
         System.out.println("bottom");
   }
}
