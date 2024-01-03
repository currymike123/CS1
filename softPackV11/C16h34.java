import java.util.ArrayList;
class C16h34
{
   public static void main(String[] args)
   {
      MyStack<Integer> s = new MyStack<Integer>();
      for (int i = 1; i <= 5; i++)
         s.push(i);                
      while (!s.isEmpty())
      {
         System.out.println(s.pop());
      }
   }
}
//=============================================
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
