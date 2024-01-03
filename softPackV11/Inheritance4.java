class Inheritance4
{
   public static void main(String[] args)
   {
      A a1, a2;
      a1 = new A();
      a2 = new A();
      System.out.println(a1.toString());  // displays A@3e25a5
      System.out.println(a1.equals(a2));  // displays false

      B b1, b2;
      b1 = new B();
      b2 = new B();
      System.out.println(b1.toString());  // displays B@19821f
      System.out.println(b1.equals(b2));  // displays false
   }
}
//================================================
class A         // inherits toString and equals from Object
{
   private int x = 1;
}
//================================================
class B extends A // inherits toString and equals from A
{
   private int y = 2;
}

