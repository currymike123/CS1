int x = 12, y = 10, z1, z2;
System.out.println("x  = " + Integer.toBinaryString(x)); // display x
System.out.println("y  = " + Integer.toBinaryString(y)); // display y
z1 = x | y;    // bitwise OR
System.out.println("z1 = " + Integer.toBinaryString(z1));// display z1 
z2 = x & y;    // bitwise AND
System.out.println("z2 = " + Integer.toBinaryString(z2));// display z2
