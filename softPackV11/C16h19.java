class TwoParms<T, U>
{
   T x;
   U y;
   //----------------------------------
   public TwoParms(T xx, U yy)
   {
      x = xx;
      y = yy;
   }
   //----------------------------------
   public T xGet()
   {
      return x;
   }
   //----------------------------------
   public U yGet()
   {
      return y;
   }
}