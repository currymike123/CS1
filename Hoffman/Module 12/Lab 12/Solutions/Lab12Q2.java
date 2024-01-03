package com.kaitlinHoff;

import java.util.*;

public class Lab12Q2 {

    public static void main(String[] args) {

        ArrayList<Double> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number. Enter 0 to stop: ");
        double num = sc.nextDouble();

        while(num!=0) {
            al.add(num);
            num = sc.nextDouble();
        }
        System.out.println(al);

        //getting max value
        double max = getMax(al);
        System.out.println("Max = " + max);
    }
    public static double getMax(ArrayList<Double> al) {
        double max = al.get(0);
        for(int i = 1; i< al.size();  i++) {
            if(al.get(i)>max) {
                max = al.get(i);
            }
        }
        return max;
    }
}