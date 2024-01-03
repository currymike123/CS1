class TestBadGeneric1
{
   public static void main(String[] args)
   {
      Hasf h1 = new Hasf();
      BadGeneric1<Hasf> g1 = new BadGeneric1<Hasf>(h1);
      g1.m();
      BadGeneric1<String> g2 = new BadGeneric1<String>("hello");
      g2.m();
   }
}
//================================================
class Hasf
{
   public void f()
   {
      System.out.println("hello");
   }
}
//================================================
class BadGeneric1<T>
{
   T r;
   //----------------------------------
   public BadGeneric1(T rr)
   {
      r = rr;
   }
   //----------------------------------
   public void m()
   {
      System.out.println(r.toString());  // legal
      r.f();                             // illegal
   }
}

