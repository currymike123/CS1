class C11h12
{
   public static void main(String[] args)
   {
      Can c = new Can ();
      c = null;        // object is now subject to reclamation
      System.out.println("Calling garbage collector");	
      System.gc();
   }
}
//======================================================
class Can
{
   int x = 1;
   protected void finalize() throws Throwable
   {
      super.finalize();      
      System.out.println("in finalize");
   }
}
