import java.util.ArrayList;
class C10h16
{
   public static void main(String[] args)
   {   
      ArrayList<Integer> ial = new ArrayList<Integer>();
      Integer i1 = new Integer(1); 
      Integer i2 = new Integer(1);    // construct identical object
      if (i1 == i2)
         System.out.println("i1 == i2 is true");
      else
         System.out.println("i1 == i2 is false");
      ial.add(i1);
      ial.remove(i1);                 // remove what was just added
      System.out.println(ial.size()); // should be zero
      ial.add(i1);
      ial.remove(i2);                 // will passing i2 remove i1?
      System.out.println(ial.size()); // is it zero?

      ArrayList<Strange> ral = new ArrayList<Strange>();
      Strange r1 = new Strange(); 
      Strange r2 = new Strange();     // construct identical object
      if (r1 == r2)
         System.out.println("r1 == r2 is true");
      else
         System.out.println("r1 == r2 is false");
      ral.add(r1);
      ral.remove(r1);                 // remove what was just added
      System.out.println(ral.size()); // should be zero
      ral.add(r1);
      ral.remove(r2);                 // will passing r2 remove r1?
      System.out.println(ral.size()); // is it zero?
   }
}    
//==================================================
class Strange
{
   int x = 3;
}
