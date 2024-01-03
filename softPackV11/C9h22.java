import java.util.ArrayList;
class C9h22  // same as ArrayListExample in Fig. 9.12
{
   public static void main(String[] args)
   {
      ArrayList<String> sal = new ArrayList<String>();

      sal.add("one");            // add "one" to end of sal
      sal.add("three");          // add "three" to end of sal
      sal.add(1, "two");         // insert "two" at index 1
      display(sal);              // displays one two three

      sal.set(1, "2.0");         // overlay slot 1 with "2.0"
      display(sal);              // displays on 2.0 three

      System.out.println("slot 1 contains " + sal.get(1));

      System.out.println("Now remove " + sal.remove(1));
      display(sal);              // displays one three

      System.out.println("idx of three is " + sal.indexOf("three"));

      if (sal.contains("three")) // does sal object contain three?
         System.out.println("sal object contains three");
      else
         System.out.println("sal object does not contain three");

      System.out.println("size of sal object is " + sal.size());

      if (sal.isEmpty())
         System.out.println("sal object is empty");
      else
         System.out.println("sal object is not empty");

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
