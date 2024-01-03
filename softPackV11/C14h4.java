public static void rp4(int x)
{
   if (x == 0)
      return 0;
   return x + rp4(x-1);
}
