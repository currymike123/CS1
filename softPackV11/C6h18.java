class C6h18
{
   public static void main(String[] args)
   {
      long i = 1;
      Node first = null, p;
      while (true)
      {
          p = new Node();
          p.count = i++;
          p.link = first;
          first = p;
      }
   }
}
//================================================
class Node
{
    public Node link;
    public long count;
}
