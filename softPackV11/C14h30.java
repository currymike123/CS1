public static int f(int n)
{
    if (n <= 1)
        return 0;
    else
        return 1 + f(n/2);
}
