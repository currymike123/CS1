
class C16h32
{
   public static void main(String[] args)
   {
      Yi<Integer> y1 = new Yi<Integer>(20);
      y1.display());
      Er e = new Er();
      Yi<Er> y2 = new Yi<Er>(e);
      y2.display();
   }
}
//=======================================
// class Yi is not finished.  Finish it.
T x;

public Yi(T xx)
{
   x = xx;
}

public void display()
{
   System.out.println(x);
}



class Er
{
   private int n = 2;
}
