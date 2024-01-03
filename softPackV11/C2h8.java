class C2h8
{
   public static void main(String[] args)
   {   
      int x, y;
      x = 1;
      x++;
      System.out.println("x++; changes x from 1 to " + x);
      x = 1;
      ++x;
      System.out.println("++x; changes x from 1 to " + x);
      x = 1;	
      y = x++;     // increment after assignment
      System.out.println("y = x++; changes x from 1 to " + x);
      System.out.println("y = x++; assigns y " + y);
      x = 1;
      y = ++x;     // increment before assignment
      System.out.println("y = ++x; changes x from 1 to " + x);
      System.out.println("y = ++x; assigns y " + y);
  }
}
