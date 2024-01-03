class Leaks
{
   private D r;
   //----------------------------------
   public Leaks(D rr)
   {
      r = new D();
   }
   //----------------------------------
   public Leaks(Leaks original) // copy constructor
   {
      r = original.r; // bad: creates shallow copy
   }
   //----------------------------------
   public D rGet()
   {
      return r;      // bad: gives direct access to r object
   }
   //----------------------------------
   public void rSet(D rr)
   {
      r = rr;        // bad: gives direct access to r object
   }
}
