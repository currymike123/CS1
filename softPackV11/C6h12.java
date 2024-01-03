class C6h12
{
   public static void main(String[] args)
   {
       Variation r = new Variation();
       r.x = 1;
       r.g();

   }
}  
//================================================
class Variation
{
   private int x;
   public void g()
   {
      System.out.println(x);
   }
}
