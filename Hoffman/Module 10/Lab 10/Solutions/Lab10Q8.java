import java.util.Scanner;

public class Lab10Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {12, 3, -8, 100, -2};
        int[] b = {4, -9, 30, 2};
        int[] c = bigArray(a, b);
        printArray(c);


    }
/*===================
-------Methods-------
====================*/
    public static int[] bigArray(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];

        int j = 0;
        int k = 0;
        for(int i = 0; i < c.length; i++) {
            if(i % 2 == 0 ) {
                c[i] = a[j];
                j++;
            } else {
                if(i < b.length) {
                    c[i] = b[k];
                    k++;
                }
            }
        }
        return c;
    }

//  printArray method for int[]
    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//  printArray method for double[]
    public static void printArray(double[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}