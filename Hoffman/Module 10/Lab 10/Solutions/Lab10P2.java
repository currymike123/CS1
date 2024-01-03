import java.util.Scanner;

public class Lab10P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 2:
        System.out.println("Question 2: ");

        int[] numbers = {1, 3, 99, 2, 6, 8};
        double[] random = {3.0, 2.87, 9, 1};

        int count = countDivisible(numbers);
        System.out.println("Count = " + count);

        count = countDivisible(random);
        System.out.println("Count = " + count);

//        Question 3:
        System.out.println("\nQuestion 3:");
        int[] copy = copyArray(numbers);
        printArray(copy);

//        Question 4:
        System.out.println("\nQuestion 4:");
        copy = copyReverse(numbers);
        printArray(copy);

    }
//    2
    public static int countDivisible(int[] arr) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }
//    2 a.
    public static int countDivisible(double[] arr) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }
//    3
    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
//   4
    public static int[] copyReverse(int[] arr) {
        int[] copy = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0; i--) {
            copy[i] = arr[j];
            j++;
        }
        return copy;
    }

//printArray method for int[]
    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}