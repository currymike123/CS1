import java.util.Scanner;

public class Lab11Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 1
        System.out.println("Question 1:");

        int[] occurrences = new int[100];
        System.out.print("Enter integers between 1 and 100. Input ends with 0: ");
        int n = sc.nextInt();

        while(n!=0) {
            if(n < 1 || n >100) {
                System.out.print("Integer must be between 1 and 100. Try Again: ");
            } else {
                occurrences[n-1]++;
            }
            n = sc.nextInt();
        }

        for(int i = 0; i<occurrences.length; i++) {
            int amount = occurrences[i];
            if(amount != 0) {
                if(amount > 1) {
                    System.out.println((i + 1) + " occurs " + occurrences[i] + " times ");
                } else {
                    System.out.println((i + 1) + " occurs " + occurrences[i] + " time ");
                }
            }
        }

    }

}