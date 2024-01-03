package com.kaitlinHoff;

import java.util.Scanner;

public class Lab13Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a String: ");
        String word = sc.next();
        word = newString(word);
        System.out.println(word);


    }
    public static String newString(String s) {
        String word = "";
        int j = 0;
        for(int i = 0; i<s.length(); i++) {
            if(Character.isLetter(s.charAt(i)) && j%2==0) {
                word += Character.toUpperCase(s.charAt(i));
                j++;
            } else if(Character.isLetter(s.charAt(i))) {
                word += s.charAt(i);
                j++;
            } else {
                word += s.charAt(i);
            }
        }
        return word;
    }
}
