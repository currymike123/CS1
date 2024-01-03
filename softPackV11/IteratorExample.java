import java.util.*;    // need to import ArrayList and Iterator
class IteratorExample
{
   public static void main(String[] args)
   {
      ArrayList<String> sal;
      sal = new ArrayList<String>();

      sal.add("Bert");
      sal.add("Ernie");
      sal.add("Grover");

      Iterator<String> itr;
      itr = sal.iterator();     // get iterator

      while (itr.hasNext())
         System.out.println(itr.next());
   }
}
