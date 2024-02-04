class Test
{
    public static void main(String[] args)
    {
        int x = 1;
        double y = 2.5;
        boolean b;

        b = (x > y);
        b = !b;

        boolean c = b && (x < y);

        boolean d = c || (x > y);

        System.out.println(d);
    }
}