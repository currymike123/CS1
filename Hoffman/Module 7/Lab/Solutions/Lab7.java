import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {

        //Question 2:
        System.out.println("Question 2:");
        double sum = 0;
        double i = 1;
        for(int j = 3; j<=99; j+=2) {
            sum+=(i/j);
            i+=2;
        }
        System.out.printf("%s%.2f", "Summation = ", sum);

        //Question 3:
        System.out.println("\n\nQuestion 3:");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer greater than 15: ");

        int num = sc.nextInt();
        while(num <= 15) {
            System.out.print("Integer be greater than 15. Try again: ");
            num = sc.nextInt();
        }

        int count = 0;
        for(int k = 15; k<=num; k++) {
            if(k%2 == 0) {
                count++;
            }
        }
        System.out.println("Count = " + count);

        //Question 4
        System.out.println("\nQuestion 4: ");
        int num1 = 25;
        int num2 = 34;

        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = sc.nextInt();

        int tries = 0;
        while(tries < 2 && answer != (num1 + num2)) {
            tries++;
            System.out.println("Incorrect. You have " + (3 - tries) + " more chance(s).");
            System.out.print("What is " + num1 + " + " + num2 + "? ");
            answer = sc.nextInt();
        }
        if(answer == (num1+num2)) {
            System.out.println("Great job!!");
        } else {
            System.out.println(":( Sorry! You ran out of chances. The answer was " + (num1 + num2) + "!");
        }
    }
}
