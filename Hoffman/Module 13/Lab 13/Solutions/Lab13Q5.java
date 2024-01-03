package com.kaitlinHoff;

import java.util.*;
import java.io.*;

public class Lab13Q5 {

    public static void main(String[] args) throws IOException {

        File f = new File("output.txt");
        PrintWriter pw = new PrintWriter(f);

        int sum = 0;
        for(int i = 0; i<3; i++) {
            sum+=Integer.parseInt(args[i]);
        }

        pw.println("Sum of numbers = " + sum);

        pw.close();
       
    }
}
