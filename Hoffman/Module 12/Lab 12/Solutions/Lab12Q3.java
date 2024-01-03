import java.util.*;

public class Lab12Q3 {

    public static void main(String[] args) {

        String s = "hoWdY";
        //a
        System.out.println("length = " + s.length());
        //b
        System.out.println("first letter = " + s.charAt(0));
        //c
        System.out.println("last letter = " + s.charAt(s.length()-1));
        //d
        printPerLine(s);
        //e
        printBackwards(s);
        //f
        System.out.println("\n" + s.toUpperCase());
        //g
        System.out.println(s.toLowerCase());
    }
    //3d. print one per line
    public static void printPerLine(String s) {
        for(int i = 0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
    //3e. print backwards
    public static void printBackwards(String s) {
        for(int i = s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}