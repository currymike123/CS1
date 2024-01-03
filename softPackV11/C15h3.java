class C15h3
{
   public static void main(String[] args)
   {
      MyLinkedList list = new MyLinkedList();
      list.addFirst(1);
      list.addFirst(2);
      list.addFirst(3);
      System.out.println("Numbers on list");
      list.traverse();
   }
}
//==============================================
class MyLinkedList   // copy of MyLinkedList in Fig. 15.7
{
   private class Node            // inner class
   {
      private Node link;
      private int x;
   }
   //----------------------------------
   private Node first = null;    // initial value is null
   //----------------------------------
   public void addFirst(int d)
   {
      Node newNode = new Node(); // create new node
      newNode.x = d;             // init data field in new node
      newNode.link = first;      // new node points to first node
      first = newNode;           // first now points to new node
   }
   //----------------------------------
   public void traverse()
   {
      Node p = first;
      while (p != null)            // do loop until p goes null
      {
         System.out.println(p.x);  // display data
         p = p.link;               // move p to next node
      }
   }
}

