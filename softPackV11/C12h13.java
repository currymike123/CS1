class C12h13
{
   public static void main(String[] args)
   {
     NullPointer r;
     r = null;
     r.f();
   }
}
//================================================
class NullPointer
{
    public void f()
    {
       System.out.println("hello");
    }
}

