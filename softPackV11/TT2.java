import java.util.Random;
class TT2
{
   public static void main(String[] args)
   {
      MyTree t = new MyTree();
      Random r = new Random();
      for (int i = 1; i <= 10; i++)     // insert 10 numbers
         t.insert(r.nextInt(300));      // numbers range from 0 to 299
      t.inorder();                      // inorder traversal
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
      while (p != null)    // inorder traversal with tail recursion eliminated
      {
         inorder(p.left);
         System.out.println(p.x);
         p = p.right;
      }
   }
}

