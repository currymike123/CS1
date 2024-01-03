class C4h13
{
   public static void main(String[] args)
   {
      int i, j;
      i = 1;
      while (i < 10)
      {
         j = 1;
         while (j < 5)
         {
            System.out.print(i + "," + j + "  ");
            j++;
         }
         System.out.println();     // go to next line
         i++;
      }
   }
}
