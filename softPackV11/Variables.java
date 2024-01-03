class Variables
{
   public static void main(String[] args)
   {
      int x;                           // declare x
      x = 7;                           // x is now 7
      System.out.println(x);           // displays 7
      System.out.println(x + 4);       // displays 11
      System.out.println(x);           // x is still 7
      System.out.println("x");         // displays x    	
      x = 20;                          // x now 20
      System.out.println(x);           // displays 20
      x = x + 1;                       // adds 1 to x
      System.out.println(x);           // displays 21
      x++;                             // adds 1 to x
      System.out.println("x = " + x);  // displays x = 22
      x--;                             // subtracts 1 from x
      System.out.println("x = " + x);  // displays x = 21

      double y, z;                     // declare y and z
      y = 5.0;                         // y is now 5.0
      y = y/2.0;                       // divides y by 2.0
      System.out.println(y);           // displays 2.5
      z = y/2.0;                       // y still 2.5, z is 1.25
      System.out.println(z);           // displays 1.25
   }
}
