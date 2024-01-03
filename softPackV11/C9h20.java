String s1 = new String("hello");
String s2 = new String("hello");
ArrayList<String> q1 = new ArrayList<String>();
ArrayList<String> q2 = new ArrayList<String>();
q1.add(s1); q1.add(s1);
q2.add(s2); q2.add(s2);
// compare two ArrayLists with equals
System.out.println(q1.equals(q2));
