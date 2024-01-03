class C14h36
{
   public static void main(String[] args)
   {
      p(3);
   }
   public static void p(int x)
   {
      if (x == 0)
         System.out.println("hello");
      else 
      {
         p(x-1);
         System.out.println("bert");
         p(x-1);
         System.out.println("ernie");
         p(x-1);
         System.out.println("grover");
         p(x-1);
      }
   }
}