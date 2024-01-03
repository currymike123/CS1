class Testprintln
{
   public static void main(String[] args)
   {
      A a = new A();
      System.out.println(a);
   }
}
//=======================================
class A
{
   int x = 1;
   int y = 2;
   public String toString()
   {
      return "" + x + " "+ y; // return the values of x and y as a string
   }
}
