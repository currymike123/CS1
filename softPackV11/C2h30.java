class C2h30
{
   public static void main(String[] args)
   {
      String p, q, r, s;           // create reference variables p, q, r, and s
      p = new String("hello");     // create object
      System.out.println(p);       // display p-string (displays hello)
      q = p;                       // now q points to same object as p
      System.out.println(q);       // display q-string (displays hello)
      r = p.toUpperCase();         // create second object with all uppercase
      System.out.println(r);       // display r-string (displays HELLO)
      s = "bye";                   // object for "bye" automatically created
      System.out.println(s);       // display s-string (displays bye)

      System.out.println(s.charAt(0));
      System.out.println(s.charAt(2));
      System.out.println(s.indexOf(‘e’));
      System.out.println(s.length());
      System.out.println(s.equals(p));
   }
}