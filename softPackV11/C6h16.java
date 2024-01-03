public static void main(String[] args)
{
   Point p = new Point();
   System.out.println(p.toString + " is this far from origin: " +
                      p.distanceFromOrigin());
   p = new Point(3, 4);
   System.out.println(p.toString() + " is this far from origin: " + 
                      p.distanceFromOrigin());
}
