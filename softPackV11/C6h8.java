class C6h8
{
   public static void main(String[] args)
   {
       DefaultValues v = new DefaultValues();
       v.displayVariables();
    }
}
//========================================
class DefaultValues
{
   private byte b;
   private short s;
   private int i;
   private long l;
   private float f;
   private double d;
   private char c;
   private boolean boo;
   //-------------------------
   public void displayVariables()
   {
      System.out.println(b);
      System.out.println(s);
      System.out.println(i);
      System.out.println(l);
      System.out.println(f);
      System.out.println(d);
      System.out.println(c);
      System.out.println(boo);
   }
}
