class Call2
{
   public static void main(String[] args)
   {
      int x = 1;
      displaySum(x, x + 5, 20);     // 3 arguments
      System.out.println("All done");
   }
   //----------------------------------
   public static void displaySum(int a, int b, int c) // 3 parameters
   {
      int sum;
      sum = a + b + c;
      System.out.println("sum = " + sum);
   }
}
