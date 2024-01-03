class TestOneInteger
{
   public static void main(String[] args)
   {
      OneInteger p = new OneInteger(7);
      System.out.println(p.get());
   }
}
//================================================
class OneInteger
{
   private Integer x;       // type of x is always Integer
   //----------------------------------
   public OneInteger(Integer xx)
   {
      x = xx;
   }
   //----------------------------------
   public Integer get()
   {
      return x;
   }
}

