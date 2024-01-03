class EqualsExample
{
   private int x;
   //----------------------------------
   public EqualsExample(int xx)
   {
      x = xx;
   }
   //----------------------------------
   public String toString()
   {
      return "x = " + x;
   }
   //----------------------------------
   public boolean equals(EqualsExample r)
   {
      return x == r.x;
   }
}