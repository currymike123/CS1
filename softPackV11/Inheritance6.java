class Inheritance6
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
class A        // inherits toString and equals from Object
{
   private int x = 1;
   //----------------------------------
   public String toString()
   {
      return "x = " + x;
   }
}
//================================================
class B extends A
{
   private int y = 2;
   //----------------------------------
   public String toString()
   {
      return super.toString() + " y = " + y; // call A toString
   }
}

