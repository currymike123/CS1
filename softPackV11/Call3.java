class Call3
{
   public static void main(String[] args)
   {
      int x = 1;
      displaySum(x, x + 5, 20);
      System.out.println("All done");
   }
   //----------------------------------
   public static void displaySum(int p, int q, int x)
   {
      int sum;
      sum = p + q + x;    // x does not conflict with x in main
      System.out.println("sum = " + sum);
   }
}
