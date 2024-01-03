class TestOrderedPair
{
   public static void main(String[] args)
   {
      OrderedPair<Integer> p = new OrderedPair<Integer>(1, 2);
      System.out.println(p.smaller());
   }
}
//================================================
class OrderedPair<T>
{
   private T x, y;
   //----------------------------------
   public OrderedPair(T xx, T yy)
   {
      x = xx;
      y = yy;
   }
   //----------------------------------
   public T smaller()
   {
      if (x.compareTo(y) < 0)     // illegal
         return x;
      else
         return y;
   }
}

