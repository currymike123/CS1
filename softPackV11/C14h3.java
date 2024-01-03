public static int rp3(int x, int y)
{
   if (y == 0)
      return x;
   return rp3(x, y-1) + 1;
}
