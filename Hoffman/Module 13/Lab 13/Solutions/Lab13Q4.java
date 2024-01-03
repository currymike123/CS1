package com.kaitlinHoff;

import java.util.*;
import java.io.*;

public class Lab13Q4 {

    public static void main(String[] args) throws IOException {

        System.out.println(checkSSN("123-45+6783"));
        System.out.println(checkSSN("123-45-6783"));
        System.out.println(checkSSN("123-45-783"));
    }
    //Q1
    public static boolean checkSSN(String ssn) {
        if(ssn.length() == 11) {
            if(ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
                return false;
            }
            String beg = ssn.substring(0,3);
            String mid = ssn.substring(4,6);
            String end = ssn.substring(7);

            String onlyNumbers = beg + mid + end;
            for(int i = 0; i<onlyNumbers.length(); i++) {
                char c = onlyNumbers.charAt(i);
                if(!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
