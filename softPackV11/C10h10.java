class C10h10
{
   public static void main(String[] args)
   {
      Pie c = new Pie();
   }
}
//================================================
class Ate
{
   public Ate()
   {
      System.out.println("Ate constructor");
   }
}
//================================================
class My extends Ate
{
   public My()
   {
      System.out.println("My  constructor");
   }
}
//================================================
class Pie extends My
{
   public Pie()
   {
      System.out.println("Pie constructor");
   }
}
