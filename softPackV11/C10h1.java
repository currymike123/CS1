class C10h1
{
   public static void main(String[] args)
   {
      B b = new B();
      b.xyDisplay();    // displays x = 1 y = 2
      b = new B(3);
      b.xyDisplay();    // displays x = 1 y = 3
      C c = new C();
      c.xyzDisplay();   // displays x = 1 y = 2 z = 4
   }
}
//================================================
class A
{
   private int x;
   //---------------------------------- 
   public A()
   {
      x = 1;
   }
   //---------------------------------- 
   public void xDisplay()
   {
      System.out.println("x = " + x);
   }
}
//================================================
class B extends A
{
   private int y;
   //---------------------------------- 
   public B()
   {
      y = 2;
   }
   //---------------------------------- 
   public B(int yy)
   {                      
      super();         // explicit call of superclass constructor
      y = yy;
   }
   //---------------------------------- 
   public void xyDisplay()
   {
      xDisplay();      // call inherited method
      System.out.println("y = " + y);
   }
}
//================================================
class C extends B
{
   private int z = 4;
   //---------------------------------- 
   public void xyzDisplay()
   {
      xyDisplay();
      System.out.println("z = " + z);
   }
}

