class TestEquals
{
   public static void main(String[] args)
   {
      P p;
      Q q1, q2;
      q1 = new Q(5);
      q2 = new Q(5);
      System.out.println(q1.equals(q2));
      p = q2;
      System.out.println(q1.equals(p));
      // System.out.println(q2.equals(null));  // run-time error

      R r1, r2;
      r1 = new R(5);
      r2 = new R(5);
      System.out.println(r1.equals(r2));
      p = r2;
      System.out.println(r1.equals(p));
      System.out.println(r2.equals(p));
      System.out.println(r1.equals(null));
   }
}
class P
{
   // ...
}
class Q extends P
{
   private int x;
   public Q(int xx)
   {
      x = xx;
   }
   public boolean equals (Q r)  // incorrect implementation
   {
      return x == r.x;
   }
}
class R extends P
{
   private int x;
   public R(int xx)
   {
      x = xx;
   }
   public boolean equals (Object r)  // correct implementation
   {
      if (r == null) return false;
      if (getClass() != r.getClass()) return false;
      return x == ((R)r).x;
   }
}

