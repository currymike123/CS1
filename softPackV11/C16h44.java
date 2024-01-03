class C16h44
{
   public static void main(String[] args)
   {
      MyQueue<String> q = new MyQueue<String>();
      q.enqueue("hello");
      q.enqueue("goodbye");
      q.enqueue("last one");
      while (!q.isEmpty())
      {
         System.out.println(q.size());
         System.out.println(r.dequeue());
      }
   }
}
