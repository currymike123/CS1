class Inheritance7
{
   public static void main(String[] args)
   {
      A a;
      a = new A();
      System.out.println(a.toString()); // displays x = 1

      B b;
      b = new B();
      System.out.println(b.toString()); // displays x = 1 y = 2

   }
}
//================================================
class A   // inherits toString and equals from Object
{
   private int x = 1;  // x can be private
   //----------------------------------
   public String toString()
   {
      return "x = " + x;
   }
   //----------------------------------
   public int xGet()        // accessor method
   {
      return x;
   }
}
//================================================
class B extends A
{
   private int y = 2;
   //----------------------------------
   public String toString()
   {
      return  "x = " + xGet() + " y = " + y;  // use accessor
   }
}

