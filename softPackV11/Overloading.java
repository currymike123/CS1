class Overloading
{
   public static void main(String[] args)
   {
      byte b = 5;
      o();        // calls o on line 12
      o(2);       // calls o on line 17
      o(2.0);     // calls o on line 22
      o(2, 2.0);  // calls o on line 27
      o(2.0, 2);  // calls o on line 32
      o(b);       // calls o on line 17 (most compatible)
      // o("hello"); // no compatible o so illegal
   }
   //----------------------------------
   public static void o()
   {
      System.out.println("No args");
   }
   //----------------------------------
   public static void o(int i)
   {
      System.out.println("i = " + i);
   }
   //----------------------------------
   public static void o(double d)
   {
     System.out.println("d = " + d);;
   }
   //----------------------------------
   public static void o(int i, double d)
   {
      System.out.println("i = " + i + "     d = " + d);
   }
   //----------------------------------
   public static void o(double d, int i)
   {
      System.out.println("d = " + d + "   i = " + i);
   }
}
