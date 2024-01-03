import java.util.Scanner;

public class Lab10Q9 {
    public static void main(String[] args) {

        int[] counts = findCounts();
        printArray(counts);

    }
/*
===================================
------------- Methods -------------
===================================
 */
    public static int[] findCounts() {
        int[] counts = new int[3];

        for(int i = 0; i<=1000; i++) {
            if(i % 2 == 0) {
                counts[0]++;
            }
            if(i % 3 == 0 && i % 7 == 0) {
                counts[1]++;
            }
            if(i % 5 == 0 || i % 8 == 0) {
                counts[2]++;
            }
        }
        return counts;
    }

    //  printArray method for int[]
    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}