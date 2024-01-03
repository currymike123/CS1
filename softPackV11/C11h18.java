String s1 = new String("hello");
String s2 = new String("hello");
ArrayList<String> q1 = new ArrayList<String>();
q1.add(s1);
int index = q1.indexOf(s2);
System.out.println(index);

Cold h1 = new Cold();
Cold h2 = new Cold();
ArrayList<Cold> q2 = new ArrayList<Cold>();
q2.add(h1);
index = q2.indexOf(h2);
System.out.println(index);

class Cold
{
   private int x = 3;
}
