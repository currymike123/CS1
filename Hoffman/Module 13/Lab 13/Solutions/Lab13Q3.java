package com.kaitlinHoff;

import java.util.Scanner;

public class Lab13Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a String: ");
        String word = sc.next();

        word = noDigitsOrSymbols(word);
        System.out.println(word);


    }
    public static String noDigitsOrSymbols(String s) {
        String word = "";
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)) {
                word+=s.charAt(i);
            }
        }
        return word;
    }
}
