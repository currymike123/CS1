class ConditionControlled1
{
   public static void main(String[] args)
   {
      int x = 1;

      while (x*x < 5000)
      {
         System.out.println(x + " squared = " + x*x);
         x++;
      }
   }
}
