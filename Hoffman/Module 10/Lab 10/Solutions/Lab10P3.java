 import java.util.Scanner;

public class Lab10P3 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 5
        System.out.println("Question 5:");
        System.out.print("Enter a value for size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<arr.length; i++) {
            System.out.print("Enter value for array: ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);


//        Question 6
        System.out.println("\nQuestion 6:");
        double[] grades = {98.6, 78.2, 56.9};
        double[] updatedGrades = new double[grades.length+1];

        for(int i = 0; i<grades.length; i++) {
            updatedGrades[i] = grades[i];
        }
        updatedGrades[updatedGrades.length-1] = 88.8;

        printArray(updatedGrades);


//        Question 7
        System.out.println("\nQuestion 7:");
        int[] a = {56, 9, 17, 6, 2, 0, 1, 199, 256, 94};
        int[] evensArray = evenArray(a);
        int[] oddsArray = oddArray(a);

        printArray(evensArray);
        printArray(oddsArray);

    }

    public static int getEvens(int[] arr) {
        int evens = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public static int[] evenArray(int[] arr) {
        int size = getEvens(arr);
        int[] evensArr = new int[size];

        for(int i = 0, j = 0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evensArr[j] = arr[i];
                j++;
            }
        }
        return evensArr;
    }

    public static int[] oddArray(int[] arr) {
        int size = arr.length - getEvens(arr);
        int[] oddsArr = new int[size];

        for(int i = 0, j = 0; i<arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddsArr[j] = arr[i];
                j++;
            }
        }
        return oddsArr;
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