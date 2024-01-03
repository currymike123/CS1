class C16h38
{
   public static void main(String[] args)
   {
      MyTree t = new MyTree();

      t.insert(5);
      t.insert(10);
      t.insert(2);
      t.insert(9);
      t.insert(3);
      t.insert(1);
      t.inorder();
   }
}
//====================================================
class MyTree
{
   private class Node
   {
      private int x;
      private Node left;
      private Node right;
   }
   //---------------------------------------
   private Node rootptr = null;

   public void insert(int xx)
   {
      Node n = new Node();
      n.x = xx;
      if (rootptr == null)
         rootptr = n;
      else
      {
         Node trailing = null, leading = rootptr;
         while (leading != null)
         {
            trailing = leading;
            if (xx < leading.x)
               leading = leading.left;
            else
               leading = leading.right;
         }
         if (xx < trailing.x)
            trailing.left = n;
         else
            trailing.right = n;
       }
   }
   //---------------------------------------
   public void inorder()
   {
      inorder(rootptr);
   }
   //---------------------------------------
   private void inorder(Node p)
   {
      if (p != null)
      {
         inorder(p.left);
         System.out.println(p.x);
         inorder(p.right);
      }
   }
}

