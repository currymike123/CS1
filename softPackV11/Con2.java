class Con2
{
   private D r;                // r is a reference
   //----------------------------------
   public Con2()
   {
      r = new D();
   }
   //----------------------------------
   public Con2(Con2 original)  // copy constructor
   {
      r = original.r; // bad-replace with r = new D(original.r);
   }
}
