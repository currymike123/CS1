class TestOneThing
{
   public static void main(String[] args)
   {
      OneThing<Integer> p1 = new OneThing<Integer>(7);
      System.out.println(p1.get());     // displays 7

      OneThing<String> p2 = new OneThing<String>("hello");
      System.out.println(p2.get());     // displays hello
   }
}
//================================================
class OneThing<T>            // T is the type parameter
{
   private T x;              // Use T as if it is a type
   //----------------------------------
   public OneThing(T xx)
   {
      x = xx;
   }
   //----------------------------------
   public T get()
   {
      return x;
   }
}

