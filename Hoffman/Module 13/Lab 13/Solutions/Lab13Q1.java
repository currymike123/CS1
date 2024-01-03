package com.kaitlinHoff;

import java.util.Scanner;

public class Lab13Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a String: ");
        String word = sc.next();
        boolean p = palindrome(word);
        System.out.println(word + " is a palindrome: " + p);

    }
    public static boolean palindrome(String s) {
        int j = s.length()-1;
        for(int i = 0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
