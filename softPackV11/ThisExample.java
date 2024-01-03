class ThisExample
{
   private int x, y, z;
   //----------------------------------
   public ThisExample()
   {
      this(2, 3, 4);  // calls the second constructor
   }
   //----------------------------------
   public ThisExample(int x, int y, int z)
   {
      this.x = x;     // assign parameters to instance variables
      this.y = y;
      this.z = z;
   }
}
