import java.util.ArrayList;
class ArrayListExample
{
   public static void main(String[] args)
   {
      ArrayList<String> sal = new ArrayList<String>();

      sal.add("one");            // add "one" to end of sal
      sal.add("three");          // add "three" to end of sal
      sal.add(1, "two");         // insert "two" at index 1
      display(sal);              // displays one two three

      sal.set(1, "2.0");         // overlay slot 1 with "2.0"
      display(sal);              // displays one 2.0 three

      System.out.println("slot 1 contains " + sal.get(1));

      System.out.println("Now remove " + sal.remove(1));
      display(sal);              // displays one three

      System.out.println("index of three is " + sal.indexOf("three"));

   }
   //----------------------------------
   public static void display(ArrayList<String> sal)
   {
      System.out.print("ArrayList now contains ");
      for (int i = 0; i < sal.size(); i++)
         System.out.print(sal.get(i) + " ");
      System.out.println();
   }
}
