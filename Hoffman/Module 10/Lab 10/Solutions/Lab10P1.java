import java.util.Scanner;

public class Lab10P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] randomNumbers = {1.7, 2.25, 3.45, -5.0, 8.3, -13.77, 21.2, 34, 55.67, -89.9};
        printArray(randomNumbers);
        double avg = getAverage(randomNumbers);
        System.out.println("Average of random numbers = " + avg);


    }
    public static void printArray(double[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //calculate sum of int[]
    public static double getSum(double[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //calculate average of int[]
    public static double getAverage(double[] arr) {
        double sum = getSum(arr);
        return sum/arr.length;
    }
}