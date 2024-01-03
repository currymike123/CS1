class SimpleList2
{
   static Node head = null; // static so addNode/traverse can access
   public static void main(String[] args)
   {
      addNode(1);  // add node with 1 to the beginning of list
      addNode(2);  // add node with 2 to the beginning of list
      addNode(3);  // add node with 3 to the beginning of list
      traverse();  // traverse list from first node to last
   }
   //-----------------------------------
   public static void addNode(int value)
   {
      Node p = new Node(); // create new node
      p.x = value;         // initialize x in new node
      p.link = head;       // make new node point to current 1st node
      head = p;            // make head to point to new node
   }
   //---------------------------
   public static void traverse()  // traverse from first to last node
   {
      Node p;
      p = head;           // assign p the pointer to 1st node on list
      while (p != null)   // use p, not head, so head not corrupted
      {
         System.out.println(p.x); // display x in node p points to
         p = p.link;              // move p to next node on list
      }
   }
}
//==================================================================
class Node    // Node definition
{
   Node link; // points to next node or is null if at last node
   int x;
}
