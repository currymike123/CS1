import java.util.Scanner;

public class Lab11Q4Thru8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();

        System.out.println("Question 4, Pattern A:");
        patternA(n);

        System.out.println("\n\nQuestion 5, Pattern B:");
        patternB(n);

        System.out.println("\n\nQuestion 6, Pattern C:");
        patternC(n);

        System.out.println("\n\nQuestion 7, Pattern D:");
        patternD(n);

        System.out.println("\n\nQuestion 8, Pattern Pyramid:");
        System.out.print("Enter a value from 1 to 15: ");
        int val = sc.nextInt();
        patternPyramid(val);


    }
//    Question 4, Pattern A
    public static void patternA(int n) {
        for(int i = 1; i<=n; i++) {
            for(int k = 1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
//    Question 5, Pattern B
    public static void patternB(int n) {
        for(int i = n; i>=1; i--) {
            for(int k = 1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
//  Question 6, Pattern C
    public static void patternC(int n) {
        for(int i = 1; i<=n; i++){
            for(int k = i; k<n; k++) {
                System.out.print("  ");
            }
            for(int k = i; k>=1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
//    Question 7, Pattern D
    public static void patternD(int n) {
        for(int i = n; i>=1; i--) {
            for(int k = n; k>i; k--) {
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
//    Question 8, pyramid pattern
    public static void patternPyramid(int n) {
        if(n < 1 || n > 15) {
            System.out.println("Invalid number. Exiting program");
            return;
        }

        for(int i = 1; i<=n; i++){
            for(int k = i; k<n; k++) {
                System.out.print("  ");
            }
            for(int k = i; k>=1; k--) {
                System.out.print(k + " ");
            }
            for(int k = 2; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}