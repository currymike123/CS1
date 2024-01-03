class C10h9
{
   public static void main(String[] args)
   {
       Bud b = new Bud();
       b.display();
   }
}
//================================================
class Ale
{
   protected int x = 1;
   public Ale(int x)
   {
      this.x = x;
   }
}
//================================================
class Bud extends Ale
{
   private int y = 2;
   public void display()
   {
      System.out.println("x = " + x + " y = " + y);
   }
}
