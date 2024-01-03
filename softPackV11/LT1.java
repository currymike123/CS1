class LT1
{
   static Node head = null; // static so addNode/traverse can access
   public static void main(String[] args)
   {
      addNode(1);      // add node with 1 to the beginning of list
      addNode(2);      // add node with 2 to the beginning of list
      addNode(3);      // add node with 3 to the beginning of list
      rtraverse(head); // last-to-first traversal
   }
   //-----------------------------------
   public static void addNode(int value)
   {
      Node p = new Node(); // create new node
      p.x = value;         // initialize x field in this node
      p.link = head;       // make new node point to current 1st node
      head = p;            // make head point to new node
   }
   //----------------------------------
   public static void rtraverse(Node p)  // traverse from last to 1st
   {
      if (p != null)
      {
         rtraverse(p.link);        // display tail in reverse order
         System.out.println(p.x);  // display data in 1st node
      }
   }
}
//==================================================================
class Node         // Node definition
{
   Node link;      // points to next node or is null if at last node
   int x;
}

