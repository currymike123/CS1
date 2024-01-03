class C16h40
{
   public static void main(String[] args)
   {
      f(5);
   }
   public static void f(int x)
   {
      if(x >= 0)
      {
         f(x-1); // save current x on a stack (see homework problem 34)
         System.out.println(x);
      }
      else
         System.out.println("bottom");
   }
}
