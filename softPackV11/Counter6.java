class Counter6
{
   public static void main(String[] args)
   {
      countup(2);
   }
   //----------------------------------
   public static void countup(int n)
   {
      int[] stack = new int[100];
      int top = -1;
      while (n > 0)
      {
         stack[++top] = n;        // save n before decrementing it
         n = n - 1;
      }
      while (top != -1)
      {
         n = stack[top--];       // restore n from stack
         System.out.println(n);  // display n
      }
   }
}
