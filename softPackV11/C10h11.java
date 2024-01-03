Asp a = new Bee();              // a points "down" to Bee object
a.f();                          // Which f() is executed?
System.out.println(a.x);        // Which x is displayed?
Bee b = (Bee)a;                 // b points "across to Bee object
b.f();                          // Which f is executed?
System.out.println(b.x);        // Which x is displayed?
((Bee)a).f();                   // Which f() is executed?
System.out.println(((Bee)a).x); // Which x is displayed? 
