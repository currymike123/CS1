class Counter
{
   private static int count1;
   private int count2;
   //----------------------------------
   public Counter()
   {
      count1++;   // add 1 to count1
      count2++;   // add 1 to count2
   }
   //----------------------------------
   public void display()
   {
      System.out.println("count1 = " + count1);
      System.out.println("count2 = " + count2);
   }
}
//================================================
class C7h6
{
    public static void main(String[] args)
    {
       int i = 1;
       Counter r = new Counter();
       while (i++ <= 100)
          r = new Counter();
       r.display();
   }
}
