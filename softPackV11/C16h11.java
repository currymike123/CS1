class C16h11
{
   public static void main(String[] args)
   {
      Vincent v = new Vincent();
      v.f();
      v.g();
      v.display();
   }
}
//================================================
abstract class Dali
{
    private int x = 1;
    private static int y = 3;
    public abstract void f();
    public void g()
    {
       System.out.println("in g");
    }
}
//================================================
class Vincent extents Dali
{
   public void f()
   {
      Sytem.out.println("in f");
   }
   public void display()
   {
      System.out.println(x + " " + y);
   }
}

