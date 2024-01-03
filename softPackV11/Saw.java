import java.util.Random;
class Saw
{
   private int x;
   private Integer p;
   //----------------------------------
   public Saw()
   {
      Random r = new Random();
      x = r.nextInt();
      p = new Integer(r.nextInt());
   }
}
