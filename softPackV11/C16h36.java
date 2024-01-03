class C16h36
{
   public static void main(String[] args)
   {
      OneThing<Double> p = new OneThing<Double>(3.0);
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

