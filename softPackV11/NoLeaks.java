class NoLeaks
{
   private D r;
   //----------------------------------
   public NoLeaks(D rr)
   {
      r = new D();
   }
   //----------------------------------
   public NoLeaks(NoLeaks original)  // copy constructor
   {
      r = new D(original.r);         // now ok
   }
   //----------------------------------
   public D rGet()
   {
      return new D(r);               // now ok
   }
   //----------------------------------
   public void rSet(D rr)
   {
      r = new D(rr);                 // now ok
   }
}
