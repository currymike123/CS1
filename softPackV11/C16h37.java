class C16h37
{
   public static void main(String[] args)
   {
      MyLinkedList list = new MyLinkedList();
      list.addNode(1);
      list.addNode(2);
      list.addNode(3);
      list.traverse();
   }
}
class MyLinkedList
{
   private class Node      // Node definition, inner class
   {
      private Node link;  // points to next node or is null if at last node
      private int x;      // data
   }   
   private Node head = null;  // set head to null so list initially empty
   public void addNode(int value)
   {
      Node p = new Node();   // create new node
      p.link = head;         // make new node point to first node
      p.x = value;           // initialize x field in new node
      head = p;              // set head to point to new node
   }
   public void traverse()	   // traverse in natural order
   {
      Node p = head;               // initialize p to pointto first node
      while (p != null)            // execute loop until p goes null
      {
         System.out.println(p.x);  // display x field in node p points to
         p = p.link;               // move p to next node on list
      }
   }
}
