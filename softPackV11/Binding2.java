class Binding2
{
   public static void main(String[] args)
   {
      A a;
      a = new A();
      a.f();          // displays f in A

      B b;
      b  = new B();
      a = b;         // a points "down" to B object
      a.f();          // displays f in B
   }
}
//================================================
class A
{
   public void f()
   {
      System.out.println("f in A");
   }
}
//================================================
class B extends A
{
   public void f()
   {
      System.out.println("f in B");
   }
}

