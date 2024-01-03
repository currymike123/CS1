class Con3
{
   private String r;
   private int x;
   //----------------------------------
   public Con3(String rr, int xx)
   {
      r = rr;
      x = xx;
   }
   //----------------------------------
   public Con3(Con3 original) // copy constructor
   {                          
      r = original.r;         // simple copy ok
      x = original.x;         // simple copy ok for primitives
   }
}
//================================================
class TestCon3
{
   public static void main(String[] args)
   {
      Con3 m1 = new Con3("hello", 7);
      Con3 m2 = new Con3(m1);
   }
}
