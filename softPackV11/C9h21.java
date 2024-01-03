ArrayList<Integer> ial = new ArrayList<Integer>();
Integer i1 = new Integer(1); 
Integer i2 = new Integer(1);     // construct identical object
if (i1 == i2)
   System.out.println("identical references, identical objects");
else
   System.out.println("different references, identical objects");
ial.add(i1);
ial.remove(i1);                  // remove what was just added
System.out.println(ial.size());  // should be zero
ial.add(i1);
ial.remove(i2);                  // will passing i2 remove i1?
System.out.println(ial.size());  // is it zero?
