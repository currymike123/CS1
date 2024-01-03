class TestOOP1
{
   public static void main(String[] args)
   {
      OOP1.xDisplay();                  // call before creating objects

      OOP1 n;                           // declare reference n
      n = new OOP1(10);                 // create object
      OOP1 m = new OOP1(20);            // declare m and create object

      n.yDisplay();                     // displays 10
      m.yDisplay();                     // displays 20
   }
}
//================================================
class OOP1
{
    private static int x = 3;           // static variable
    private int y;                      // instance variable
    //----------------------------------
    public OOP1(int yy)                 // constructor
    {
       y = yy;
    }
    //----------------------------------
    public static void xDisplay()       // static method
    {
       System.out.println(x);           // displays 3
    }
    //----------------------------------
    public void yDisplay()              // instance method
    {
       System.out.println(y);
    }
}

