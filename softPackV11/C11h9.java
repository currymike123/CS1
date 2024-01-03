class C11h9
{
   public static void main(String[] args)
   {
      Cut a = new Cut();
      String s = "hello";
      a.f(s);
      Integer i = 1;
      a.f(i);
   }
}
//================================================
class Cut
{
   public void f(String s)
   {
      System.out.println("String parameter");
   }
   //----------------------------------
   public void f(Object o)
   {
      System.out.println("Object parameter");
   }
}
