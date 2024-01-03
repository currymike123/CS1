class C14h10     // copy of Recursion4 in Fig. 14.6
{
   public static void main(String[] args)
   {
       System.out.println(reverse(""));      // test with null string
       System.out.println(reverse("A"));     // test with 1-char string
       System.out.println(reverse("ABCDEF"));// test with multi-char
   }
   //----------------------------------
   public static String reverse(String s)
   {
      if (s.length() <= 1)
         return s;
      return reverse(s.substring(1, s.length()))+ s.substring(0, 1);
   }
}
