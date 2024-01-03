class PrimitiveTypes
{
   public static void main(String[] args)
   {
       int x = 1, y = 2;
       System.out.println(x < y);      // displays true
       boolean boo1, boo2;
       boo1 = x < y;                     // boo1 assigned true
       boo2 = false;                     // boo2 assigned false
       System.out.println(boo1 && boo2); // displays false
       System.out.println(boo1 || boo2); // displays true
       System.out.println(!boo2);        // displays true

       byte b;
       short s = 257;
       b = (byte)s;             // truncated value assigned
       System.out.println(b);   // displays 1

       float f = 1.0f/3.0f;     // f suffix means float constant
       double d = 1.0/3.0;      // no suffix means double constant

       System.out.println(f);   // displays 0.33333334
       System.out.println(d);   // displays 0.3333333333333333

       d = 3.99999999;
       long lg;
       lg = (long)d;            // fractional part truncated
       System.out.println(lg);  // displays 3
   }
}
