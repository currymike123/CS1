int x, y;                  
x = 1;
y = ++x;
System.out.println("x = " + x + " y = " + y);
x = 1;
y = x + 1;
System.out.println("x = " + x + " y = " + y);

x = 1;
y = x + x++;      // avoid writing confusing statements like this one
System.out.println(y);
x = 1;
y = x++ + x;      // avoid writing confusing statements like this one
System.out.println(y);
