import java.util.Scanner;

public class Lab9Part2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Question 6
        System.out.println("Question 6:");
        char[] alphabet = new char[26];

        char c = 'a';
        for(int i = 0; i < alphabet.length; i++) {
          alphabet[i] = c;
          c++;
        }

        printArray(alphabet);

        //print backwards:
        for(int i = alphabet.length-1; i>=0; i--) {
            System.out.print(alphabet[i] + " ");
        }

//Question 7
        System.out.println("\nQuestion 7:");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        increaseByOne(numbers);
        printArray(numbers);

//Question 8
        System.out.println("\nQuestion 8:");
        int[] userChoice = new int[5];
        System.out.print("Enter 5 values to place in array: ");
        for(int i = 0; i<userChoice.length; i++) {
            userChoice[i] = sc.nextInt();
        }

        printArray(userChoice);

    }
//Question 6
    public static void printArray(char[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//Question 7
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void increaseByOne(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            arr[i] += 1;
        }
    }
}