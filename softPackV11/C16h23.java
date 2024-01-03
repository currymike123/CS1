class C16h23
{
   public static void main(String[] args)
   {
      MyArrayList<Integer> mal1 = new MyArrayList<Integer>(); // Integer base type
      mal1.add(5);
      mal1.add(2);
      System.out.println(mal1.get(0));
      System.out.println(mal1.get(1));
      MyArrayList<String> mal2 = new MyArrayList<String>();  // String base type
      mal2.add("hello");
      System.out.println(mal2.get(0));
   }
}
//===============================================
class MyArrayList<T>
{
   private T[] current = (T[])(new Object[100]);
   private int size = 0;
   //----------------------------------
   public T get(int i)
   {
      return current[i];
   }
   //----------------------------------
   public void add(T x)
   {
      if (size >= current.length)
      {
         T[] old = current;                            // save current
         current = (T[])(new Object[old.length + 50]);   // get new array
         for (int i = 0; i < old.length; i++)          // copy
            current[i] = old[i];
      }
      current[size++] = x;                             // add x to array
   }
   //----------------------------------
   public int size()
   {
      return size;
   }
}

