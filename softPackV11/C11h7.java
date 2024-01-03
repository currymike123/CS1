class C11h7
{
   public static void main(String[] args)
   {
      Arc a = new Arc ();
      Bam b = new Bam ();
      a.g();
      b.g();
   }
}
//================================================
class Arc
{
   void f()
   {
      System.out.println("f in Arc");
   }
   //----------------------------------
   void g()
   {
      f();
   }
}
//================================================
class Bam extends Arc
{
   void f()
   {
      System.out.println("f in Bam");
  }
}
