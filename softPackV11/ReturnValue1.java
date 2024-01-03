class ReturnValue1
{
   public static void main(String[] args)
   {
      int x = 1, y;
      y = getSum(x, x + 5, 20);    // assigns returned value
      System.out.println("sum = " + y);
      System.out.println("All done");
   }
   //----------------------------------
   public static int getSum(int a, int b, int c)
   {
      int sum;
      sum = a + b + c;
      return sum;       // returns value in sum
   }
}
