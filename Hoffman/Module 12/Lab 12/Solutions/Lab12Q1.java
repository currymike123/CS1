package com.kaitlinHoff;

import java.util.*;

public class Lab12Q1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        fillArrayList(al, 8);
        System.out.println(al);

        double average = getAverage(al);
        System.out.println("Average = " + average);

        removeAboveAverage(al);
        System.out.println(al);

    }
    //Method 1a. to fill ArrayList
    public static void fillArrayList(ArrayList<Integer> al, int n) {
        int r = (int)(Math.random() * (100-25))+25;
        for(int i = 0; i<n; i++) {
            al.add(r);
            r = (int)(Math.random() * (100-25))+25;
        }
    }
    //Method 1b. to get average
    public static double getAverage(ArrayList<Integer> al) {
        int sum = 0;
        for(int i = 0; i<al.size(); i++) {
            sum += al.get(i);
        }
        return (double)sum/al.size();
    }
    //Method 1c. remove values from the ArrayList
    public static void removeAboveAverage(ArrayList<Integer> al) {
        double avg = getAverage(al);
        for(int i = 0; i<al.size(); i++) {
            int num = al.get(i);
            if(num > avg) {
                al.remove(i);
                i--;
            }
        }
    }
}
