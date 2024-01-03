class Recursion4
{
   public static void main(String[] args)
   {
       System.out.println(reverse(""));      // null string
       System.out.println(reverse("A"));     // 1-char string
       System.out.println(reverse("ABCDEF"));// multi-char
   }
   //----------------------------------
   public static String reverse(String s)
   {
      if (s.length() <= 1)
         return s;
      return
         reverse(s.substring(1, s.length())) + s.substring(0, 1);
   }
}
