class Inheritance5
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
class A            // inherits toString and equals from Object
{
   protected int x = 1; // protected access allows B to access x
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
      return "x = " + x + " y = " + y;
   }
}

