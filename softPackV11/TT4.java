import java.util.Random;
class TT4
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
      Node[] stack = new Node[100];
      int top = -1;
      while (true)      // not an infinite loop because of break statement
      {
         while (p != null)
         {
            stack[++top] = p;
            p = p.left;
         }

         if (top == -1)         // if no more paths to follow, break out of loop
            break;              
         p = stack[top--];      // restore p for parent node
         System.out.println(p.x);
         p = p.right;           // traverse right subtree
      }
   }
}

