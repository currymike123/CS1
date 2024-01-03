class Inheritance3
{
   public static void main(String[] args)
   {
      A a;
      B b = new B();
      a = b;           // a now points down to B object
      a.f();           // displays "f in A"
      a.g();           // displays "g in B"
      a.h();           // illegal: compile-time error
      ((B)a).h();      // displays "h in B"
      b.h();           // displays "h in B"
   }
}
//================================================
class A
{
   public void f()
   {
      System.out.println("f in A");
   }
   //-----------------------------------
   public void g()
   {
      System.out.println("g in A");
   }
}
//================================================
class B extends A
{
   public void g()
   {
      System.out.println("g in B");
   }
   //------------------------------------ 
   public void h()
   {
      System.out.println("h in B");
   }
}

