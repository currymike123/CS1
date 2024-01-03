class C10h29
{
   public static void main(String[] args)
   {
      A a = new A();
      System.out.println(a);            // x data not displayed
      char[] ca = {'a', 'b', 'c'};
      System.out.println(ca);           // array displayed
   }
}
//======================================
class A
{ 
   public int x = 1;
}