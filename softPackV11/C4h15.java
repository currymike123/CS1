int i = 1;
while (i <= 10)
{
   System.out.println("before continue i = " + ++i);
   if (i % 3 == 0) continue; // execute continue when i multiple of 3
   System.out.println("after continue i = " + i);
}
