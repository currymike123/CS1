import java.util.ArrayList;
class MyStack<T>
{
   private ArrayList<T> s = new ArrayList<T>();
   //----------------------------------
   public void push(T x)
   {
      s.add(x);
   }
   //----------------------------------
   public T pop()
   {
      return s.remove(s.size() - 1);
   }
   //----------------------------------
   public boolean isEmpty()
   {
      return s.size() == 0;
   }
}
