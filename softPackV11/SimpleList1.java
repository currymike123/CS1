class SimpleList1     // simple program that creates/traverses list
{
  public static void main(String[] args)
   {  
      Node head = null;     // set head to null so list initially empty

      Node p = new Node();  // create new node
      p.x = 1;              // initialize x field in new node to 1
      p.link = head;        // make link field point to currrent 1st node
      head = p;             // make head point to new node so it is 1st

      p = new Node();       // create second node
      p.x = 2;              // initialize x field in second node to 2
      p.link = head;        // make link field point to currrent 1st node
      head = p;             // make head point to new node so it is 1st

      p = new Node();       // create third node
      p.x = 3;              // initialize x field in third node to 3
      p.link = head;        // make link field point to currrent 1st node
      head = p;             // make head point to new node so it is 1st

      p = head;             // assign pointer to 1st node on list to p
      while (p != null)     // use p, not head, so head not corrupted
      {
         System.out.println(p.x);  // display x in node p that points to
         p = p.link;               // move p to next node on list
      }
   }
}
//=================================================================
class Node      // Node definition
{
   Node link;   // points to next node or is null if at last node in list
   int x;       // data field
}
