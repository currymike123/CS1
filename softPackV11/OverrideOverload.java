class OverrideOverload
{
   public static void main(String[] args)
   {
      B b;
      b = new B();
      b.f();         // displays f in B
      b.g();         // displays g in A
      b.g(5);        // displays g in B
   }
}
//================================================
class A
{
   public void f()
   {
      System.out.println("f in A");
   }
   //----------------------------------
   public void g()
   {
      System.out.println("g in A");
   }
}
//================================================
class B extends A
{
   public void f()
   {
      System.out.println("f in B");
   }
   //----------------------------------
   public void g(int x)
   {
      System.out.println("g in B");
   }
}

