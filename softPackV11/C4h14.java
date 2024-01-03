class C4h14
{
   public static void main(String[] args)
   {
      float sum1 = 0.0f, sum2 = 0.0f;
      int i;

      i = 1;
      while (i <= 100)   // sum from large to small
      {
          sum1 = sum1 + 1.0f/i;
          i++;
      }
      System.out.println("sum1 = " + sum1);	
      i = 100;
      while (i >= 1)    // sum from small to large
      {
          sum2 = sum2 + 1.0f/i;
          i--;              
      }
      System.out.println("sum2 = " + sum2);
   }
}
