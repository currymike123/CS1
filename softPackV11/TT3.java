private void inorder(Node p)    
{
      Node[] stack = new Node[100];
      int top = -1;
      while (p != null)
      {
         stack[++top] = p;
         p = p.left;
         continue;

LLL:     System.out.println(p.x);  // labels not supported in Java
         p = p.right;
      }
      if (top != -1)
      {
        p = stack[top--];
        goto LLL;                  // goto not supported in Java
      }
}


